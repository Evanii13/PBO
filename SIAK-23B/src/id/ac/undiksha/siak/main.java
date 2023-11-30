package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Dosen;

public class main {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Mahasiswa ani = new Mahasiswa();
        ani.setNim("1234");
        ani.setNama("Ani");
        ani.setAlamat("Singaraja");
        ani.setTanggalLahir("30 Desember 2002");
        ani.setJenisKelamin (true);
        ani.setProdi("Ilmu Komputer");

        System.out.println(ani.getNim());
        System.out.println(ani.getNama());
        System.out.println(ani.getAlamat());
        System.out.println(ani.getTanggalLahir());
        System.out.println(ani.getJenisKelamin());
        System.out.println(ani.getProdi());
        
        
        Dosen dewi = new Dosen();
        dewi.setNip("90267");
        dewi.setNama_dosen("Dewi");
        dewi.setAlamat("Singaraja");
        dewi.setJenisKelamin(true);
        dewi.setMata_kuliah("Aljabar Linear");
        

        
        System.out.println(dewi.getNip());
        System.out.println(dewi.getNama_dosen());
        System.out.println(dewi.getAlamat());
        System.out.println(dewi.getJenisKelamin());
        System.out.println(dewi.getMata_kuliah());
    }
}


