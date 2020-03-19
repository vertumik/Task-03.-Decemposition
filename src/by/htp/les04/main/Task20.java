//20. Из заданного числа вычли сумму его цифр. 
//Из результата вновь вычли сумму его цифр и т.д. 
//Сколько таких действий надо произвести, чтобы получился нуль? 
//Для решения задачи использовать декомпозицию.

package by.htp.les04.main;

public class Task20 {
	
	public static void main(String[] args) {
		int x = 125;
		int n = x;
		int sum = 0;
		int i = 0;
		while (x > 0) {
			i = i + x % 10;
			x = x / 10;
		}
		sum = i;
		
		int k = 0;
		while (n > 0) {
			n = n - sum;
			k++;
		}
		System.out.print(k);
		
		

	}

}
