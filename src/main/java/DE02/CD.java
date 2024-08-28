/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DE02;

/**
 *
 * @author ADMIN
 */
public class CD {
    private String maso;
    private String tencd;
    private String casi;
    double giaban;
    int namphathanh;

    public CD(String maso, String tencd, String casi, double giaban, int namphathanh) {
        this.maso = maso;
        this.tencd = tencd;
        this.casi = casi;
        this.giaban = giaban;
        this.namphathanh = namphathanh;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getTencd() {
        return tencd;
    }

    public void setTencd(String tencd) {
        this.tencd = tencd;
    }

    public String getCasi() {
        return casi;
    }

    public void setCasi(String casi) {
        this.casi = casi;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getNamphathanh() {
        return namphathanh;
    }

    public void setNamphathanh(int namphathanh) {
        this.namphathanh = namphathanh;
    }

    @Override
    public String toString() {
        return "CD{" + "Maso=" + maso + ", Tencd=" + tencd + ", Casi=" + casi + ", Giaban=" + giaban + ", Namphathanh=" + namphathanh + '}';
    }
    
}
