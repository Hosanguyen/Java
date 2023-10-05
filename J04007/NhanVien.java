package J04007;
public class NhanVien{
    private String maNV, name, gender, dob, address, maSoThue, ngayKyHopDong;
    public NhanVien(String name, String gender, String dob, String address, String maSoThue, String ngayKyHopDong)
    {
        maNV = "00001";
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.maSoThue = maSoThue;
        this.ngayKyHopDong = ngayKyHopDong;
    }
    public String toString()
    {
        return maNV + " " + name + " " + gender + " " + dob + " " + address + " " + maSoThue + " " + ngayKyHopDong;
    }
}