package folhas.section_9_89;

import java.util.Locale;
import java.util.Scanner;

public class exercise89 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = input.nextInt();

        System.out.print("Enter account holder name: ");
        input.nextLine();
        String holder = input.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = input.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter deposit amount: ");
            double initialDeposit = input.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }

        else{
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter deposit amount: ");
        double depositValue = input.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account amount:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = input.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account amount:");
        System.out.println(account);


        input.close();
    }
}
