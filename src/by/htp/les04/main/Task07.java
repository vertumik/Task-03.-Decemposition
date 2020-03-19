//7. На плоскости заданы своими координатами n точек. Написать метод(методы), 
//определяющие, между какими из пар точек самое большое расстояние. 
//Указание. Координаты точек занести в массив.

package by.htp.les04.main;

public class Task07 {
	int n;
	
	void calc(int n) {
		double[] a = new double[n*2];
		for (int i = 0; i < a.length; i++) {
			a[i] = Math.random()*10;
			System.out.println((int)a[i]);
		}
	}
	
	

	public static void main(String[] args) {
		Task07 met = new Task07();
		met.calc(10);

	}

}
