import java.util.Scanner;

public class Biayapeminjaman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama peminjaman: ");
        String nama = input.nextLine();

        System.out.println("Masukkan judul buku: ");
        String judul = input.nextLine();

        System.out.println("Masukkan kategori buku (A/B/C): ");
        String kategori = input.nextLine().toUpperCase();

        System.out.println("Masukkan Lama pinjam (hari): ");
        int LamaPinjam = input.nextInt();
       
        //tarif per kategori
        int tarif=0;
        String keterangan="";

        if(kategori.equals("A")){
            tarif = 2000;
            keterangan = "Kategori A (Buku Pelajaran / Referensi)- Rp 2.000/hari";
        }else if (kategori.equals("B")) {
            tarif = 1500;
            keterangan = "Kategori B (Novel / Komik)- Rp 1.500/hari";
        }else if (kategori.equals("C")) {
            tarif = 1000;
            keterangan = "Kategori C (Majalah / Buku Umum)- Rp 1.000/hari";
        }else{
            System.out.println("Kategori tidak valid!");
            return;
        }
        //biaya awal
        int biayaAwal = tarif * LamaPinjam;

        //hitung denda
        int denda = 0;
        if(LamaPinjam > 7 ){
            int hariDenda = LamaPinjam - 7;
            denda = hariDenda *500;
        }
        //total biaya
        int totalBiaya = biayaAwal + denda;

        //output
        System.out.println("\n=== Rincian Peminjaman Buku ===");
        System.out.println("Nama Peminjam: " + nama);
        System.out.println("Judul Buku: " + judul);
        System.out.println("Kategori Buku: " + kategori);
        System.out.println("Keterangan Kategori: " +keterangan);
        System.out.println("Lama Pinjam: " + LamaPinjam + " hari");
        System.out.println("Biaya Awal: Rp " + biayaAwal);
        System.out.println("Denda: Rp " + denda);
        System.out.println("Total Biaya: Rp " + totalBiaya);
    }
}
