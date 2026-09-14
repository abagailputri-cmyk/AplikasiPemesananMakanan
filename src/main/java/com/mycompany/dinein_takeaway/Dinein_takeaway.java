/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dinein_takeaway;


public class Dinein_takeaway {

    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("|   APLIKASI PEMESANAN MAKANAN - PERTEMUAN 4 |");
        System.out.println("|        (Dengan Encapsulation)              |");
        System.out.println("|============================================|\n");

        
        System.out.println("TAHAP 1: MEMBUAT MENU");
        Menu nasiGoreng = new Menu("Nasi Goreng Spesial", 20000, "Makanan");
        Menu ayamGeprek = new Menu("Ayam Geprek", 18000, "Makanan");
        Menu esTeh = new Menu("Es Teh Manis", 5000, "Minuman");
        Menu kopi = new Menu("Kopi Hitam", 8000, "Minuman");
        System.out.println("4 menu berhasil dibuat\n");

        
        System.out.println("TAHAP 2: MEMBUAT PELANGGAN");
        Pelanggan pelanggan1 = new Pelanggan("Zidan Ahmad", "081234567890");
        Pelanggan pelanggan2 = new Pelanggan("Luna Adelia", "082345678901");
        System.out.println("2 pelanggan berhasil dibuat\n");

        
        System.out.println("PESANAN 1 - DINE-IN (Zidan Ahmad)");
        System.out.println("─────────────────────────────────────");
        Pesanan pesanan1 = new Pesanan(pelanggan1.getNama(), 7);
        pesanan1.tambahMenu(nasiGoreng);
        pesanan1.tambahMenu(esTeh);
        pesanan1.setStatusPesanan("Siap");
        pesanan1.cetakStruk();

        
        System.out.println("PESANAN 2 - TAKEAWAY (Luna Adelia)");
        System.out.println("─────────────────────────────────────");
        Pesanan pesanan2 = new Pesanan(pelanggan2.getNama());
        pesanan2.tambahMenu(ayamGeprek);
        pesanan2.tambahMenu(kopi);
        pesanan2.setStatusPesanan("Selesai");
        pesanan2.cetakStruk();

        
        System.out.println("TAHAP 5: MENYIMPAN RIWAYAT PESANAN");
        pelanggan1.tambahRiwayatPesanan(pesanan1);
        pelanggan2.tambahRiwayatPesanan(pesanan2);
        System.out.println("Riwayat pesanan berhasil disimpan\n");

        
        System.out.println("DEMONSTRASI GETTER (Mengakses Data Private):");
        System.out.println("─────────────────────────────────────");
        System.out.println("Menu 1 - Nama     : " + nasiGoreng.getNamaMenu());
        System.out.println("Menu 1 - Harga    : Rp" + nasiGoreng.getHarga());
        System.out.println("Menu 1 - Kategori : " + nasiGoreng.getKategori());
        System.out.println();
        System.out.println("Pesanan 1 - Nama Pelanggan : " + pesanan1.getNamaPelanggan());
        System.out.println("Pesanan 1 - Tipe Pesanan   : " + pesanan1.getTipePesanan());
        System.out.println("Pesanan 1 - Nomor Meja     : " + pesanan1.getNomorMeja());
        System.out.println("Pesanan 1 - Total          : Rp" + String.format("%,.0f", pesanan1.hitungTotal()));
        System.out.println("Pesanan 1 - Status         : " + pesanan1.getStatusPesanan());
        System.out.println();
        System.out.println("Pelanggan 1 - Nama         : " + pelanggan1.getNama());
        System.out.println("Pelanggan 1 - Telepon      : " + pelanggan1.getNomorTelepon());
        System.out.println("Pelanggan 1 - Jumlah Pesanan : " + pelanggan1.getJumlahPesanan());
        System.out.println();

        
        System.out.println("DEMONSTRASI SETTER - DATA VALID:");
        System.out.println("─────────────────────────────────────");
        
        System.out.println("1. Mengubah nama menu (VALID):");
        System.out.println("   Sebelum: " + nasiGoreng.getNamaMenu());
        nasiGoreng.setNamaMenu("Nasi Goreng Premium");
        System.out.println("   Sesudah: " + nasiGoreng.getNamaMenu());
        System.out.println();

        System.out.println("2. Mengubah harga menu dengan nilai positif (VALID):");
        System.out.println("   Sebelum: Rp" + nasiGoreng.getHarga());
        nasiGoreng.setHarga(25000);
        System.out.println("   Sesudah: Rp" + nasiGoreng.getHarga());
        System.out.println();

        System.out.println("3. Mengubah status pesanan ke 'Siap' (VALID):");
        System.out.println("   Sebelum: " + pesanan2.getStatusPesanan());
        pesanan2.setStatusPesanan("Siap");
        System.out.println("   Sesudah: " + pesanan2.getStatusPesanan());
        System.out.println();

        // ========== TAHAP 8: DEMONSTRASI SETTER INVALID ==========
        System.out.println("🔍 DEMONSTRASI SETTER - DATA INVALID:");
        System.out.println("─────────────────────────────────────");
        
        System.out.println("1. Mengubah harga dengan nilai NEGATIF (INVALID):");
        System.out.println("   Mencoba: nasiGoreng.setHarga(-15000)");
        nasiGoreng.setHarga(-15000);
        System.out.println("   Hasil: Harga tetap Rp" + nasiGoreng.getHarga());
        System.out.println();

        System.out.println("2. Mengubah nama dengan string KOSONG (INVALID):");
        System.out.println("   Mencoba: nasiGoreng.setNamaMenu(\"\")");
        nasiGoreng.setNamaMenu("");
        System.out.println("   Hasil: Nama tetap \"" + nasiGoreng.getNamaMenu() + "\"");
        System.out.println();

        System.out.println("3. Mengubah status dengan status TIDAK VALID (INVALID):");
        System.out.println("   Mencoba: pesanan1.setStatusPesanan(\"InvalidStatus\")");
        pesanan1.setStatusPesanan("InvalidStatus");
        System.out.println("   Hasil: Status tetap \"" + pesanan1.getStatusPesanan() + "\"");
        System.out.println();

        System.out.println("4. Mengubah nomor meja takeaway (INVALID):");
        System.out.println("   Mencoba: pesanan2.setNomorMeja(5) [Pesanan Takeaway]");
        pesanan2.setNomorMeja(5);
        System.out.println("   Hasil: Nomor meja tetap " + pesanan2.getNomorMeja());
        System.out.println();

        System.out.println("5. Mengubah nama pelanggan dengan string KOSONG (INVALID):");
        System.out.println("   Mencoba: pelanggan1.setNama(\"\")");
        pelanggan1.setNama("");
        System.out.println("   Hasil: Nama tetap \"" + pelanggan1.getNama() + "\"");
        System.out.println();

        
        System.out.println("INFORMASI PELANGGAN:");
        System.out.println("─────────────────────────────────────");
        pelanggan1.tampilkanInfo();
        pelanggan2.tampilkanInfo();

        
        System.out.println("RIWAYAT PESANAN PELANGGAN:");
        System.out.println("─────────────────────────────────────");
        pelanggan1.tampilkanRiwayatPesanan();
        pelanggan2.tampilkanRiwayatPesanan();
    }
}
