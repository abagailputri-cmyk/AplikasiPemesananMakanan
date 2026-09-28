package com.mycompany.dinein_takeaway;

public class PesananTakeaway extends Pesanan {

    private String metodePengambilan;

    public PesananTakeaway(String namaPelanggan, String metodePengambilan) {
        super(namaPelanggan);
        setMetodePengambilan(metodePengambilan);
    }

    @Override
    public String getTipePesanan() {
        return "Takeaway";
    }

    public String getMetodePengambilan() {
        return metodePengambilan;
    }

    public void setMetodePengambilan(String metodePengambilan) {
        if (metodePengambilan != null && !metodePengambilan.isEmpty()) {
            this.metodePengambilan = metodePengambilan;
        } else {
            System.out.println("X Error: Metode pengambilan tidak boleh kosong!");
        }
    }

    @Override
    public void cetakStruk() {

        System.out.println("========================================");
        System.out.println("          STRUK TAKEAWAY                ");
        System.out.println("========================================");

        System.out.println("Nama Pelanggan : " + getNamaPelanggan());
        System.out.println("Tipe Pesanan   : " + getTipePesanan());
        System.out.println("Pengambilan    : " + metodePengambilan);
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