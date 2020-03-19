//9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

package by.htp.les04.main;

public class Task09 {
	int a;
	int b;
	int c;
	
	int nod (int a, int b, int c) {
		int nod;
		if ((a < b) && (a < c)) {
			nod = a;
		}
		else if ((b < a) && (b < c)) {
			nod = b;
		}
		else {
			nod = c;
		}

		while ((a % nod != 0) || (b % nod != 0) || (c % nod != 0)) {
			nod--;
		}
		return nod;
	}

	public static void main(String[] args) {
		Task09 met = new Task09();
		int x = met.nod(32, 45, 21);
		if (x == 1) {
			System.out.println("Данные числа взаимно простые");
		}else {
			System.out.println("Данные числа не взаимно простые");
		}

	}

}
