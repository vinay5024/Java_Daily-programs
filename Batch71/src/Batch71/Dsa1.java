package Batch71;

public class Dsa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 11, 12, 13, 14, 15 };
		int n = arr.length;
		int arr2[] = new int[n];


			for (int i = 0; i < n; i++) {
				int rev1 = 0;
				int n1 = arr[i];
				while (n1 > 0) {

					int rem = n1 % 10;
					rev1 = rev1 * 10 + rem;
					n1 = n1 / 10;
				}
				arr2[i] = rev1;

			}
		for(int i :arr2) {
			System.out.println(i);
		}

	}

}
