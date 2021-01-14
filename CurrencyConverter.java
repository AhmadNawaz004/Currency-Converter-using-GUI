import javax.swing.JOptionPane;
import java.util.Scanner;
import java.text.DecimalFormat;
public class CurrencyConverter {
    public static void main(String[] args) {
        Converter obj = new Converter();    
        Scanner in = new Scanner(System.in);
        double money, count;
        String currency2 = null, m;
        
        JOptionPane.showMessageDialog(null,"Welcome to my 1st Currency Converter","Currency Converter", JOptionPane.PLAIN_MESSAGE);
        String currency1 = JOptionPane.showInputDialog("US_Dollar,  Euro,   British_Pound,  AUS_Dollar, PAK_Ruppees\nPlease Enter the Currency from Above you want to convert:");
        if(currency1.equals("US_Dollar") || currency1.equals("Euro") || currency1.equals("British_Pound") || currency1.equals("AUS_Dollar") || currency1.equals("PAK_Ruppees"))
        {
         //   System.out.println("\nPlease enter the currency you want to convert into from above choices:");
            currency2 = JOptionPane.showInputDialog("US_Dollar,  Euro,   British_Pound,  AUS_Dollar, PAK_Ruppees\nPlease enter the currency you want to convert into from above choices:");
                    if(currency1.equals("US_Dollar") || currency1.equals("Euro") || currency1.equals("British_Pound") || currency1.equals("AUS_Dollar") || currency1.equals("PAK_Ruppees"))
                        count = 0;//this line is only to run the if statement if true
                    else
                       {
                          // System.out.println("Invalid Currency\nPlease Restart the Program and enter the correct Currency");
                           JOptionPane.showMessageDialog(null, "Invalid Currency\nPlease Restart the Program and enter the correct Currency","Error",JOptionPane.PLAIN_MESSAGE);
                           System.exit(0);
                       }
        }
        else
        {
           // System.out.println("Invalid Currency\nPlease Restart the Program and enter the correct Currency");
            JOptionPane.showMessageDialog(null, "Invalid Currency\nPlease Restart the Program and enter the correct Currency","Error",JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
       
       // System.out.print("\nPlease Enter the amount for converstion: ");
        m = JOptionPane.showInputDialog("\nPlease Enter the amount for converstion: ");
        money = Double.parseDouble(m);
        if(money < 0){
              // System.out.println("The amount entered is negative value, Please restart the program and Enter the correct amount");
              JOptionPane.showMessageDialog(null, "The amount entered is negative value, Please restart the program and Enter the correct amount","Error",JOptionPane.PLAIN_MESSAGE); 
              System.exit(0);
        }
        
        if(currency1.equals("US_Dollar"))
            obj.Dollar(currency2, money);
        else if(currency1.equals("Euro"))
            obj.Euro(currency2, money);
         else if(currency1.equals("British_Pound"))
            obj.BritishPound(currency2, money);
         else if(currency1.equals("AUS_Dollar"))
            obj.AusDollar(currency2, money);
         else if(currency1.equals("PAK_Ruppees"))
            obj.PakRuppees(currency2, money);
    }
    
}
 
class Converter {
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner in = new Scanner(System.in);
        private double conversion;
        public void Dollar(String currency2, double amount){
            if(currency2.equals("US_Dollar"))
                conversion = amount * 1;
            else if(currency2.equals("Euro"))
                conversion = amount * 0.87786;
            else if(currency2.equals("British_Pound"))
                conversion = amount * 0.77440;
            else if(currency2.equals("AUS_Dollar"))
                conversion = amount * 1.39459;
            else if(currency2.equals("PAK_Ruppees"))
                conversion = amount * 139.071;
         //   System.out.println("Converted amount : "+f.format(conversion));
            JOptionPane.showMessageDialog(null, "Converted amount : "+f.format(conversion),"Currency Converter",JOptionPane.PLAIN_MESSAGE);
            
        }
        
        public void Euro(String currency2, double amount){
             if(currency2.equals("US_Dollar"))
                conversion = amount * 1.13899;
            else if(currency2.equals("Euro"))
                conversion = amount * 1;
            else if(currency2.equals("British_Pound"))
                conversion = amount * 0.88208;
            else if(currency2.equals("AUS_Dollar"))
                conversion = amount * 1.58855;
            else if(currency2.equals("PAK_Ruppees"))
                conversion = amount * 158.401;
           JOptionPane.showMessageDialog(null, "Converted amount : "+f.format(conversion),"Currency Converter",JOptionPane.PLAIN_MESSAGE);  
           // System.out.println("Converted amount : "+f.format(conversion));
        }
        public void BritishPound(String currency2, double amount){
            if(currency2.equals("US_Dollar"))
                conversion = amount * 1.29109;
            else if(currency2.equals("Euro"))
                conversion = amount * 1.13342;
            else if(currency2.equals("British_Pound"))
                conversion = amount * 1;
            else if(currency2.equals("AUS_Dollar"))
                conversion = amount * 1.80055;
            else if(currency2.equals("PAK_Ruppees"))
                conversion = amount * 179.554;   
            //System.out.println("Converted amount : "+f.format(conversion));
            JOptionPane.showMessageDialog(null, "Converted amount : "+f.format(conversion),"Currency Converter",JOptionPane.PLAIN_MESSAGE);
            }
        public void AusDollar(String currency2, double amount){
            if(currency2.equals("US_Dollar"))
                conversion = amount * 0.71691;
            else if(currency2.equals("Euro"))
                conversion = amount * 0.62939;
            else if(currency2.equals("British_Pound"))
                conversion = amount * 0.55518;
            else if(currency2.equals("AUS_Dollar"))
                conversion = amount * 1;
            else if(currency2.equals("PAK_Ruppees"))
                conversion = amount * 99.7017;   
            //System.out.println("Converted amount : "+f.format(conversion));
            JOptionPane.showMessageDialog(null, "Converted amount : "+f.format(conversion),"Currency Converter",JOptionPane.PLAIN_MESSAGE);
        }
        public void PakRuppees(String currency2, double amount){
            if(currency2.equals("US_Dollar"))
                conversion = amount * 0.00716;
            else if(currency2.equals("Euro"))
                conversion = amount * 0.00628;
            else if(currency2.equals("British_Pound"))
                conversion = amount * 0.00554;
            else if(currency2.equals("AUS_Dollar"))
                conversion = amount * 0.00998;
            else if(currency2.equals("PAK_Ruppees"))
                conversion = amount * 1;   
          // System.out.println("Converted amount : "+f.format(conversion));
          JOptionPane.showMessageDialog(null, "Converted amount : "+f.format(conversion),"Currency Converter",JOptionPane.PLAIN_MESSAGE);
        }       
        
}
