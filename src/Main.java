//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double INTEREST_RATE = 0.17;
        double balance = 5000;

        double monthlyBalance = balance + (balance * INTEREST_RATE);
        System.out.println("Your balance after one month is: " + monthlyBalance);

        System.out.println("Your balance after two months is: " + monthlyBalance);


    }
}