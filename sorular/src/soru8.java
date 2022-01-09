/*yüksekliği ve taban alanı girilen üçgenin alanını hesaplayan program
*/
import java.util.Scanner;
public class soru8 { 

    
    public static void main(String[]args) {
        
        double h,a,alan;
        
        Scanner klavye = new Scanner(System.in);

        System.out.print("Yüksekliği Giriniz:");
        h = klavye.nextInt();

        System.out.print("Taban uzunluğunu giriniz:");
        a = klavye.nextInt();

        alan = a*h/2;
      
        System.out.println("Üçgenin alanı="+alan);
        
       

    }
    
}