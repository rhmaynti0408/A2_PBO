/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posstest6;
import posttest4.*;
import posttest3.*;
import posttest2.*;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class Main_1 {

    /**
     * @param args the command line arguments
     */
    //metohod interface
    public static void main(String[] args) {
        phone3 a12 = new phone3 ();
        a12.menyala();
        a12.matikan();
        a12.restar();
        a12.kunciLayar();
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System. in);
        ArrayList<Produk> ListProduk = new ArrayList<>();
        int id=0;
        while (true){
            System.out.println("====== DATA PRODUK IBOX ======");
            System.out.println("(1). Daftar Produk Baru");
            System.out.println("(2). Lihat List Produk");
            System.out.println("(3). Ubah Data Produk");
            System.out.println("(4). Hapus Data Produk");
            System.out.println("(5). Keluar");
            System.out.println("============================");
            System.out.println("Pilih Option (Angka) : ");int a=method.GetInt();
            if (a!=5){
                if(a==1){
                    int i;
                    
                    System.out.println("==== LIST PRODUK IBOX ====");
                    
                    System.out.print("Nama\t: ");String Nama=(input.nextLine());
                    System.out.print("Harga\t: ");int Harga =(method.GetInt());
                    System.out.print("Ukuran\t: ");String Ukuran = (input.nextLine());
                    ListProduk.add(new Produk(Nama,Harga,Ukuran,id+1));
                    id++;
                }
                else if(a==2){
                    method.list_data(ListProduk);
                }
                else if(a==3){
                    method.list_data(ListProduk);
                    
                    System.out.println("!!Diharapkan Pencarian Data Produk Sesuai ID Produk!!");
                    System.out.print(">>");int cari = method.GetInt();
                    for (int i=0;i<ListProduk.size();i++){
                        if(cari==ListProduk.get(i).getId()){
                            System.out.println("CEK ID = "+ListProduk.get(i).getId());
                            System.out.println("===== Data Sebelumnya =====");
                            System.out.println("ID\t\t: "+ListProduk.get(i).getId());
                            System.out.println("Nama\t: "+ListProduk.get(i).getNama());
                            System.out.println("Ukuran\t: "+ListProduk.get(i).getUkuran());
                            System.out.println("Harga\t: "+ListProduk.get(i).getHarga());
                            ListProduk.remove(i);
//                            id--;
                            //Mengisi data baru menggunakan constructor
                            System.out.println("===== Data Baru =====");
                            System.out.println("ID\t\t: "+id);
                            System.out.print("Nama\t: ");String nama = input.nextLine();
                            System.out.print("Harga\t: ");int harga = method.GetInt();
                            System.out.print("Ukuran\t: ");String ukuran = input.nextLine();
                            
                            Cons_Produk data_baru = new Cons_Produk(nama,harga,ukuran,id);
                            
                                                      
                            ListProduk.add(new Produk(nama,harga,ukuran,id));
                        }
                    }
                    System.out.println("==== LIST PRODUK IBOX ====");
                    System.out.println("No ID Nama\t\tUkuran\t\t\tHarga");
                    for(int i=0;i<ListProduk.size();i++){
                        System.out.println((i+1)+" "+ListProduk.get(i).getId()+" "+ListProduk.get(i).getNama()+"\t\t"+ListProduk.get(i).getUkuran()+"\t\t"+ListProduk.get(i).getHarga());
                    }
                    System.out.println("======================");
                }
                else if (a==4){
                    method.list_data(ListProduk);
                    
                    System.out.println("!!Pencarian Data Produk Sesuai ID Produk!!");
                    System.out.print(">>");int cari = method.GetInt();
                    for (int i=0;i<ListProduk.size();i++){
                        if(cari==ListProduk.get(i).getId()){
                            ListProduk.remove(i);
                            id--;
                        }
                    }
                    method.list_data(ListProduk);
                }
                else if (a==5){
                    System.out.println("=== System Shut ===");
                    System.exit(1);
                }
            }
        }
    }
}
