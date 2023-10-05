package J04005;

public class ThiSinh {
    private String name;
    private String dob;
    private double p1, p2, p3;
    private double sumPoint;
    public ThiSinh(String name, String dob, double p1, double p2, double p3)
    {
        this.name = name;
        this.dob = dob;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.sumPoint = this.p1 + this.p2 + this.p3;
    }
    public String toString()
    {
        return name + " " + dob + " " + String.format("%.1f", sumPoint);
    }
}
