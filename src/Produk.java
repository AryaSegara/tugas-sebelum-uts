public class Produk {
    String nama;
    Integer harga;

    public Produk(String nama, Integer harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public Integer hitungTotalHarga(Integer jumlah){
        return this.harga * jumlah;
    }
    
}
