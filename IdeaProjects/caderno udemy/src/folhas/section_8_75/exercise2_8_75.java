package folhas.section_8_75;
import java.util.Locale;
import java.util.Scanner;

//metodos.
public class exercise2_8_75{
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        System.out.print("Name: ");
        emp.name=sc.nextLine();

        System.out.print("Gross salary: ");
        emp.GrossSalary=sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println("Updated data: " + emp);
        sc.close();

    }

}

//atributos

class Employee {

    String name;
    double GrossSalary;
    double tax;

    double NetSalary() {
        return (GrossSalary - tax);
    }

    void increaseSalary(double percentage) {
        GrossSalary += GrossSalary * percentage / 100.0;
    }
    public String toString() {
        return name + " , $ " + NetSalary();
    }

}


