package J07045;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private String ma, name, donGia, phiPhucVu;
    public LoaiPhong(String vb)
    {
        String[] token = vb.split(" ");
        this.ma = token[0];
        this.name = token[1];
        this.donGia = token[2];
        this.phiPhucVu = token[3];
    }
    public String getName()
    {
        return this.name;
    }
    @Override
    public int compareTo(LoaiPhong o)
    {
        return this.getName().compareTo(o.getName());
    }
    @Override
    public String toString()
    {
        return ma + " " + name + " " + donGia + " " + phiPhucVu;
    }
}
