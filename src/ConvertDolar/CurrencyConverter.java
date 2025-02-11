package ConvertDolar;

public class CurrencyConverter {
    public static double dolar( double dolar){
        return dolar;
    }
    public static double quantidade( double quantidade){
        return quantidade;
    }
    public static double valorTotal(double dolar, double quantidade){
        double total = dolar * quantidade;
        return total + (total* 0.06);
    }
    public static double percent(double dolar, double quantidade){
        double total = dolar * quantidade;
        return total * 0.06;
    }
}
