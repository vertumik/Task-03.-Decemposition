//15. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, 
//элементами которого являются числа, сумма цифр которых равна К и которые не большее N.

package by.htp.les04.main;

public class Task15 {
	
	int k;
	int n;
	
	void setNum(int _k, int _n) {
		k = _k;
		n = _n;
	}
	
	void setArray() {
		int[] array = new int[k*n];
		int i;
		for (i = 0; i < 1000; i++) {
			int a = i % 10;
			int b = (i / 10) % 10;
			int c = ((i / 10) / 10) % 10;
			int d = a + b + c;
			if ((d == k) && (d < n)) {
				array[i] = i;
				System.out.println(array[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		Task15 met = new Task15();
		met.setNum(23, 45);
		met.setArray();
	}

}
