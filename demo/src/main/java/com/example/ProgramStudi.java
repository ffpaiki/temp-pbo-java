package com.example;

import lombok.Data;

/**
 * Prodi
 */
public class ProgramStudi {

    private String namaProdi;
    private String kaprodi;
    private String akreditasi;
    private Jurusan jurusan;

    public ProgramStudi(String namaProdi, String kaprodi, String akreditasi, Jurusan jurusan) {
        this.namaProdi = namaProdi;
        this.kaprodi = kaprodi;
        this.akreditasi = akreditasi;
        this.jurusan = jurusan;
    }

    public ProgramStudi(String namaProdi, String kaprodi, String akreditasi) {
        this.namaProdi = namaProdi;
        this.kaprodi = kaprodi;
        this.akreditasi = akreditasi;
    }

    public String getNamaProdi() {
        return this.namaProdi;
    }

    public void setNamaProdi(String namaProdi) {
        this.namaProdi = namaProdi;
    }

    public String getKaprodi() {
        return this.kaprodi;
    }

    public void setKaprodi(String kaprodi) {
        this.kaprodi = kaprodi;
    }

    public String getAkreditasi() {
        return this.akreditasi;
    }

    public void setAkreditasi(String akreditasi) {
        this.akreditasi = akreditasi;
    }

    public Jurusan getJurusan() {
        return this.jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }
}