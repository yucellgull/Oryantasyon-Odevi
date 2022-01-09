
/*1'den Kullanıcı tarafından girilen sayıya kadar olan asal sayıları bulma
*/
import java.util.Scanner;
public class soru10 { 

    
    public static void main(String[]args) {
        
        int i,j;
        int bolensayac = 0;
      
        
        Scanner klavye = new Scanner(System.in);

        System.out.print("Hangi sayıya kadar olan asal sayılar yazılsın:");
        int sonsayi = klavye.nextInt();

        for(i=3; i<sonsayi; i++){
            for(j=2; j<i; j++){
                if(i%j==0)bolensayac++;
               
            }
             if(bolensayac==0)System.out.print(i+"-");
             bolensayac=0;
        }

    }
    
}