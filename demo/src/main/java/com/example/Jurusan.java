package com.example;

import lombok.Data;

/**
 * Jurusan
 */
public class Jurusan {

    private String namaJurusan;
    private String kajur;
    private Fakultas fakultas;

    public Jurusan(String namaJurusan, String kajur, Fakultas fakultas) {
        this.namaJurusan = namaJurusan;
        this.kajur = kajur;
        this.fakultas = fakultas;
    }

    public Jurusan(String namaJurusan, String kajur) {
        this.namaJurusan = namaJurusan;
        this.kajur = kajur;
    }

    public String getNamaJurusan() {
        return this.namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public String getKajur() {
        return this.kajur;
    }

    public void setKajur(String kajur) {
        this.kajur = kajur;
    }

    public Fakultas getFakultas() {
        return this.fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

}