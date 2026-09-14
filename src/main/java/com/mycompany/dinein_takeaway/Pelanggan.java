/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dinein_takeaway;


import java.util.ArrayList;

public class Pelanggan {
    private String nama;
    private String nomorTelepon;
    private ArrayList<Pesanan> riwayatPesanan;

    public Pelanggan(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.riwayatPesanan = new ArrayList<>();
    }

    
    public String getNama() {
        return nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public ArrayList<Pesanan> getRiwayatPesanan() {
        return riwayatPesanan;
    }

    
    public void setNama(String nama) {
        if (nama != null && !nama.isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("X Error: Nama tidak boleh kosong!");
        }
    }

    public void setNomorTelepon(String nomorTelepon) {
        if (nomorTelepon != null && !nomorTelepon.isEmpty()) {
            this.nomorTelepon = nomorTelepon;
        } else {
            System.out.println("X Error: Nomor telepon tidak boleh kosong!");
        }
    }

    
    public void tambahRiwayatPesanan(Pesanan pesanan) {
        if (pesanan != null) {
            riwayatPesanan.add(pesanan);
        }
    }

    public int getJumlahPesanan() {
        return riwayatPesanan.size();
    }

    public void tampilkanInfo() {
        System.out.println("========================================");
        System.out.println("         DATA PELANGGAN                 ");
        System.out.println("========================================");
        System.out.println("Nama               : " + nama);
        System.out.println("Nomor Telepon      : " + nomorTelepon);
        System.out.println("Jumlah Pesanan     : " + riwayatPesanan.size());
        System.out.println("========================================");
    }

    public void tampilkanRiwayatPesanan() {
        System.out.println("========================================");
        System.out.println("      RIWAYAT PESANAN PELANGGAN         ");
        System.out.println("========================================");
        System.out.println("Nama Pelanggan: " + nama);
        
        if (riwayatPesanan.isEmpty()) {
            System.out.println("(Tidak ada riwayat pesanan)");
        } else {
            for (int i = 0; i < riwayatPesanan.size(); i++) {
                Pesanan p = riwayatPesanan.get(i);
                System.out.println((i + 1) + ". " + p.getTipePesanan() + 
                                 " - Rp" + String.format("%,.0f", p.hitungTotal()) + 
                                 " (" + p.getStatusPesanan() + ")");
            }
        }
        System.out.println("========================================\n");
    }
}
