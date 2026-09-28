package com.mycompany.dinein_takeaway;

public class Dinein_takeaway {

    public static void main(String[] args) {

        // Membuat menu
        Menu nasiGoreng =
                new Menu("Nasi Goreng Spesial", 20000, "Makanan");

        Menu ayamGeprek =
                new Menu("Ayam Geprek", 18000, "Makanan");

        Menu esTeh =
                new Menu("Es Teh Manis", 5000, "Minuman");

        Menu kopi =
                new Menu("Kopi Hitam", 8000, "Minuman");

        // Membuat pelanggan
        Pelanggan pelanggan1 =
                new Pelanggan("Zidan Ahmad", "081234567890");

        Pelanggan pelanggan2 =
                new Pelanggan("Luna Adelia", "082345678901");

        // DINE IN
        PesananDineIn pesanan1 =
                new PesananDineIn("Zidan Ahmad", 7);

        pesanan1.tambahMenu(nasiGoreng);
        pesanan1.tambahMenu(esTeh);
        pesanan1.setStatusPesanan("Siap");

        pesanan1.cetakStruk();

        // TAKEAWAY
        PesananTakeaway pesanan2 =
                new PesananTakeaway(
                        "Luna Adelia",
                        "Ambil di Kasir"
                );

        pesanan2.tambahMenu(ayamGeprek);
        pesanan2.tambahMenu(kopi);
        pesanan2.setStatusPesanan("Selesai");

        pesanan2.cetakStruk();

        // Simpan riwayat
        pelanggan1.tambahRiwayatPesanan(pesanan1);
        pelanggan2.tambahRiwayatPesanan(pesanan2);

        // Demonstrasi inheritance
        System.out.println("==================================");
        System.out.println("     DEMONSTRASI INHERITANCE");
        System.out.println("==================================");

        System.out.println(
                "Pesanan 1 : "
                + pesanan1.getTipePesanan()
        );

        System.out.println(
                "Nomor Meja : "
                + pesanan1.getNomorMeja()
        );

        System.out.println();

        System.out.println(
                "Pesanan 2 : "
                + pesanan2.getTipePesanan()
        );

        System.out.println(
                "Metode Pengambilan : "
                + pesanan2.getMetodePengambilan()
        );

        System.out.println();

        // Informasi pelanggan
        pelanggan1.tampilkanInfo();
        pelanggan2.tampilkanInfo();

        pelanggan1.tampilkanRiwayatPesanan();
        pelanggan2.tampilkanRiwayatPesanan();
    }
}