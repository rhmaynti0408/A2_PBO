/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest4;

import posttest3.*;


//posttest 3 enkapsulasi dan setter getter
/**
 *
 * @author ASUS
 */
public abstract class Produk {
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public Produk(String nama, int harga, String ukuran, int id, int hash) {
        this.nama = nama;
        this.harga = harga;
        this.ukuran = ukuran;
        this.id = id;
        this.hash = hash;
    }


    protected String nama; //enkapsulasi
    protected int harga;
    protected String ukuran;
    protected int id;
    protected final int hash;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getUkuran() {
        return ukuran;
    }
}


