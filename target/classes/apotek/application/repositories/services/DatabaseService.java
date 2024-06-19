/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apotek.application.repositories.services;

import apotek.models.Obat;

/**
 *
 * @author Dukhaan
 */
public class DatabaseService {
    private static Obat obat;

    public static Obat getObat() {
        if (obat == null) {
            obat = new Obat();
        }
        return obat;
    } 
}
