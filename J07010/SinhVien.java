package J07010;

public class SinhVien {
    private String ma, name, lop, dob;
    private double gpa;
    private static int solg = 0;

    public SinhVien(String name, String lop, String dob, double gpa)
    {
        solg++;
        if(solg<10)
        {
            this.ma = "B20DCCN00" + String.valueOf(solg);
        }
        else
        {
            this.ma = "B20DCCN0" + String.valueOf(solg);
        }
        this.name = name;
        this.lop = lop;
        this.dob = dob;
        if(this.dob.indexOf("/")<2)
        {
            this.dob = "0" +  this.dob;
        }
        if(this.dob.lastIndexOf("/")<5)
        {
            this.dob = this.dob.substring(0, 3) + "0" + this.dob.substring(3);
        }
        this.gpa = gpa;
    }

    @Override
    public String toString()
    {
        return ma + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }

}
