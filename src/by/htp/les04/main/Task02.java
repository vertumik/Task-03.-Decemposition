//2. Написать метод(методы) для нахождения наибольшего общего делителя и 
//наименьшего общего кратного двух натуральных чисел:

package by.htp.les04.main;

public class Task02 {
	int a;
	int b;
	
	void nodCalc(int a, int b){
		int nod;
		if (a < b) {
			nod = a;
		}else {
			nod = b;
		}
		
		while ((a % nod != 0) || (b % nod != 0)) {
			nod--;
		}
		int nok;
		nok = (a * b) / nod;
		System.out.println(nok);
	}

	public static void main(String[] args) {
		Task02 nok = new Task02();
		nok.nodCalc(34, 45);
		

	}

}
