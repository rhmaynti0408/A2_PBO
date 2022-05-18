/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest4;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public abstract class Akesoris_1 extends Produk {
    private String  tipe;

    public Akesoris_1(String tipe, String jenis, String nama, int harga, String ukuran, int id) {
        super(nama, harga, ukuran, id);
        this.tipe = tipe;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    static void list_data(ArrayList<Produk> ListProduk){
        System.out.println("===List Aksesoris iBox===");
        System.out.println("No ID Nama\t\tUkuran\t\t\tHarga");
        for(int i=0;i<ListProduk.size();i++){
            System.out.println((i+1)+" "+ListProduk.get(i).getId()+" "+ListProduk.get(i).getNama()+"\t\t"+ListProduk.get(i).getUkuran()+"\t\t"+ListProduk.get(i).getHarga());
        }
        System.out.println("======================");
    }
}
