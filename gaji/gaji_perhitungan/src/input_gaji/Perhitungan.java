package input_gaji;

public class Perhitungan {
	int golongan, masa_kerja, kehadiran, gaji;
	
	public int getMasa_kerja() {
		return masa_kerja;
	}

	public void setMasa_kerja(int masa_kerja) {
		this.masa_kerja = masa_kerja;
	}

	public int getKehadiran() {
		return kehadiran;
	}

	public void setKehadiran(int kehadiran) {
		this.kehadiran = kehadiran;
	}

	public int getGolongan() {
		return golongan;
	}

	public void setGolongan(int golongan) {
		this.golongan = golongan;
	}

	public int getGaji() {
		return gaji;
	}

	public void setGaji(int gaji) {
		this.gaji = gaji;
	}

	double perhitungan_gaji() {
		int gaji_sementara = 0, tunjangan = 0, total_kehadiran = 0;	
		if(golongan <= 4) {
			if(golongan > 2) {
				gaji_sementara = 2000000;
			}else if(golongan < 3) {
				gaji_sementara = 1000000;
			}
			if(masa_kerja > 5) {
				if(golongan < 3) {
					tunjangan = 500000*masa_kerja;
				}else if(golongan > 2) {
					tunjangan = 700000*masa_kerja;
				}
			}else {
				tunjangan = 0;
			}
		}
		
		total_kehadiran = 35000*kehadiran;
		gaji = gaji_sementara + tunjangan + total_kehadiran;
		return gaji;
	}		
}