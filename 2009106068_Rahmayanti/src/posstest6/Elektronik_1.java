/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posstest6;

import posttest4.*;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public abstract class Elektronik_1 extends Produk{

    public Elektronik_1(String tipe, String nama, int harga, String ukuran, int id) {
        super(nama, harga, ukuran, id);
        this.tipe = tipe;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    private String tipe;
    public void list_data(){
//        System.out.println("===List Elektronik iBox===");
//        System.out.println("No ID Nama\t\tUkuran\t\tTipe\t\t\tHarga");
  
          System.out.println((id+1)+" "+this.id+" "+this.nama+"\t\t"+this.ukuran+"\t\t"+this.tipe+"\t\t"+this.harga);

//        System.out.println("======================");
    }
}
