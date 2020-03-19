//3. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

package by.htp.les04.main;

public class Task03 {
	int a;
	int b;
	int c;
	int d;
	
	void nodCalc(int a, int b, int c, int d) {
		int nod;
		if ((a < b) && (a < c) && (a < d)) {
			nod = a;
		}
		else if ((b < a) && (b < c) && (b < d)) {
			nod = b;
		}
		else if ((c < a) && (c < b) && (c < d)) {
			nod = c;
		}
		else {
			nod = d;
		}
		while ((a % nod != 0) || (b % nod != 0) || (c % nod != 0) || (d % nod != 0)) {
			nod--;
		}
		System.out.println(nod);
	}
	

	public static void main(String[] args) {
		Task03 nod = new Task03();
		nod.nodCalc(21, 21, 42, 42);

	}

}
