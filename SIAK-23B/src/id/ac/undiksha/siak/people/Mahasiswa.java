package id.ac.undiksha.siak.people;

public class Mahasiswa {
	public String nim;
	public String nama;
	public String alamat; 
	public String Prodi; 
	public String tanggalLahir;
	public boolean JenisKelamin;
	

	public void setNim (String nim){
		this.nim = nim;
	}

	public String getNim() {
		return nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getProdi() {
		return Prodi;
	}

	public void setProdi(String prodi) {
		Prodi = prodi;
	}

	public String getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public boolean isJenisKelamin() {
		return JenisKelamin;
	}
	
	public String getJenisKelamin() {
		if (this.isJenisKelamin()) {
			return "perempuan";
		}else {
			return "laki-laki";
		}
	}

	public void setJenisKelamin(boolean jenisKelamin) {
		JenisKelamin = jenisKelamin;
	}
	
	
}
