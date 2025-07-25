package transformer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import com.google.common.base.CaseFormat;

import ca.uwo.goal.goalDSL.Actor;
import ca.uwo.goal.goalDSL.Contribution;
import ca.uwo.goal.goalDSL.ContributionType;
import ca.uwo.goal.goalDSL.DecompositionType;
import ca.uwo.goal.goalDSL.Dependency;
import ca.uwo.goal.goalDSL.Goal;
import ca.uwo.goal.goalDSL.GoalTaskElement;
import ca.uwo.goal.goalDSL.IntentionalElement;
import ca.uwo.goal.goalDSL.Root;
import ca.uwo.goal.goalDSL.Task;

public class GoalModelTransformVisitor {
	
	List<GoalTaskElement> decompositionNodes = new ArrayList<GoalTaskElement>();
	List<Contribution> contributions = new ArrayList<Contribution>();
	HashMap<GoalTaskElement, List<GoalTaskElement>> parent2children = new HashMap<GoalTaskElement, List<GoalTaskElement>>();
	
	List<String> allGoalTaskElements = new ArrayList<String>();
	
	public String visitRoot(Root root) {

		List<Actor> actors = root.getActors();
		List<Dependency> dependencies = root.getDependencies();
		
		StringBuilder contentString = new StringBuilder();
		contentString.append("abstract sig Goal{}\n");
		contentString.append("abstract sig Task{}\n");
		
		for(Actor actor: actors) {
			List<IntentionalElement> intentionalElements = actor.getIntentionalElements();
			for(IntentionalElement intentionalElement: intentionalElements) {
				if (intentionalElement instanceof GoalTaskElement) {
					GoalTaskElement goalTaskElement = (GoalTaskElement) intentionalElement;
					addParent(goalTaskElement);
					contentString.append(transformRoot(goalTaskElement));
					contentString.append(transformGoalTree());
					//contentString.append(goalTaskElement.accept(this));
				}
			}
			for(Contribution contribution : actor.getContribution())
				contributions.add(contribution);
		}
		
		//contentString.append(transformDecompositionLinks());
		contentString.append(transformDecompositionRules());
		contentString.append(transformContributionRules());
		return contentString.toString();
	}
	
	public String transformRoot(GoalTaskElement root) {
		
		StringBuilder contentString = new StringBuilder();
		contentString.append("one sig "+root.getName()+" extends Goal{}\n\n");
		return contentString.toString();
	}
	
	public String transformGoalTree() {
		
		StringBuilder contentString = new StringBuilder();
		
		for(GoalTaskElement goalTaskElement: parent2children.keySet()) {
			
			List<GoalTaskElement> goals = new ArrayList<GoalTaskElement>();
			List<GoalTaskElement> tasks = new ArrayList<GoalTaskElement>();
			for(GoalTaskElement child: goalTaskElement.getChilldren()) {
				if(child instanceof Goal)
					goals.add(child);
				else tasks.add(child);
			}
			if(!goals.isEmpty()) {
				contentString.append("lone sig ");
				for(GoalTaskElement goal: goals) {
					contentString.append(goal.getName());
					allGoalTaskElements.add(goal.getName());
					contentString.append(", ");
				}
				contentString.delete(contentString.length()-2, contentString.length());
				contentString.append(" extends Goal{\n");
				contentString.append("    parent: "+goalTaskElement.getName()+"\n}\n");
			}
			if(!tasks.isEmpty()) {
				contentString.append("lone sig ");
				for(GoalTaskElement task: tasks) {
					contentString.append(task.getName());
					allGoalTaskElements.add(task.getName());
					contentString.append(", ");
				}
				contentString.delete(contentString.length()-2, contentString.length());
				contentString.append(" extends Task{\n");
				contentString.append("    parent: "+goalTaskElement.getName()+"\n}\n");
			}
		}
		return contentString.toString();
	}
	
//	@Override
//	public String visit(GoalTaskElement goalTaskElement) {
//
//		StringBuilder contentString = new StringBuilder();
//		if(goalTaskElement.getParent()!=null) {
//			contentString.append("lone sig ");
//		}	else contentString.append("one sig ");
//		
//		if(goalTaskElement instanceof Goal) {
//			Goal goal = (Goal) goalTaskElement;
//			contentString.append(goal.getName());
//			contentString.append(" extends Goal{\n");
//		}else {
//			Task task = (Task) goalTaskElement;
//			contentString.append(task.getName());
//			contentString.append(" extends Task{\n");
//		}
//		if(goalTaskElement.getChilldren().isEmpty()) {
//			contentString.delete(contentString.length()-1, contentString.length());
//			contentString.append("}\n");
//			return contentString.toString();
//		}else 
//			decompositionNodes.add(goalTaskElement);
//		
//		for(GoalTaskElement child: goalTaskElement.getChilldren()) {
//			String childName = child.getName();
//			String childNameLowercased = childName.substring(0,1).toLowerCase()+childName.substring(1);
//			contentString.append("	"+childNameLowercased+": ");
//			contentString.append("lone ");
//			contentString.append(childName+",\n");
//		}
//		contentString.delete(contentString.length()-2, contentString.length()-1);
//		contentString.append("}\n");
//		for(GoalTaskElement child: goalTaskElement.getChilldren()) {
//			contentString.append(child.accept(this));
//		}
//		
//		return contentString.toString();
//	}
	
