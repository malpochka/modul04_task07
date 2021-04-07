package by.epam.geometric_figure.logic;

import java.util.Scanner;

import by.epam.geometric_figure.entity.Triangle;
import by.epam.geometric_figure.entity.TriangleTops;

public class TriangleLogic {

	public double enterFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println(message);
		}

		return sc.nextDouble();
	}

	public double square(Triangle t) {
		double ab = TriangleTops.distance(t.getA(), t.getB());
		double bc = TriangleTops.distance(t.getB(), t.getC());
		double ac = TriangleTops.distance(t.getA(), t.getC());
		double p = (ab + bc + ac) / 2;

		return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
	}

	public double perimetr(Triangle t) {

		double ab = TriangleTops.distance(t.getA(), t.getB());
		double bc = TriangleTops.distance(t.getB(), t.getC());
		double ac = TriangleTops.distance(t.getA(), t.getC());

		return ab + bc + ac;
	}

	public TriangleTops median(Triangle t) {

		TriangleTops M = new TriangleTops((t.getA().getX() + t.getB().getX() + t.getC().getX()) / 3,
				(t.getA().getY() + t.getB().getY() + t.getC().getY()) / 3);

		return M;
	}
}
