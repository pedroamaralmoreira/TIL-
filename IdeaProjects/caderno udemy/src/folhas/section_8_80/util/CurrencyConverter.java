package folhas.section_8_80.util;


public class CurrencyConverter {

    public static double IOF=0.06;
    public static double dollarToReal(double amount, double dollarPrice){
        double basic = amount * dollarPrice;
        double tax = basic * IOF;
        return basic + tax;
    }



    }

