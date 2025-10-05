/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pengiriman;

/**
 *
 * @author user
 */
public class Kurir {
    private String idKurir;
    private String namaKurir;

    public Kurir(String idKurir, String namaKurir) {
        this.idKurir = idKurir;
        this.namaKurir = namaKurir;
    }

    public void tampilkanInfo() {
        System.out.println("Kurir ID: " + idKurir + ", Nama: " + namaKurir);
    }
}
