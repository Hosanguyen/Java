package test_vao_ra;

import java.io.Serializable;

public class SinhVien implements Serializable {
    private String id, name, lop;
    public SinhVien(String id, String name, String lop)
    {
        this.id = id;
        this.name = name;
        this.lop = lop;
    }
    @Override
    public String toString()
    {
        return id + " " + name + " " + lop;
    }
}
