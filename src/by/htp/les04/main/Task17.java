//17. Натуральное число, в записи которого n цифр, называется числом Армстронга, 
//если сумма его цифр, возведенная в степень n, равна самому числу. 
//Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

package by.htp.les04.main;

public class Task17 {
	int k;
	
	public void setK(int _k) {
		k = _k;
	}
	
	public int getK() {
		return k;
	}
	
	int step(int x) {
		int count = 0;
		while (x > 0) {
			x = x / 10;
			count++;
		}
		return count;
	}
		
	int sum(int x) {
		int sum = 0;
		while (x > 0) {
			int i = x % 10;
			sum = sum + i;
			x = x / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Task17 met = new Task17();
		met.setK(530);
		int pow;
		int num;
		int[] a = new int[met.getK()];
		for (int i = 1; i < met.getK(); i++) {
			a[i] = i;
			pow = met.step(a[i]);
			num = met.sum(a[i]);
			if (Math.pow(num, pow) == a[i]) {
				System.out.println("Число Армстронга = " + a[i]);
			}
		}
		
		
		
	}

}
