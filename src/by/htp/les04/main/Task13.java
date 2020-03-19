//13. Дано натуральное число N. Написать метод(методы) для формирования массива, 
//элементами которого являются цифры числа N.

package by.htp.les04.main;

public class Task13 {
	int n;
	
	public void setN(int x) {
		if (x > 0) {
			n = x;
		}else {
			System.out.println("Введите значение больше 0");
		}
	}
	
	int calc() {
		int m = n;
		int k = 0;
		while (m > 0) {
			m = m / 10;
			k++;
		}
		return k;
	}
	void array() {
		int[] a = new int[calc()];
		int i;
		for (i = 0; i < a.length; i++) {
			a[i] = n % 10;
			n = n / 10;
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		Task13 met = new Task13();
		met.setN(2344557);
		met.array();
	}

}
