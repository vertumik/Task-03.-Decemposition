//1. Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.

package by.htp.les04.main;

public class Task01 {

	int x1, y1;
	int x2, y2;
	int x3, y3;
	
	void sTriangle() {
		double p1 = x1 - x3;
		double p2 = y2 - y3;
		double p3 = x2 - x3;
		double p4 = y1 - y3;
		double temp = p1 * p2 - p3 * p4;
		double S = 0.5 * Math.abs(temp);
		System.out.println("Площадь треугольника по заданным координатам = " + S);
	}
	public static void main(String[] args) {
		Task01 a = new Task01();
		a.x1 = 1;
		a.y1 = 2;
		a.x2 = 2;
		a.y2 = 4;
		a.x3 = 1;
		a.y3 = 5;
		a.sTriangle();

	}

}