	private String transformDecompositionLinks() {

		StringBuilder contentString = new StringBuilder();
		contentString.append("fact DecompositionLinks{\n");
		for(GoalTaskElement parent: decompositionNodes) {
			for(GoalTaskElement child: parent.getChilldren()) {
				String childName = child.getName();
				String childNameLowercased = childName.substring(0,1).toLowerCase()+childName.substring(1);
				contentString.append(parent.getName()+"."+childNameLowercased+" = "+childName+"\n");
			}
		}
		contentString.append("}\n");
		return contentString.toString();
	}

	private String transformDecompositionRules() {
		
		StringBuilder contentString = new StringBuilder();
		contentString.append("fact DecompositionRules{\n");
		
		for(GoalTaskElement parent: parent2children.keySet()) {
			
			boolean first = true;
			for(GoalTaskElement child: parent.getChilldren()) {
				
				if(first) {
					contentString.append("one ");
					first = false;
				}
				else {
					if(parent.getDecompositionType()==DecompositionType.AND)
						contentString.append(" and one ");
					else contentString.append(" or one ");
				}
				contentString.append(child.getName());
			}
			contentString.append(" iff one "+parent.getName()+"\n");
			//contentString.append(" else no "+parent.getName()+"\n");
		}
		
		contentString.append("}\n");
		return contentString.toString();
		
	}
	
	private String transformContributionRules() {

		StringBuilder contentString = new StringBuilder();
		contentString.append("fact ContributionRules{\n");
		for(Contribution contribution: contributions) {
			List<GoalTaskElement> targets = contribution.getDest();
			switch (contribution.getContributionType()) {
			case MAKE: {
				contentString.append("one ");
				contentString.append(contribution.getSrc().getName());
				contentString.append(" implies");
				for(GoalTaskElement goalTaskElement: targets)
					contentString.append(" one "+ goalTaskElement.getName());
				contentString.append("\n");
				break;
			}
			case BREAK:{
				contentString.append("one ");
				contentString.append(contribution.getSrc().getName());
				contentString.append(" implies");
				for(GoalTaskElement goalTaskElement: targets)
					contentString.append(" no "+ goalTaskElement.getName());
				contentString.append("\n");
				break;
			}
			case NEGATION_MAKE:{
				contentString.append("no ");
				contentString.append(contribution.getSrc().getName());
				contentString.append(" implies");
				for(GoalTaskElement goalTaskElement: targets)
					contentString.append(" one "+ goalTaskElement.getName());
				contentString.append("\n");
				break;
			}
			case NEGATION_BREAK:{
				contentString.append("no ");
				contentString.append(contribution.getSrc().getName());
				contentString.append(" implies");
				for(GoalTaskElement goalTaskElement: targets)
					contentString.append(" no "+ goalTaskElement.getName());
				contentString.append("\n");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected contribution type: " + contribution.getContributionType());
			}
		}
		contentString.append("}\n");
		return contentString.toString();
	}
	
	private void addParent(GoalTaskElement goalTaskElement) {
		
		if(goalTaskElement.getChilldren().isEmpty())
			return;
		
		List<GoalTaskElement> children = new ArrayList<GoalTaskElement>();
		
		for(GoalTaskElement child: goalTaskElement.getChilldren()) {
			child.setParent(goalTaskElement); 
			children.add(child);
		}
		parent2children.put(goalTaskElement, children);
		for(GoalTaskElement child: goalTaskElement.getChilldren())
			addParent(child);
	}
	
}
