import java.util.Locale;
import java.util.Scanner;

public  class exercise2_8_75 {
  String name;
  double GrossSalary;
  double tax;
  double NetSalary(){
      return(GrossSalary-tax);
    };
}

public static void main (String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    company infos = new company();


}
