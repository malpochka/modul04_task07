package by.epam.geometric_figure.entity;

public class Triangle {
	private TriangleTops a;
	private TriangleTops b;
	private TriangleTops c;

	public Triangle(TriangleTops a, TriangleTops b, TriangleTops c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {

	}

	public TriangleTops getA() {
		return a;
	}

	public void setA(TriangleTops a) {
		this.a = a;
	}

	public TriangleTops getB() {
		return b;
	}

	public void setB(TriangleTops b) {
		this.b = b;
	}

	public TriangleTops getC() {
		return c;
	}

	public void setC(TriangleTops c) {
		this.c = c;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		result = prime * result + ((c == null) ? 0 : c.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Стороны треугольника равны: a=" + TriangleTops.distance(a, b) + ", b=" + TriangleTops.distance(b, c)
		+ ", c=" + TriangleTops.distance(a, c);

	}
}
