package id.ac.undiksha.siak.people;

public class Dosen {

    public String nip;
    public String nama_dosen;
    public String jurusan; 
    public String mata_kuliah; // Ganti bidang_keahlian menjadi mata_kuliah
    public String tanggalLahir;
    public String alamat;
    public boolean jenisKelamin; // Gunakan camelCase untuk nama variabel

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama_dosen() {
        return nama_dosen;
    }

    public void setNama_dosen(String nama_dosen) {
        this.nama_dosen = nama_dosen;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getMata_kuliah() {
        return mata_kuliah;
    }

    public void setMata_kuliah(String mata_kuliah) {
        this.mata_kuliah = mata_kuliah;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public String getJenisKelamin() {
        if (this.isJenisKelamin()) {
            return "Perempuan";
        } else {
            return "Laki-laki";
        }
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}
