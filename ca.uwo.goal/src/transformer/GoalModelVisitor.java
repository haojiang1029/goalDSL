package transformer;

import ca.uwo.goal.goalDSL.GoalTaskElement;

public interface GoalModelVisitor {

	String visit(GoalTaskElement goalTaskElement);
}
