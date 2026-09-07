package com.mycompany.aplikasipemesananmakanan;

import java.util.ArrayList;

public class Pesanan {
    private String namaPelanggan;
    private String tipePesanan;
    private int nomorMeja;
    private ArrayList<Menu> daftarMenu;

    public Pesanan(String namaPelanggan, int nomorMeja) {
        this.namaPelanggan = namaPelanggan;
        this.tipePesanan = "Dine In";
        this.nomorMeja = nomorMeja;
        this.daftarMenu = new ArrayList<>();
    }

    public Pesanan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
        this.tipePesanan = "Takeaway";
        this.nomorMeja = -1;
        this.daftarMenu = new ArrayList<>();
    }

    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
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
        System.out.println("----------------------------------------");
        for (Menu m : daftarMenu) {
            m.tampilkanInfo();
        }
        System.out.println("----------------------------------------");
        System.out.printf("TOTAL BAYAR: Rp%,.0f%n", hitungTotal());
        System.out.println("========================================\n");
    }
}