package by.epam.geometric_figure.view;

import by.epam.geometric_figure.entity.*;
import by.epam.geometric_figure.logic.*;

public class TriangleView {
	public void print(TriangleTops t) {

		System.out.println("Вершина треуголника: " + "X =" + t.getX() + "; " + "Y= " + t.getY());
	}

	public void print(Triangle t, TriangleLogic l) {

		System.out.println("Площадь= " + l.square(t));
		System.out.println("Периметр= " + l.perimetr(t));
		System.out.println("Пересечение медиан в точке= " + l.median(t));
	}

	public void sides(Triangle t) {
		System.out.println("Стороны треуголника равны: " + "a= " + TriangleTops.distance(t.getA(), t.getB()) + " b= "
				+ TriangleTops.distance(t.getB(), t.getC()) + " c= " + TriangleTops.distance(t.getA(), t.getC()));
	}

}
