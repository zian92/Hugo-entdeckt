package de.hugo.hugo_entdeckt.data;

public abstract class QuizQuestion {
	protected String question;
	protected int solution = 0;

	public QuizQuestion(String question) {

		this.question = question;
	}

	public QuizQuestion(String question, int solution) {
		this(question);
		this.solution = solution;
	};

	public abstract boolean checkSolution(int answer);
}
