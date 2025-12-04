import java.util.Scanner;

public class AnalisiLaba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Masukkan jumlah jenis cookies: ");
        int jumlahJenis = input.nextInt();
        input.nextLine();

        String[] nama = new String[jumlahJenis];
        int[] hargaProduksi = new int[jumlahJenis];
         int[] hargaJual = new int[jumlahJenis];
        int[] jumlahTerjual = new int[jumlahJenis];

        int[] totalProduksi = new int[jumlahJenis];
        int[] totalPendapatan = new int[jumlahJenis];
        int[] labaRugi = new int[jumlahJenis];

        int totalSemua = 0;
        int labaTertinggi = Integer.MIN_VALUE;
        String cookiesLabaTertinggi = "";

        for (int i =0; i < jumlahJenis; i++){
            System.out.println("\nCookies ke-" + (i + 1));

            System.out.print("Nama cookies: ");
            nama[i] = input.nextLine();

            System.out.print("Harga produksi per bungkus: ");
            hargaProduksi[i] = input.nextInt();

            System.out.print("Harga jual per bungkus: ");
            hargaJual[i] = input.nextInt();

            System.out.print("Jumlah terjual: ");
            jumlahTerjual[i] = input.nextInt();
            input.nextLine();
             totalProduksi[i] = hargaProduksi[i] * jumlahTerjual[i];
            totalPendapatan[i] = hargaJual[i] * jumlahTerjual[i];
            labaRugi[i] = totalPendapatan[i] - totalProduksi[i];

            totalSemua += labaRugi[i];

            if (labaRugi[i] > labaTertinggi) {
                labaTertinggi = labaRugi[i];
                cookiesLabaTertinggi = nama[i];
        }
    }
    System.out.println("Nama\t\tProduksi\tPendapatan\tLaba/Rugi\tStatus");

        for (int i = 0; i < jumlahJenis; i++) {

            String status;
            if (labaRugi[i] > 0) status = "Laba";
            else if (labaRugi[i] < 0) status = "Rugi";
            else status = "Impas";

            System.out.println(
                nama[i] + "\t\t" +
                totalProduksi[i] + "\t\t" +
                totalPendapatan[i] + "\t\t" +
                labaRugi[i] + "\t\t" +
                status
            );
        }
        System.out.println("\nTotal laba/rugi keseluruhan: " + totalSemua);
        System.out.println("Cookies dengan laba tertinggi: " + cookiesLabaTertinggi);
    }
}
