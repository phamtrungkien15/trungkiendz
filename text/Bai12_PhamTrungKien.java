import java.util.Scanner;

public class Bai12_PhamTrungKien {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("vui long nhap kich thuoc mang: ");
	 System.out.println("nhap so dong: ");
	 int m = sc.nextInt();
	 System.out.println("nhap so cot: ");
	 int n = sc.nextInt();
	 int matrix[][] = new int[m][n];
	 
	 for(int i = 0 ; i < m ; i++) {
		 for(int j = 0 ; j < n ; j++) {
			System.out.println("nhap phan tu matrix[" + i + "]" + "[" + j + "]= ");
			matrix[i][j] = sc.nextInt();
		 }
}
	 for(int i = 0 ; i < m ; i++) {
		 for(int j = 0 ; j < n ; j++) {
			 System.out.print(matrix[i][j]+ " ");
		 }
		 System.out.println("");
	 }
	 int max = matrix[0][0];
	 for(int i = 0 ; i < m ; i++) {
		 for (int j = 0 ; j < n ; j++) {
			 if(max < matrix[i][j]) {
				 max = matrix[i][j];
			 }	 
		 }
	 }
	System.out.println("vay gia tri max = " + max); 
	System.out.println("em cam on co giao da check !");
}
}