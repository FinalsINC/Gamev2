package game.tetris

public class Equation {
	int firstValue;
	int secondValue;
	int operation;
	String equationString;

	public Equation(int first, int second, int op) {
		firstValue = first;
		secondValue = second;
		operation = op;
		equationString = getEqString(first,second,op);
	}

	public int getFirstValue() {
		return firstValue;
	}

	public int getSecondValue() {
		return secondValue;
	}

	public int getOperation() {
		return operation;
	}
	
	public String getEquationString() {
	  return equationString;
	}
	
	private String getEqString(int first, int second, int op) {
	  String eq = "";
		eq.concat(Integer.toString(first));
		if(op==0)
			eq.concat("+");
		else if(op==1)
			eq.concat("-");
		else if(op==2)
			eq.concat("*");
		else
			eq.concat("/");
		eq.concat(Integer.toString(second));
	}
}
