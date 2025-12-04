import java.util.Scanner;

public class cekprima {
     public static void main(String[] args) {
    Scanner inputan =new Scanner(System.in);
         int bilangan1;
         System.out.println("Masukkan bilangan : ");
         bilangan1 = inputan.nextInt();
         
         boolean prima = true;
         
         if(bilangan1 < 1000 || bilangan1 > 2000){
             System.out.println("input anda salah");
         }
        
        if(bilangan1 < 2){
            prima = false;
        }else{
            for(int i = 2; i <=Math.sqrt(bilangan1); i++){
                if(bilangan1 % i == 0){
                    prima = false;
                    break;
                }
            }
        }
        if(prima){
            System.out.println(bilangan1 + "adalah bilangan prima");
        }else{
            System.out.println(bilangan1 + "bukan bilangan prima");
        }
    }
}
