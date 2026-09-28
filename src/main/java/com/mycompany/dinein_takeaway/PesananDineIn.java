package com.mycompany.dinein_takeaway;

public class PesananDineIn extends Pesanan {

    private int nomorMeja;

    public PesananDineIn(String namaPelanggan, int nomorMeja) {
        super(namaPelanggan);
        setNomorMeja(nomorMeja);
    }

    @Override
    public String getTipePesanan() {
        return "Dine In";
    }

    public int getNomorMeja() {
        return nomorMeja;
    }

    public void setNomorMeja(int nomorMeja) {
        if (nomorMeja > 0) {
            this.nomorMeja = nomorMeja;
        } else {
            System.out.println("X Error: Nomor meja harus lebih dari 0!");
        }
    }

    @Override
    public void cetakStruk() {

        System.out.println("========================================");
        System.out.println("           STRUK DINE IN                ");
        System.out.println("========================================");

        System.out.println("Nama Pelanggan : " + getNamaPelanggan());
        System.out.println("Tipe Pesanan   : " + getTipePesanan());
        System.out.println("Nomor Meja     : " + nomorMeja);
        System.out.println("Status         : " + getStatusPesanan());

        System.out.println("----------------------------------------");
        System.out.println("Item Pesanan:");

        if (getDaftarMenu().isEmpty()) {
            System.out.println("(Belum ada menu yang dipesan)");
        } else {
            for (Menu m : getDaftarMenu()) {
                m.tampilkanInfo();
            }
        }

        System.out.println("----------------------------------------");
        System.out.printf("TOTAL BAYAR: Rp%,.0f%n", hitungTotal());
        System.out.println("========================================\n");
    }
}