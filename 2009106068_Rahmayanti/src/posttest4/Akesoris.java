/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest4;

/**
 *
 * @author ASUS
 */
public class Akesoris extends Produk {
    private String  tipe, jenis;

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public Aksesoris( String nama, int harga, String ukuran, int id, String tipe, String jenis) {
        super(nama, harga, ukuran, id);
        this.tipe = tipe;
        this.jenis = jenis;
    }
    
    
    
}
