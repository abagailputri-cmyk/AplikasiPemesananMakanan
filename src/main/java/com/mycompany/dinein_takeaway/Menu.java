/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dinein_takeaway;

public class Menu {
    
    private String namaMenu;
    private double harga;
    private String kategori;

    public Menu(String namaMenu, double harga, String kategori) {
        this.namaMenu = namaMenu;
        setHarga(harga);
        this.kategori = kategori;
    }

    
    public String getNamaMenu() {
        return namaMenu;
    }

    public double getHarga() {
        return harga;
    }

    public String getKategori() {
        return kategori;
    }

    
    public void setNamaMenu(String namaMenu) {
        if (namaMenu != null && !namaMenu.isEmpty()) {
            this.namaMenu = namaMenu;
        } else {
            System.out.println("X Error: Nama menu tidak boleh kosong!");
        }
    }

    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("X Error: Harga harus positif!");
        }
    }

    public void setKategori(String kategori) {
        if (kategori != null && !kategori.isEmpty()) {
            this.kategori = kategori;
        } else {
            System.out.println("X Error: Kategori tidak boleh kosong!");
        }
    }

    public void tampilkanInfo() {
        System.out.printf("%-20s | %-10s | Rp%,.0f%n", namaMenu, kategori, harga);
    }
}
