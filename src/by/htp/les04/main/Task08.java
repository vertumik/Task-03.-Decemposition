//8. Составить программу, которая в массиве A[N] находит второе по величине число 
//(вывести на печать число, которое меньше максимального элемента массива, 
//но больше всех других элементов).

package by.htp.les04.main;

public class Task08 {
	int n;
	
	public void setN(int _n) {
		if (_n > 0) {
			n = _n;
		}else {
			System.out.println("Значение должно быть больше 0!");
		}
	}
	
	void calcArray() {
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100);
		}
		
		int max = 0;
		int min = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (a[i] > min && a[i] < max) {
				min = a[i];
			}
		}
		System.out.println("Второе по величине значение = " + min);
	}

	public static void main(String[] args) {
		Task08 met = new Task08();
		met.setN(29);
		met.calcArray();
		
		
	}

}
