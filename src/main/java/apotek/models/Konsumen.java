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
public class Konsumen {
    private String id;
    private String nama;
    private String username;
    private String password;
    private static List<Konsumen> daftarKonsumen;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public static void tambahKonsumen(Konsumen konsumen) {
        daftarKonsumen.add(konsumen);
    }

    public static void hapusKonsumen(Konsumen konsumen) {
        daftarKonsumen.remove(konsumen);
    }

    public static List<Konsumen> getDaftarObat() {
        if(daftarKonsumen == null){
            daftarKonsumen = new ArrayList();
        }
        return daftarKonsumen;
    }
    
}
