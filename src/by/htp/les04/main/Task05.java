//5. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.

package by.htp.les04.main;

public class Task05 {
	int a;
	int b;
	int c;
	
	void calc(int a, int b, int c) {
		int sum = 0;
		if ((a > b) && (b > c) || (c > b) && (b > a)) {
			sum = a + c;
		}else if ((a > c) && (c > b) || (b > c) && (c > a)) {
			sum = a + b;
		}else if ((b > a) && (a > c) || (c > a) && (a > b)){
			sum = b + c;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Task05 met = new Task05();
		met.calc(5, 4, 6);

	}

}
