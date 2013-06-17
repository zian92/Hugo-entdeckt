package de.hugo.hugo_entdeckt.data;

public class QestionGuess extends QuizQuestion {

	protected int tolerance;

	public QestionGuess(String question, int value, int tolerance) {
		super(question, value);
		this.tolerance = tolerance;
	}

	@Override
	public boolean checkSolution(int answer) {
		return ((answer - this.tolerance) <= this.solution || (answer + tolerance) >= this.solution) ? true : false;
	}

}
