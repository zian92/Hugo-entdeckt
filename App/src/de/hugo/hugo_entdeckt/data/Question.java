/**
 * 
 */
package de.hugo.hugo_entdeckt.data;

/**
 * @author Jonas
 * 
 */
public class Question extends QuizQuestion {

	protected Answer answers[] = new Answer[4];
	protected int topicID = 0;

	public Question(String question) {
		super(question);
	}

	public Question(String question, Answer[] answers, int solution) {
		super(question, solution);
		if (answers.length <= 4) this.answers = answers;
		this.solution = solution;
	}

	@Override
	public boolean checkSolution(int answer) {
		return (answer == this.solution) ? true : false;
	}

}
