import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bai11_PhamTrungKien {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("vui long nhap kich thuoc mang: ");
		n = sc.nextInt();
		int kien[] = new int[n];

		for(int i = 0 ; i < n ; i++) {
			System.out.println("nhap phan tu kien[" + i + "]= ");
			kien[i] = sc.nextInt();		}

		System.out.println("mang ban đau la: " + Arrays.toString(kien));
		Arrays.sort(kien);
		System.out.println("mang sau khi sap xep : " + Arrays.toString(kien));
        System.out.println("em csm on co giao da check !");
	}
}
