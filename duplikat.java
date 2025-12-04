import java.util.HashSet;

public class duplikat {
     public static void main (String[]args){
        int[]angka={1,2,3,4,5,1,2,3,4,6,7,8,9,10};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplikat = new HashSet<>();
        boolean adaDuplikat = false;
        for(int i:angka){
            if(set.contains(i)){
               duplikat.add(i);
                adaDuplikat=true;
                }else{
                 set.add(i); 
                }
            }  
        
        if(!adaDuplikat){
             
            System.out.println("Tidak ada duplikat ditemukan.");
        }else{
            System.out.print("Duplikat ditemukan: "+duplikat);
        }
    }
}
