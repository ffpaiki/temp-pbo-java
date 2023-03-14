package com.example;

import lombok.Data;

/**
 * Mahasiswa
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String agama;
    private String jenisKelamin;
    private ProgramStudi prodi; 

    public Mahasiswa(String nim, String nama, String agama, String jenisKelamin, ProgramStudi prodi) {
        this.nim = nim;
        this.nama = nama;
        this.agama = agama;
        this.jenisKelamin = jenisKelamin;
        this.prodi = prodi;
    }


    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAgama() {
        return this.agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public ProgramStudi getProdi() {
        return this.prodi;
    }

    public void setProdi(ProgramStudi prodi) {
        this.prodi = prodi;
    }
}