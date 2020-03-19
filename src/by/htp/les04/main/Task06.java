//6. Вычислить площадь правильного шестиугольника со стороной а, 
//используя метод вычисления площади треугольника.

package by.htp.les04.main;

public class Task06 {
	int a;
	
	void sHex(int a) {
		double s;
		s = (Math.sqrt(3) * a * a) / 4;
		s = s * 6;
		System.out.print(s);
	}

	public static void main(String[] args) {
		Task06 met = new Task06();
		met.sHex(4);

	}

}
