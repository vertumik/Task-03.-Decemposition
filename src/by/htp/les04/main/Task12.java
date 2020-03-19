//12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. 
//Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.

package by.htp.les04.main;

public class Task12 {
	int x;
	int y;
	
	int sQuad(int x, int y) {
		int s = x * y;
		return s;
	}
	
	

	public static void main(String[] args) {
		Task12 met = new Task12();
		int s = met.sQuad(3, 9);
		System.out.println(s);

	}

}
