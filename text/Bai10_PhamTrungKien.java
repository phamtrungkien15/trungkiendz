import java.util.Scanner;

public class Bai10_PhamTrungKien {
public static void main(String[] args) {
	String chuoi;
	char kyTu;
	int count = 0;
	Scanner sc = new Scanner(System.in);
	
	do {
		System.out.println("vui long nhap 1 chuoi bat ki: ");
	chuoi = sc.next();
	}while(chuoi.length() > 80);
	
	System.out.println("ki tu can dem so lan xuat hien: ");
    kyTu = sc.next().charAt(0);
         for (int i = 0; i < chuoi.length(); i++) {
        if (kyTu == chuoi.charAt(i)) {
            count++;
        }
    }
         
    System.out.println("So lan xuat hien la " + kyTu +
        " trong chuoi " + chuoi + " = " + count);
    System.out.println("em cam on co giao da check !");
}
}
