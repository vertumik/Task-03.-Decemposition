//4. Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.

package by.htp.les04.main;

public class Task04 {
	int a;
	int b;
	int c;
	
	void nokCalc(int a, int b, int c) {
		int nod;
		if ((a < b) && (a < c)) {
			nod = a;
		}else if ((b < a) && (b < c)){
			nod = b;
		}else {
			nod = c;
		}
		
		while ((a % nod != 0) || (b % nod != 0) || (c % nod != 0)) {
			nod--;
		}
		int nok;
		nok = (a * b * c) / nod;
		System.out.println(nok);
	}

	public static void main(String[] args) {
		Task04 nok = new Task04();
		nok.nokCalc(21, 42, 84);

	}

}
