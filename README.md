# Sistem Pengiriman Paket

Proyek ini dibuat untuk memenuhi Tugas PBO (Array) dengan tema **Sistem Pengiriman Paket**.  
Program ini dibuat menggunakan **Java** dan berjalan di **console**.

## Tema Project
Aplikasi ini mensimulasikan proses pengiriman paket, seperti:
- Menambah paket baru
- Menampilkan daftar semua paket
- Mencari paket berdasarkan kode
- Mengubah status pengiriman paket

## Struktur Project
PengirimanPaket/
├─ src/
│ └─ main/
│ └─ java/
│ └─ com/
│ └─ pengiriman/
│ ├─ MainApp.java
│ ├─ Paket.java
│ ├─ Kurir.java
│ └─ Pengiriman.java
└─ README.md



## Diagram Class (Sederhana)
+-----------------+
| Paket |
+-----------------+
| - kodePaket |
| - namaPengirim |
| - namaPenerima |
| - alamatTujuan |
| - berat |
| - biaya |
| - status |
+-----------------+
| + hitungBiaya() |
| + updateStatus()|
| + tampilkanInfo()|
+-----------------+


    (disimpan di array)
          |
          v
+----------------------+
| Pengiriman |
+----------------------+
| - daftarPaket[] |
| - jumlahPaket |
+----------------------+
| + tambahPaket() |
| + tampilkanSemuaPaket()|
| + cariPaket() |
| + ubahStatus() |
+----------------------+

+------------------+
| Kurir |
+------------------+
| - idKurir |
| - namaKurir |
+------------------+
| + tampilkanInfo()|
+------------------+


  digunakan oleh
          v
+------------------+
| MainApp |
+------------------+
| (menampilkan menu)|
| (input pengguna) |
| (looping & switch)|
+------------------+



## Class dan Fungsinya
- **Paket.java**  
  Menyimpan data setiap paket: kode, pengirim, penerima, alamat, berat, biaya, dan status.  
  Memiliki constructor, method `hitungBiaya()`, dan `tampilkanInfo()`.

- **Kurir.java**  
  Menyimpan data kurir seperti ID dan nama.

- **Pengiriman.java**  
  Mengelola daftar paket menggunakan array.  
  Memiliki method:
  - `tambahPaket()`
  - `tampilkanSemuaPaket()`
  - `cariPaket()`
  - `ubahStatus()`

- **MainApp.java**  
  Class utama yang menampilkan menu program.  
  Menggunakan looping (do-while) untuk menu, kondisional (switch-case), dan exception handling untuk validasi input.

## Konsep PBO yang Diterapkan
- Class dan Object  
- Constructor  
- Variabel lokal, global, dan konstanta (`TARIF_PER_KG`)  
- Primitive dan Reference Types  
- Array untuk menyimpan data paket  
- Looping (for, do-while)  
- Kondisional (if-else, switch-case)  
- Manipulasi String untuk pencarian kode paket  
- Exception Handling untuk validasi input  

## Cara Menjalankan Program
1. Clone atau download repository ini.
2. Buka project di NetBeans atau IDE Java lainnya.
3. Jalankan file `MainApp.java`.
4. Gunakan menu yang muncul di console:
   - 1 → tambah paket
   - 2 → lihat semua paket
   - 3 → cari paket berdasarkan kode
   - 4 → ubah status paket
   - 0 → keluar dari program

## Video Penjelasan
Video penjelasan mengenai:
- Struktur project
- Penjelasan setiap class
- Demo program

**Link YouTube:** [Tambahkan link video YouTube di sini setelah diupload]

## Pembuat
- Nama: Milla Agustin  
- NIM: L0324020  
- Mata Kuliah: Pemrograman Berorientasi Objek