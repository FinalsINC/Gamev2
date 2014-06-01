package game.tetris;

import java.util.Random;

public class HardEquations implements EquationGenerator {

	public Equation newEquation() {
		int first = 0, second = 0, op = 0;
		Random rand = new Random(System.currentTimeMillis());
		do {
			first = rand.nextInt(90)+10;
			second = rand.nextInt(9)+1;
			op = rand.nextInt(4);
		} while (checkValidity(first, second, op) == false);
		return new Equation(first, second, op);
	}

	private boolean checkValidity(int first, int second, int op) {
		switch (op) {
		case 0:
			if (first + second >= 100)
				return false;
			else
				return true;
		case 1:
			if (first < second)
				return false;
			else
				return true;
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
