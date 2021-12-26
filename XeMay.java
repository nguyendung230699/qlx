package quanlyxe;

public class XeMay extends PTGT {
	private double congSuat;

	

	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}

	public double getCongSuat() {
		return this.congSuat;
	}

	public XeMay() {
	
	}
	

	public XeMay(String hangSX, int namSX, double gia, String mau, double congSuat) {
		super(hangSX, namSX, gia, mau);
		this.congSuat = congSuat;
	}

	public void hienThongTin() {
		super.hienThongTin();
		System.out.println("Cong Suat: " + this.congSuat);
	}
}
