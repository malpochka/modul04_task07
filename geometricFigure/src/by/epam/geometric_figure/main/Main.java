package by.epam.geometric_figure.main;

import by.epam.geometric_figure.entity.*;
import by.epam.geometric_figure.logic.TriangleLogic;
import by.epam.geometric_figure.view.*;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисленя площади,
 *  периметра и точки пересечения медиан. */

public class Main {

	public static void main(String[] args) {
		double x;
		double y;
		
		TriangleLogic logic = new TriangleLogic();
		
		x=logic.enterFromConsole("Введите х");
		y=logic.enterFromConsole("Введите y");

		TriangleTops A = new TriangleTops(x, y);
		TriangleTops B = new TriangleTops(8, 11);
		TriangleTops C = new TriangleTops(10, 7);

		
		TriangleView view = new TriangleView();

		view.print(A);
		view.print(B);
		view.print(C);

		System.out.println();

		Triangle triangle = new Triangle(A, B, C);

		logic.square(triangle);
		logic.perimetr(triangle);
		logic.median(triangle);

		view.sides(triangle);
		System.out.println();

		view.print(triangle, logic);

	}
}
