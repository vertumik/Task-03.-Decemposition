//16. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 
//(например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n], 
//где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.

package by.htp.les04.main;

public class Task16 {

	public static void main(String[] args) {
		int n = 5;
		int[] array = new int[n*2+1];
		int i;
		for (i = 2; i <= 2*n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					array[i] = i;
				}
			}
		}
		System.out.println(array[i]);

	}

}
