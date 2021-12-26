package quanlyxe;

public class XeDap extends PTGT {
	private String loaiXe;

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public XeDap() {

	}

	public XeDap(String hangSX, int namSX, double gia, String mau, String loaiXe) {
		super(hangSX, namSX, gia, mau);
		this.loaiXe = loaiXe;
	}
	@Override
	public void hienThongTin() {
		// TODO Auto-y method stub
		super.hienThongTin();
		System.out.println("Loai xe : "+ this.loaiXe);
	}

}
