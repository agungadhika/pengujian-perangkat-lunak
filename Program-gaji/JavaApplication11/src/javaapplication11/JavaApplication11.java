/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author Agung
 */
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input=new Scanner(System.in);
//    String nama;
//    char ;
    int golongan, masa_kerja, kehadiran, jumlah_kehadiran, upah = 0, tunjangan = 0, total;
     
    System.out.print("Golongan: ");
    golongan = input.nextInt();   
    
    System.out.print("Masa Kerja: ");
    masa_kerja = input.nextInt();
     
    System.out.print("Jumlah kehadiran: ");
    kehadiran = input.nextInt();    
     
    System.out.println();
    
    if ( golongan == 1 || golongan == 2){
        upah = 1000000;
    }else if( golongan == 3 || golongan == 4){
        upah = 2000000;
    }else{
        System.out.print("input salah");
    }
    
    if(masa_kerja <= 5){
        tunjangan = 0;
    }else if(masa_kerja > 5 && golongan == 1 || golongan == 2){
        tunjangan = 500000 * masa_kerja;
    }else if(masa_kerja > 5 && golongan == 3 || golongan == 4){
        tunjangan = 700000 * masa_kerja;
    }else{
        System.out.print("Salah");
    }
    jumlah_kehadiran = 35*kehadiran;
    
    total = upah + tunjangan + jumlah_kehadiran;
    Locale localeID = new Locale("in", "ID");
    NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
    System.out.print(formatRupiah.format(total));
       
  }
}
    

