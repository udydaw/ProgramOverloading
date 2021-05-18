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
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bilangan obj = new Bilangan(); // Objek untuk memanggil class Bilangan

        obj.judul("              Contoh Bilangan                 "); // Nilai dari method judul
        obj.BilanganAsli    (1, 2, 3, 4, 5);
        obj.BilanganPrima   (2, 3, 5, 7, 11, 13, 17, 23, 29);
        obj.BilanganCacah   (0, 1, 2, 3, 4, 5, 6, 7);
    }
    
}
