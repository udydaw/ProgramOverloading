/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author ACER
 */
public class Bilangan {
     // Method untuk judul
    public void judul (String judul){ 
        System.out.println(" "+judul);
    }
    public void BilanganAsli(int n1,int n2, int n3, int n4, int n5){
        System.out.println("Bilangan Asli : "+n1+n2+n3+n4+n5);
    }
    public void BilanganPrima (int n1,int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9){
        System.out.println("Bilangan Prima : "+n1+n2+n3+n4+n5+n6+n7+n8+n9);
    }
    public void BilanganCacah (int n1,int n2, int n3, int n4, int n5, int n6, int n7, int n8){
        System.out.println("Bilangan Cacah : "+n1+n2+n3+n4+n5+n6+n7+n8);
    }
    
    // Method untuk Keterangan Bilangan
    public void keterangan (String namaBilAsli,int NilaiBilanganAsli, String namaBilPrima,int NilaiBilanganPrima, String namaBilCacah, int NilaiBilanganCacah){ // Parameter
        System.out.println("Nama Bilangan     : "+namaBilAsli);
        System.out.println("Nilai             : "+NilaiBilanganAsli);
        System.out.println("Nama Bilangan     : "+namaBilPrima);
        System.out.println("Nilai             : "+NilaiBilanganPrima);
        System.out.println("Nama Bilangan     : "+namaBilCacah);
        System.out.println("Nilai             : "+NilaiBilanganCacah);
  
    }

}
