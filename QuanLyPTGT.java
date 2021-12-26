package quanlyxe;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyPTGT {
	private ArrayList<PTGT> ds = new ArrayList<PTGT>();

	public static void main(String[] args) {
		QuanLyPTGT PT = new QuanLyPTGT();
		Scanner sc = new Scanner(System.in);
		PT.nhapDangKiPhuongTien(sc);
		PT.timKiemTheoMau(sc);
		PT.timKiemTheoNamSX(sc);
	}

	public PTGT nhapOto(Scanner sc) {
		System.out.print("Nhap hang san xuat: ");
		String hangSx = sc.nextLine();

		System.out.print("Nhap nam san xuat:");
		int namSX = sc.nextInt();

		System.out.print("Nhap gia xe:");
		double gia = sc.nextDouble();
		sc.nextLine();

		System.out.print("Nhap mau xe:");
		String mau = sc.nextLine();

		System.out.print("Nhap so cho ngoi:");
		int soCho = sc.nextInt();
		sc.nextLine();

		System.out.print("Nhap kieu dong co:");
		String kdc = sc.nextLine();

		return new Oto(hangSx, namSX, gia, mau, soCho, kdc);
	}

	public PTGT nhapXeMay(Scanner sc) {
		System.out.print("Nhap hang san xuat: ");
		String hangSx = sc.nextLine();

		System.out.print("Nhap nam san xuat:");
		int namSX = sc.nextInt();

		System.out.print("Nhap gia xe:");
		double gia = sc.nextDouble();
		sc.nextLine();

		System.out.print("Nhap mau xe:");
		String mau = sc.nextLine();

		System.out.print("Nhap Cong Suat:");
		double congSuat = sc.nextDouble();
		sc.nextLine();

		return new XeMay(hangSx, namSX, gia, mau, congSuat);
	}

	public PTGT nhapXeDap(Scanner sc) {
		System.out.print("Nhap hang san xuat: ");
		String hangSx = sc.nextLine();

		System.out.print("Nhap nam san xuat:");
		int namSX = sc.nextInt();

		System.out.print("Nhap gia xe:");
		double gia = sc.nextDouble();
		sc.nextLine();

		System.out.print("Nhap mau xe:");
		String mau = sc.nextLine();

		System.out.print("Nhap loai xe:");
		String loaiXe = sc.nextLine();
		sc.nextLine();

		return new XeDap(hangSx, namSX, gia, mau, loaiXe);
	}

	public void nhapDangKiPhuongTien(Scanner sc) {
		char c;
		int chon = 0;
		while (true) {
			System.out.print("Ban muon nhap loai xe nao (1-XeDap,2-Xemay,3-Oto):");
			chon = sc.nextInt();
			sc.nextLine();
			switch (chon) {
			case 1: {
				ds.add(nhapXeDap(sc));
				break;
			}
			case 2: {
				ds.add(nhapXeMay(sc));
				break;
			}
			case 3: {
				ds.add(nhapOto(sc));
				break;
			}
			default: {
				System.out.println("Moi nhap lai");
				break;
			}
			}
			System.out.println("Ban co muon nhap nua khong: (Y/N)");
			c = sc.nextLine().charAt(0);
			if (c == 'N' || c == 'n')
				break;
		}
	}

	public void timKiemTheoMau(Scanner sc) {
		System.out.print("Nhap mau can tim kiem:");
		String mauTk = sc.nextLine();
		for (int i = 0; i < ds.size(); i++) {
			String mau = ds.get(i).getMau();
			if (mau.equalsIgnoreCase(mauTk))
				ds.get(i).hienThongTin();
		}
	}

	public void timKiemTheoNamSX(Scanner sc) {
		System.out.print("Nhap nam  de tim kiem:");
		int nam = sc.nextInt();
		int tg = 0;
		for (int i = 0; i < ds.size(); i++) {
			tg = ds.get(i).getNamSX();
			if (tg == nam)
				ds.get(i).hienThongTin();
		}
	}

}
