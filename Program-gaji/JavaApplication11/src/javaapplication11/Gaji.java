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
public class Gaji {
    private int golongan, masa_kerja, kehadiran, jumlahkehadiran, upah = 0, tunjangan = 0, total;    
    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
    this.golongan = golongan;
        if (this.golongan == 1 || this.golongan == 2){
            this.upah = 1000000;
        }else if( this.golongan == 3 || this.golongan == 4){
            this.upah = 2000000;
        }else{
            System.out.print("input salah");
        }
    }

    public int getMasa_kerja() {
        return masa_kerja;
    }

    public void setMasa_kerja(int masa_kerja) {
        this.masa_kerja = masa_kerja;
        if(this.masa_kerja <= 5){
            this.tunjangan = 0;
        }else if(this.masa_kerja > 5 && this.golongan == 1 || this.golongan == 2){
            this.tunjangan = 500000 * this.masa_kerja;
        }else if(this.masa_kerja > 5 && this.golongan == 3 || this.golongan == 4){
            this.tunjangan = 700000 * this.masa_kerja;
        }else{
            System.out.print("Salah");
        }
    }

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public int getJumlah_kehadiran() {
        this.jumlahkehadiran = 35*this.kehadiran;
        return this.jumlahkehadiran;
    }

    public void setJumlah_kehadiran(int jumlahkehadiran) {
        this.jumlahkehadiran = jumlahkehadiran;
//        this.jumlah_kehadiran = 35*this.kehadiran;
    }

    public int getUpah() {
        return upah;
    }

    public void setUpah(int upah) {
        this.upah = upah;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public int getTotal() {
        this.total = this.upah + this.tunjangan + this.jumlahkehadiran;
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public static void main(String argvs[]){
    Gaji pengguna1 = new Gaji();
    pengguna1.setGolongan(1);
    pengguna1.setMasa_kerja(6);
    pengguna1.setKehadiran(6);
    System.out.println(pengguna1.getTotal());
    }

    void testSetGolongan(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

