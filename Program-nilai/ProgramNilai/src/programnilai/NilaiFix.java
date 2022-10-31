/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programnilai;

import java.util.Scanner;

/**
 *
 * @author Agung
 */
import java.util.Scanner;
public class NilaiFix {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        char grade = 0;
        final double n_tugas , n_uts , n_uas , n_akhir;
       
        System.out.print("Nilai tugas : ");
        n_tugas = input.nextInt();
        System.out.print("Nilai uts : ");
        n_uts = input.nextInt();
        System.out.print("Nilai uas : ");
        n_uas = input.nextInt();
        n_akhir = (0.20 * n_tugas + 0.40 * n_uts + 0.40 * n_uas);
        if (n_akhir >= 80 && n_akhir <=100){
            grade = 'A';
        }
            else if (n_akhir >= 70 && n_akhir <= 79){
                grade = 'B';
            }
            else if (n_akhir >= 60 && n_akhir <= 69){
                grade = 'C';
            }
            else if (n_akhir >= 50 && n_akhir <= 59){
                grade = 'D';
            }
            else if(n_akhir <= 50){
                grade = 'E';
            }
        System.out.println("=====RESULT=====");
        System.out.println("Nilai angka: "+n_akhir);
        System.out.println("Nilai huruf: "+grade); 
            
    }
}
