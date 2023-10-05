package J04006;

public class SinhVien {
    private String maSV, hoTen, lop, dob;
    private double gpa;
    public SinhVien()
    {
        maSV = "";
        hoTen = "";
        lop = "";
        dob = null;
        gpa = 0;
    }    
    public SinhVien(String hoTen, String lop, String dob, double gpa)
    {
        this.hoTen = hoTen;
        this.lop = lop;
        if(dob.indexOf("/")<2)
        {
            this.dob = "0" + dob;
        }
        if(this.dob.lastIndexOf("/")<5)
        {
            this.dob = this.dob.substring(0, 3) + "0" + this.dob.substring(3);
        }
        this.gpa = gpa;
        maSV = "B20DCCN001";
    }
    public String toString()
    {
        return maSV + " " + hoTen + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }
}
