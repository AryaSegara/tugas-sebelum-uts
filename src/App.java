import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan Nama Pembeli: ");
    String namaPembeli = input.nextLine();

    // Daftar Elektronik
    Elektronik televisi = new Elektronik("Televisi", 2500000);
    Elektronik laptop = new Elektronik("Laptop", 7500000);

    //Daftar Pakaian
    Pakaian kaos = new Pakaian("Kaos", 150000);
    Pakaian sepatu = new Pakaian("Sepatu", 40000);

    //Pilihan Produk
    System.out.println("Daftar Produk");
    System.out.println("1. " + televisi.nama + "(Rp. " + televisi.harga + ")");
    System.out.println("2. " + laptop.nama + "(Rp. " + laptop.harga + ")");
    System.out.println("3. " + kaos.nama + "(Rp. " + kaos.harga + ")");
    System.out.println("4. " + sepatu.nama + "(Rp. " + sepatu.harga + ")");

    System.out.print("Masukkan Nomor produk yang ingin di Beli : ");
    Integer pilihan = input.nextInt();

    Produk produkDiPilih = null;

    switch (pilihan) {
      case 1:
        produkDiPilih = televisi;
        break;
      case 2:
        produkDiPilih = laptop;
        break;
      case 3:
        produkDiPilih = kaos;
        break;
      case 4:
        produkDiPilih = sepatu;
        break;
      default:
      System.out.println("Produk yang anda pilih tidak tersedia");
        return;
    }
    //Jumlah produk yg ingin di beli
    System.out.print("Masukkan Jumlah : ");
    Integer jumlah = input.nextInt();

    //hitung jumlah total harganya
    Integer totalHarga = produkDiPilih.hitungTotalHarga(jumlah);
    System.out.println("Total yang harus di bayar :Rp. "+ totalHarga);

    //Pembayarannya
    Integer jumlahBayar;
    do{
      System.out.print("Masukkan Jumlah uang yang di bayar :Rp. ");
      jumlahBayar = input.nextInt();

      if(jumlahBayar < totalHarga){
        System.out.println("Uang yang anda masukkan kurang");
      }
    }while(jumlahBayar < totalHarga);

    //Hitung Kembaliannya
    Integer kembalian = jumlahBayar - totalHarga;


     // Menampilkan nota pembayaran
     System.out.println("\n=== Nota Pembayaran ===");
     System.out.println("Nama Pembeli: " + namaPembeli);
     System.out.println("Produk: " + produkDiPilih.nama);
     System.out.println("Jumlah: " + jumlah);
     System.out.println("Harga Satuan: Rp " + produkDiPilih.harga);
     System.out.println("Total Harga: Rp " + totalHarga);
     System.out.println("Jumlah Bayar: Rp " + jumlahBayar);
     System.out.println("Kembalian: Rp " + kembalian);
     System.out.println("======= Terima Kasih =======");

  }
}
