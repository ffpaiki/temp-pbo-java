package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Jurusan teknik = new Jurusan("Teknik", "Julius Naibaho");

        ProgramStudi informatika = new ProgramStudi("S1 Teknik Informatika", "Christian Dwi Suhendra", "B");
        ProgramStudi komputer = new ProgramStudi("D3 Teknik Komputer", "Lion Marini", "B", teknik);

        Mahasiswa joshua = new Mahasiswa("202165001","Joshua","Kristen","Laki-laki", informatika);

        Mahasiswa guntur = new Mahasiswa("202165031", "Guntur", "Islam", "Laki-laki", komputer);

        System.out.println(joshua.getNama());
        System.out.println(joshua.getNim());
        System.out.println(joshua.getProdi().getNamaProdi());

        System.out.println(guntur.getNama());
        System.out.println(guntur.getProdi().getJurusan().getNamaJurusan());

    }
}
