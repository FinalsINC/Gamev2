package game.tetris;

import java.util.Random;

public class MediumEquations implements EquationGenerator {

	public Equation newEquation() {
		int first = 0, second = 0, op = 0;
		Random rand = new Random();
		do {
			first = rand.nextInt(100);
			second = rand.nextInt(10);
			op = rand.nextInt(2) + 2;
		} while (checkValidity(first, second, op) == false);
		return new Equation(first, second, op);
	}

	private boolean checkValidity(int first, int second, int op) {
		switch (op) {
		case 2:
			if (first * second >= 100)
				return false;
			else
				return true;
		case 3:
			if (first % second != 0)
				return false;
			else
				return true;
		default:
			return false;
		}
	}
}
