/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pengiriman;

/**
 *
 * @author L0324020 - Milla Agustin
 */
public class Pengiriman {
    private Paket[] daftarPaket;
    private int jumlahPaket;

    public Pengiriman(int kapasitas) {
        daftarPaket = new Paket[kapasitas];
        jumlahPaket = 0;
    }

    public void tambahPaket(Paket p) {
        if (jumlahPaket < daftarPaket.length) {
            daftarPaket[jumlahPaket++] = p;
            System.out.println("Paket berhasil ditambahkan.");
        } else {
            System.out.println("Kapasitas penyimpanan penuh.");
        }
    }

    public void tampilkanSemuaPaket() {
        System.out.println("\n=== DAFTAR PAKET ===");
        if (jumlahPaket == 0) {
            System.out.println("Belum ada paket.");
        } else {
            for (int i = 0; i < jumlahPaket; i++) {
                daftarPaket[i].tampilkanInfo();
            }
        }
    }

    public Paket cariPaket(String kode) {
        for (int i = 0; i < jumlahPaket; i++) {
            if (daftarPaket[i].getKodePaket().equalsIgnoreCase(kode)) {
                return daftarPaket[i];
            }
        }
        return null;
    }

    public void ubahStatus(String kode, String statusBaru) {
        Paket p = cariPaket(kode);
        if (p != null) {
            p.updateStatus(statusBaru);
            System.out.println("Status paket berhasil diubah.");
        } else {
            System.out.println("Paket tidak ditemukan.");
        }
    }
}
