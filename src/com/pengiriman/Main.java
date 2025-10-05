/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pengiriman;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pengiriman pengiriman = new Pengiriman(50); // kapasitas 50 paket

        int pilihan;
        do {
            System.out.println("\n=== MENU SISTEM PENGIRIMAN PAKET ===");
            System.out.println("1. Tambah Paket");
            System.out.println("2. Lihat Semua Paket");
            System.out.println("3. Cari Paket");
            System.out.println("4. Ubah Status Paket");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            while (!input.hasNextInt()) {
                System.out.print("Masukkan angka yang benar: ");
                input.next();
            }

            pilihan = input.nextInt();
            input.nextLine(); // bersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Kode Paket: ");
                    String kode = input.nextLine();
                    System.out.print("Nama Pengirim: ");
                    String pengirim = input.nextLine();
                    System.out.print("Nama Penerima: ");
                    String penerima = input.nextLine();
                    System.out.print("Alamat Tujuan: ");
                    String alamat = input.nextLine();

                    double berat = 0;
                    boolean valid = false;
                    do {
                        try {
                            System.out.print("Berat (kg): ");
                            berat = input.nextDouble();
                            if (berat <= 0) {
                                throw new IllegalArgumentException("Berat harus lebih dari 0!");
                            }
                            valid = true;
                        } catch (Exception e) {
                            System.out.println("Input tidak valid: " + e.getMessage());
                            input.nextLine(); // bersihkan buffer
                        }
                    } while (!valid);

                    Paket paket = new Paket(kode, pengirim, penerima, alamat, berat);
                    pengiriman.tambahPaket(paket);
                    break;

                case 2:
                    pengiriman.tampilkanSemuaPaket();
                    break;

                case 3:
                    System.out.print("Masukkan kode paket yang dicari: ");
                    String cariKode = input.nextLine();
                    Paket ditemukan = pengiriman.cariPaket(cariKode);
                    if (ditemukan != null) {
                        ditemukan.tampilkanInfo();
                    } else {
                        System.out.println("Paket tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan kode paket yang ingin diubah statusnya: ");
                    String kodeUbah = input.nextLine();
                    System.out.print("Masukkan status baru: ");
                    String statusBaru = input.nextLine();
                    pengiriman.ubahStatus(kodeUbah, statusBaru);
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        input.close();
    }
}
