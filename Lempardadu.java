import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lempardadu {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    ArrayList<Integer> daduKomputer = new ArrayList<>();
    ArrayList<Integer> daduPlayer = new ArrayList<>();

    int skorKomputer = 0;
    int skorPlayer = 0;

    while (skorKomputer < 5 && skorPlayer < 5) {

        System.out.println("Tekan enter untuk melempar dadu");
        input.nextLine(); // diperbaiki

        int LempardaduKomputer = random.nextInt(6) + 1;
        int LempardaduPlayer = random.nextInt(6) + 1;

        daduKomputer.add(LempardaduKomputer);
        daduPlayer.add(LempardaduPlayer);

        System.out.println("Nilai dadu komputer: " + LempardaduKomputer);
        System.out.println("Nilai dadu player: " + LempardaduPlayer);

        if (LempardaduKomputer > LempardaduPlayer) {
            skorKomputer++;
            System.out.println("Komputer mendapatkan 1 poin");
        } else if (LempardaduPlayer > LempardaduKomputer) { // diperbaiki
            skorPlayer++;
            System.out.println("Player mendapatkan 1 poin");
        } else {
            System.out.println("Seri!");
        }

        System.out.println("Skor komputer: " + skorKomputer);
        System.out.println("Skor player: " + skorPlayer);
    }

    // === PERMAINAN SELESAI ===
    System.out.println("\n=== Permainan Selesai ===");

    if (skorPlayer == 5) {
        System.out.println("Pemenangnya adalah Player!");
    } else {
        System.out.println("Pemenangnya adalah Komputer!");
    }

    System.out.println("\nRiwayat Lempar dadu Komputer: " + daduKomputer);
    System.out.println("Riwayat Lempar dadu Player: " + daduPlayer);

    System.out.println("\nTotal kemenangan:");
    System.out.println("Player : " + skorPlayer);
    System.out.println("Komputer : " + skorKomputer);

    System.out.println("Terima kasih sudah bermain!");
}
 
}
