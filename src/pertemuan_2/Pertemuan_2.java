/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_2;

/**
 *
 * @author Alvyano
 */
public class Pertemuan_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a,b,c, d;
       
    boolean b1 = 5<10;
    boolean b2 = 9>11;
    boolean b3 = !b1;
    boolean b4 = !b2;
  
    boolean TesAND1 = b1 & b2;
    boolean TesAND2 = b1 && b2;
    boolean TesAND3 = b1 && b3;
    boolean TesAND4 = b1 && b4;
    
    boolean TesOR1 = b1 | b2;
    boolean TesOR2 = b1 || b2;
    boolean TesOR3 = b1 || b3;
    boolean TesOR4 = b1 || b4;
    
    boolean TesXOR1 = b1 ^ b2;
    boolean TesXOR2 = b1 ^ b3;
    boolean TesXOR3 = b1 ^ b4;
    
    
    
    System.out.println("Hasil = "+ TesAND1);
    System.out.println("Hasil = "+ TesAND2);
    System.out.println("Hasil = "+ TesAND3);
    System.out.println("Hasil = "+ TesAND4);
    
    System.out.println("Hasil = "+ TesOR1);
    System.out.println("Hasil = "+ TesOR2);
    System.out.println("Hasil = "+ TesOR3);
    System.out.println("Hasil = "+ TesOR4);
    
    System.out.println("Hasil = "+ TesXOR1);
    System.out.println("Hasil = "+ TesXOR2);
    System.out.println("Hasil = "+ TesXOR3);

    
    }
    
}
