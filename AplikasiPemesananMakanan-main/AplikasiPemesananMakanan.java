package com.mycompany.aplikasipemesananmakanan;

public class AplikasiPemesananMakanan {

    public static void main(String[] args) {

        Menu nasiGoreng = new Menu("Nasi Goreng Spesial", 20000, "Makanan");
        Menu ayamGeprek = new Menu("Ayam Geprek", 18000, "Makanan");
        Menu esTeh      = new Menu("Es Teh Manis", 5000, "Minuman");

        Pesanan pesanan1 = new Pesanan("Zidan Ahmad", 7);
        pesanan1.tambahMenu(nasiGoreng);
        pesanan1.tambahMenu(esTeh);
        pesanan1.cetakStruk();

        Pesanan pesanan2 = new Pesanan("Luna Adelia");
        pesanan2.tambahMenu(ayamGeprek);
        pesanan2.cetakStruk();
    }
}