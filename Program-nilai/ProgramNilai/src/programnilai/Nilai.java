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

class Nilai{
    private int nilai_uts, nilai_tugas, nilai_uas, nilai_akhir;
    private char grade;
    
     public Nilai(int a, int b,int c, int d){
        nilai_uts=a;
        nilai_uas=b;
        nilai_tugas=c;
        nilai_akhir=d;
    }   

    Nilai(int nilai_tugas, int nilai_uts, int nilai_uas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public int perhitungan(){ //method kirim nama
        nilai_akhir = (int) (0.20 * nilai_tugas + 0.40 * nilai_uts + 0.40 * nilai_uas);
        return nilai_akhir;
       }
         
       public int getNilai(){        //method kirim nilai 
           return nilai_akhir;
       }
      
       public char hitungGrade(){  //method seleksi grade       
         if ((nilai_akhir>=80) && (nilai_akhir<=100))
             grade='A';
         else if ((nilai_akhir>=70) && (nilai_akhir<=79))
             grade='B';
         else if ((nilai_akhir>=60) && (nilai_akhir<=69))
             grade='C';
         else if ((nilai_akhir>=50) && (nilai_akhir<=59))
             grade='D';
         else
             grade='E';
        
         return grade;
       }

    int perhitungan(int nilai_tugas, int nilai_uas, int nilai_uts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
