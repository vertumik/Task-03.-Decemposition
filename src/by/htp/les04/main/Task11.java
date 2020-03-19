//11. Задан массив D. Определить следующие суммы: 
//D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно 
//расположенных элементов массива с номерами от k до m.

package by.htp.les04.main;

public class Task11 {
	int k;
	int m;
	
	void calcArray(int k, int m) {
		int[] d = new int[25];
		for (int i = 0; i < d.length; i++) {
			d[i] = (int)(Math.random()*10);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
