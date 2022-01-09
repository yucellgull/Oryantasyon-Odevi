
/* girilen üç sayıdan en büyüğünü hesaplayan program
*/
import java.util.Scanner;
public class soru3 { 

    
    public static void main(String[]args) {
        
        int a,b,c;
        
        Scanner klavye = new Scanner(System.in);

        System.out.print("1.Sayi:");
        a = klavye.nextInt();

        System.out.print("2.Sayi:");
        b = klavye.nextInt();
        
        System.out.print("2.Sayi:");
        c = klavye.nextInt();

        if(a>b && a>c)System.out.println("En buyuk sayi="+a);
        else if(b>a && b>c)System.out.println("En buyuk sayi="+b);
        else if(c>a && c>c)System.out.println("En buyuk sayi="+c);

       

    }
    
}
