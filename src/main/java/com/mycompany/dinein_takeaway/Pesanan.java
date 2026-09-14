/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dinein_takeaway;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;

public class Pesanan {
    
    private String namaPelanggan;
    private String tipePesanan;
    private int nomorMeja;
    private ArrayList<Menu> daftarMenu;
    private String statusPesanan;

    public Pesanan(String namaPelanggan, int nomorMeja) {
        setNamaPelanggan(namaPelanggan);
        this.tipePesanan = "Dine In";
        setNomorMeja(nomorMeja);
        this.daftarMenu = new ArrayList<>();
        this.statusPesanan = "Dalam Proses";
    }

    public Pesanan(String namaPelanggan) {
        setNamaPelanggan(namaPelanggan);
        this.tipePesanan = "Takeaway";
        this.nomorMeja = -1;
        this.daftarMenu = new ArrayList<>();
        this.statusPesanan = "Dalam Proses";
    }

    
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getTipePesanan() {
        return tipePesanan;
    }

    public int getNomorMeja() {
        return nomorMeja;
    }

    public ArrayList<Menu> getDaftarMenu() {
        return daftarMenu;
    }

    public String getStatusPesanan() {
        return statusPesanan;
    }

    
    public void setNamaPelanggan(String namaPelanggan) {
        if (namaPelanggan != null && !namaPelanggan.isEmpty()) {
            this.namaPelanggan = namaPelanggan;
        } else {
            System.out.println("X Error: Nama pelanggan tidak boleh kosong!");
        }
    }

    public void setNomorMeja(int nomorMeja) {
        if (tipePesanan.equals("Dine In") && nomorMeja > 0) {
            this.nomorMeja = nomorMeja;
        } else if (!tipePesanan.equals("Dine In")) {
            System.out.println("X Error: Takeaway tidak memerlukan nomor meja!");
        } else if (nomorMeja <= 0) {
            System.out.println("X Error: Nomor meja harus positif!");
        }
    }

    public void setStatusPesanan(String statusPesanan) {
        if (statusPesanan.equals("Dalam Proses") || 
            statusPesanan.equals("Siap") || 
            statusPesanan.equals("Selesai")) {
            this.statusPesanan = statusPesanan;
        } else {
            System.out.println("X Error: Status tidak valid! Gunakan: Dalam Proses, Siap, atau Selesai");
        }
    }

    
    public void tambahMenu(Menu menu) {
        if (menu != null) {
            daftarMenu.add(menu);
        }
    }

    public double hitungTotal() {
        double total = 0;
        for (Menu m : daftarMenu) {
            total += m.getHarga();
        }
        return total;
    }

    public void cetakStruk() {
        System.out.println("========================================");
        System.out.println("           STRUK PEMESANAN              ");
        System.out.println("========================================");
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("Tipe Pesanan   : " + tipePesanan);
        
        if (tipePesanan.equals("Dine In")) {
            System.out.println("Nomor Meja     : " + nomorMeja);
        }
        
        System.out.println("Status         : " + statusPesanan);
        System.out.println("----------------------------------------");
        System.out.println("Item Pesanan:");
        
        if (daftarMenu.isEmpty()) {
            System.out.println("(Belum ada menu yang dipesan)");
        } else {
            for (Menu m : daftarMenu) {
                m.tampilkanInfo();
            }
        }
        
        System.out.println("----------------------------------------");
        System.out.printf("TOTAL BAYAR: Rp%,.0f%n", hitungTotal());
        System.out.println("========================================\n");
    }
}