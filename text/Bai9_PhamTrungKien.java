import java.util.Scanner;

public class Bai9_PhamTrungKien {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 1 chuoi ky tu gom so, chu thuong va chu in hoa : ");
		String name = sc.nextLine();
		int count = 0,count_1 = 0,count_2 = 0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)>= 'a' && name.charAt(i) <= 'z') {
				count ++;
			}else if(name.charAt(i)>= 'A' && name.charAt(i) <= 'Z') {
				count_1++;
			}else if(name.charAt(i)>= '0' && name.charAt(i) <= '9') {
				count_2++;
			}
		}
		System.out.println("chuoi vua nhap co so ky tu thuong la : "+count);
		System.out.println("chuoi vua nhap co so ky tu in hoa la : "+count_1);
		System.out.println("chuoi vua nhap co so la : "+count_2);
		System.out.println("em cam on co giao da check !");
}
}
