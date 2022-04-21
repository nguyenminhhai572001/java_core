package version1_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so luong mang: ");
		int n = sc.nextInt();
		
		ArrayList<SinhVien> sinhvien = new ArrayList<>();
		for(int i = 0; i<n; i++) {
			SinhVien svTemp=new SinhVien();
			svTemp.nhap();
			sinhvien.add(svTemp);
		}
		System.out.println("Xuat sinh vien");
		for(int i = 0; i<n; i++) {
			sinhvien.get(i).xuat();
		}
	}
}
