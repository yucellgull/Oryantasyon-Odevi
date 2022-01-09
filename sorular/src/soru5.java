
/*1'den 100'e kadar olan sayıların toplamı
*/

public class soru5 { 

    
    public static void main(String[]args) {
        
       int i;
       int toplam =0;
       for(i=1; i<100; i++){
           toplam+=i;
       }
        
        System.out.println("1'den 100'e kadar olan sayıların toplamı="+toplam);
        
    }
    
}