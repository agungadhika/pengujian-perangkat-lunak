/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programnilai;

/**
 *
 * @author Agung
 */
import java.util.Scanner;
public class NilaiCoba {
    public static void main() {
Scanner scan = new Scanner (System.in);
        
         System.out.print("Nilai Tugas: ");   
         int nilai_tugas = scan.nextInt();
         System.out.print("Nilai UTS: ");   
         int nilai_uts = scan.nextInt();
         System.out.print("Nilai UAS: ");   
         int nilai_uas = scan.nextInt();
       
        Nilai Mhs = new Nilai (nilai_tugas,nilai_uts,nilai_uas);
     
        System.out.println("============");
//        System.out.println("Nama  :"+Mhs.getNama());
        System.out.println("Nilai :"+Mhs.getNilai());
        System.out.println("Grade :"+Mhs.hitungGrade());     
          }    
}
