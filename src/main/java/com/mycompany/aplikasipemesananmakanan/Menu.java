package com.mycompany.aplikasipemesananmakanan;

public class Menu {
    private String namaMenu;
    private double harga;
    private String kategori;

    public Menu(String namaMenu, double harga, String kategori) {
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    public String getNamaMenu() { return namaMenu; }
    public double getHarga() { return harga; }
    public String getKategori() { return kategori; }

    public void tampilkanInfo() {
        System.out.printf("%-20s | %-10s | Rp%,.0f%n", namaMenu, kategori, harga);
    }
}