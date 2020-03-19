//14. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

package by.htp.les04.main;

public class Task14 {
	int x;
	int y;
	
	void calc (int x, int y) {
		int count1 = 0;
		int count2 = 0;
		while (x > 0) {
			x = x / 10;
			count1++;
		}
		while (y > 0) {
			y = y / 10;
			count2++;
		}
		if (count1 > count2) {
			System.out.println(count1);
		}else {
			System.out.println(count2);
		}
	}

	public static void main(String[] args) {
		Task14 met = new Task14();
		met.calc(23423, 53445869);

	}

}
