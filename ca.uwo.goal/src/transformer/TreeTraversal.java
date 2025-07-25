package transformer;

import ca.uwo.goal.goalDSL.Root;

public class TreeTraversal {

	public static void transform(Root root) {
		
		GoalModelTransformVisitor visitor = new GoalModelTransformVisitor();
		String finalString = visitor.visitRoot(root);
		System.out.println(finalString);
	}
}
