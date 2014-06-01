package game.tetris;

public class Equation {
	int firstValue;
	int secondValue;
	int operation;
	String equationString;
	int answer;

	public Equation(int first, int second, int op) {
		firstValue = first;
		secondValue = second;
		operation = op;
		equationString = getEqString(first,second,op);
		switch(op){
		case 0:
			answer = first + second;
			break;
		case 1:
			answer = first - second;
			break;
		case 2:
			answer = first * second;
			break;
		case 3:
			answer = first / second;
			break;
		}
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
	
	public int getAnswer() {
		return answer;
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
		return eq;
	}
}
