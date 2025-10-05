/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pengiriman;

/**
 *
 * @author L0324020 - Milla Agustin
 */
public class Paket {
    private String kodePaket;
    private String namaPengirim;
    private String namaPenerima;
    private String alamatTujuan;
    private double berat; // kg
    private double biaya;
    private String status;

    public static final double TARIF_PER_KG = 10000; // konstanta tarif

    // Constructor
    public Paket(String kodePaket, String namaPengirim, String namaPenerima,
                 String alamatTujuan, double berat) {
        this.kodePaket = kodePaket;
        this.namaPengirim = namaPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatTujuan = alamatTujuan;
        this.berat = berat;
        this.status = "Diproses";
        hitungBiaya();
    }

    public String getKodePaket() {
        return kodePaket;
    }

    public String getStatus() {
        return status;
    }

    public void hitungBiaya() {
        biaya = berat * TARIF_PER_KG;
    }

    public void updateStatus(String statusBaru) {
        this.status = statusBaru;
    }

    public void tampilkanInfo() {
        System.out.println(
            "Kode: " + kodePaket +
            ", Pengirim: " + namaPengirim +
            ", Penerima: " + namaPenerima +
            ", Tujuan: " + alamatTujuan +
            ", Berat: " + berat + " kg" +
            ", Biaya: Rp" + biaya +
            ", Status: " + status
        );
    }
}

   

