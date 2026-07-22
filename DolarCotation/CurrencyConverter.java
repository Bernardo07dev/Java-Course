package DolarCotation;

public class CurrencyConverter {
      public static double convertion(double value, double price){
            return value * price + (value * price * 0.06);
      } 
}
