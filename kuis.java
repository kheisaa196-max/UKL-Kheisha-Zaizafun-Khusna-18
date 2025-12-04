import java.util.Random;
import java.util.Scanner;

public class kuis {
     public static void main(String[] args) {
       Scanner inputan = new Scanner (System.in);
       Random random = new Random();
       while(true){
       int angka = random.nextInt(10);
       System.out.println("Angka acak: "+angka);
       int pilihOp = random.nextInt(3);
       String op = "";
       if(pilihOp == 0) op = "*";       
       else if(pilihOp == 1) op = "/";
       else op = "%";
       
       int angka2 = random.nextInt(6)+1;
     System.out.println("Soal: "+angka+" "+op+" "+angka2+" = ");
     System.out.println("Jawaban kamu");
       int jawaban = inputan.nextInt();
        int hasil = 0;
        if(op.equals("*")){
            hasil= angka*angka2;
        }else if(op.equals("/")){
            hasil= angka/angka2;
        }else if(op.equals("%")){
            hasil= angka%angka2;
        }
        if (jawaban==hasil){
            System.out.println("jawaban benar");
        }else{
            System.out.println("jawaban salah, jawaban yang benar adalah "+hasil);
        } 
            System.out.println("Mau coba lagi?  (y/t)");
            String lagi = inputan.next();
            if(lagi.equalsIgnoreCase("t")){
                System.out.println("kuis berhenti. Terimakasih!");
                break;
            }
        }
        }
    }

