package com.mycompany.dinein_takeaway;

import java.util.ArrayList;

public class Pesanan {

    private String namaPelanggan;
    private ArrayList<Menu> daftarMenu;
    private String statusPesanan;

    public Pesanan(String namaPelanggan) {
        setNamaPelanggan(namaPelanggan);
        this.daftarMenu = new ArrayList<>();
        this.statusPesanan = "Dalam Proses";
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public ArrayList<Menu> getDaftarMenu() {
        return daftarMenu;
    }

    public String getStatusPesanan() {
        return statusPesanan;
    }

    public String getTipePesanan() {
        return "Pesanan";
    }

    public void setNamaPelanggan(String namaPelanggan) {
        if (namaPelanggan != null && !namaPelanggan.isEmpty()) {
            this.namaPelanggan = namaPelanggan;
        } else {
            System.out.println("X Error: Nama pelanggan tidak boleh kosong!");
        }
    }

    public void setStatusPesanan(String statusPesanan) {

        if (statusPesanan != null &&
            (statusPesanan.equals("Dalam Proses")
            || statusPesanan.equals("Siap")
            || statusPesanan.equals("Selesai"))) {

            this.statusPesanan = statusPesanan;

        } else {
            System.out.println(
                "X Error: Status tidak valid! Gunakan: Dalam Proses, Siap, atau Selesai"
            );
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
        System.out.println("Tipe Pesanan   : " + getTipePesanan());
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