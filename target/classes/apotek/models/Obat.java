/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apotek.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dukhaan
 */
public class Obat {
    private String kode;
    private String nama;
    private String jenis;
    private String harga;
    private String stok;
    private static List<Obat> daftarObat;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }
    
    public static void tambahObat(Obat obat) {
        daftarObat.add(obat);
    }

    public static void hapusObat(Obat obat) {
        daftarObat.remove(obat);
    }

    public static List<Obat> getDaftarObat() {
        if(daftarObat == null){
            daftarObat = new ArrayList();
        }
        return daftarObat;
    }
}
