package by.epam.geometric_figure.entity;

public class TriangleTops {
	private double x;
	private double y;

	public TriangleTops(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public TriangleTops() {

	}

	public static double distance(TriangleTops a, TriangleTops b) {

		double dx = b.x - a.x;
		double dy = b.y - a.y;

		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		TriangleTops other = (TriangleTops) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return " X=" + x + ", Y=" + y;
	}
}
