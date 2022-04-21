package version1_oop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SinhVien {
	protected String hoTen;
	protected String maSinhVien;
	protected String ngaySinh;
	protected String lopHoc;
	protected double diemHoa;
	protected double diemToan;
	protected double diemLy;
	protected double diemTB;
	
	public SinhVien(String hoTen, String maSinhVien, String ngaySinh, String lopHoc, double diemHoa, double diemToan,
			double diemLy) {
		this.hoTen = hoTen;
		this.maSinhVien = maSinhVien;
		this.ngaySinh = ngaySinh;
		this.lopHoc = lopHoc;
		this.diemHoa = diemHoa;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemTB = (diemHoa + diemToan + diemLy)/3;
	}

	public SinhVien() {
		
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap thong tinh sinh vien: ");
		System.out.println("nhap ho ten sinh vien: ");
		hoTen = sc.nextLine();
		System.out.println("nhap ma sinh vien: ");
		maSinhVien = sc.next();
		System.out.println("nhap ngay sinh sinh vien: ");
		ngaySinh = sc.next();
		System.out.println("nhap lop sinh vien: ");
		lopHoc = sc.next();
		System.out.println("nhap diem hoa: ");
		diemHoa = sc.nextDouble();
		System.out.println("nhap diem toan: ");
		diemToan = sc.nextDouble();
		System.out.println("nhap diem ly: ");
		diemLy = sc.nextDouble();
		diemTB = (diemHoa + diemToan + diemLy)/3;
	}
	
	public String xepLoai() {
		if(diemTB <=10 && diemTB >=9) {
			return ("xuat sac");
		}else if(diemTB<9 && diemTB>=8) {
			return("gioi");
		}else if(diemTB<8 && diemTB>=7) {
			return("kha");
		}else if(diemTB<7 && diemTB>=6) {
			return("trung binh kha");
		}else if(diemTB<6 && diemTB>=5) {
			return("trung binh");
		}else return("yeu");
	}
	
	public void xuat() {
		DecimalFormat df = new DecimalFormat("0.00");
//		System.out.println(hoTen);
//		System.out.println(maSinhVien);
//		System.out.println(ngaySinh);
//		System.out.println(lopHoc);
//		System.out.println(diemHoa);
//		System.out.println(diemToan);
//		System.out.println(diemLy);
		System.out.println("SinhVien [hoTen=" + hoTen + ", maSinhVien=" + maSinhVien + ", ngaySinh=" + ngaySinh + ", lopHoc="
				+ lopHoc + ", diemHoa=" + diemHoa + ", diemToan=" + diemToan + ", diemLy=" + diemLy + ", diemTB="
				+ df.format(diemTB) + " xep loai: " + xepLoai() + "]");
		
	}

	

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getLopHoc() {
		return lopHoc;
	}

	public void setLopHoc(String lopHoc) {
		this.lopHoc = lopHoc;
	}

	public double getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}

	public double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	public double getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}
	
	
	
}
