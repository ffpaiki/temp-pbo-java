package com.example;

import lombok.Data;

/**
 * Fakultas
 */
public class Fakultas {

    private String namaFakultas;
    private String dekan;
    private String wd1;
    private String wd2;
    private String wd3;

    public Fakultas(String namaFakultas, String dekan, String wd1, String wd2, String wd3) {
        this.namaFakultas = namaFakultas;
        this.dekan = dekan;
        this.wd1 = wd1;
        this.wd2 = wd2;
        this.wd3 = wd3;
    }

    public String getNamaFakultas() {
        return this.namaFakultas;
    }

    public void setNamaFakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
    }

    public String getDekan() {
        return this.dekan;
    }

    public void setDekan(String dekan) {
        this.dekan = dekan;
    }

    public String getWd1() {
        return this.wd1;
    }

    public void setWd1(String wd1) {
        this.wd1 = wd1;
    }

    public String getWd2() {
        return this.wd2;
    }

    public void setWd2(String wd2) {
        this.wd2 = wd2;
    }

    public String getWd3() {
        return this.wd3;
    }

    public void setWd3(String wd3) {
        this.wd3 = wd3;
    }
}