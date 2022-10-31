package input_gaji;

import org.junit.Test;

public class PerhitunganTest {

	@Test
	public void gol_1_mask_0(){
		Perhitungan pp = new Perhitungan();
		pp.setGolongan(1);		
		pp.setMasa_kerja(0);
		pp.setKehadiran(30);
		pp.perhitungan_gaji();
	}
	
	@Test
	public void gol_1_mask_6(){
		Perhitungan pp = new Perhitungan();
		pp.setGolongan(1);		
		pp.setMasa_kerja(6);
		pp.setKehadiran(30);
		pp.perhitungan_gaji();
	}
	
	@Test
	public void gol_2_mask_0(){
		Perhitungan pp = new Perhitungan();
		pp.setGolongan(2);		
		pp.setMasa_kerja(0);
		pp.setKehadiran(30);
		pp.perhitungan_gaji();
	}
	
	@Test
	public void gol_2_mask_6(){
		Perhitungan pp = new Perhitungan();
		pp.setGolongan(2);		
		pp.setMasa_kerja(6);
		pp.setKehadiran(30);
		pp.perhitungan_gaji();
	}
	
	@Test
	public void gol_3_mask_0(){
		Perhitungan pp = new Perhitungan();
		pp.setGolongan(3);		
		pp.setMasa_kerja(0);
		pp.setKehadiran(30);
		pp.perhitungan_gaji();
	}
	
	@Test
	public void gol_3_mask_6(){
		Perhitungan pp = new Perhitungan();
		pp.setGolongan(3);		
		pp.setMasa_kerja(6);
		pp.setKehadiran(30);
		pp.perhitungan_gaji();
	}
	
	@Test
	public void gol_4_mask_0(){
		Perhitungan pp = new Perhitungan();
		pp.setGolongan(4);		
		pp.setMasa_kerja(0);
		pp.setKehadiran(30);
		pp.perhitungan_gaji();
	}
	
	@Test
	public void gol_4_mask_6(){
		Perhitungan pp = new Perhitungan();
		pp.setGolongan(4);		
		pp.setMasa_kerja(6);
		pp.setKehadiran(30);
		pp.perhitungan_gaji();
	}
	
	@Test
	public void wrong_input(){
		Perhitungan pp = new Perhitungan();
		pp.setGolongan(5);		
		pp.setMasa_kerja(1);
		pp.setKehadiran(30);
		pp.perhitungan_gaji();
	}
}
