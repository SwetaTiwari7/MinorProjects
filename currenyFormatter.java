import java.util.*;
import java.text.*;
import java.math.*;

public class currenyFormatter{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
       
        Locale loc = new Locale("en","IN");
        
        NumberFormat usdformatteFormat =NumberFormat.getCurrencyInstance(Locale.US);
       
        
        NumberFormat inrformatteFormat =NumberFormat.getCurrencyInstance(loc);
       
        
         NumberFormat cinformatteFormat =NumberFormat.getCurrencyInstance(Locale.CHINA);
        
        
        NumberFormat fraformatteFormat =NumberFormat.getCurrencyInstance(Locale.FRANCE);
      
        
        BigDecimal d = BigDecimal.valueOf(payment);
        String us= usdformatteFormat.format(d);
        String india= inrformatteFormat.format(d);
        String china= cinformatteFormat.format(d);
        String france= fraformatteFormat.format(d);
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
