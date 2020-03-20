package java;
//TODO All these items should be in some kind of user interaction class, not the main.
//TODO But I'm not sure which class in the new structure serves the UI purpose.

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Double billAmount;
//TODO Not sure how to get shopping receipt total. Ask user? Get from other method?
        Scanner myObj = new Scanner(System.in);
        String fundName;
        Float initialTotal;
        Double newTotal;
    }

    public String getCustomerName() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter your name");
        String customerName = myObj.nextLine();
        return customerName;
    }
    public boolean transferYorN() {
        Scanner Transfer = new Scanner(System.in);
        boolean deposit= false;
        System.out.println("Would you like to invest your change? Choose: Y or N");
        String choice = Transfer.nextLine();
        if (choice.equals("Y")) {
            System.out.println("Cool.");
            deposit = true;}
        //     run getInvestmentAmount() method
        else if (choice.equals("N")){
            System.out.println("That's too bad. Maybe next time.");}
        //Exit the program
        return deposit;
    }

    public Double getInvestmentAmount(double billAmount) {
        Scanner myObj = new Scanner(System.in);
        Double investThis = 0.0;
        System.out.println("How much would you like to invest? Please Choose:" + "\n" + "1. Round up to the next " +
                "dollar." + "\n" + "2. Choose my own number.");
        int option = myObj.nextInt();
        if (option == 1) {
            investThis = (Math.nextUp(billAmount)) - billAmount;
            Double newTotal = billAmount + investThis;

        }
        if (option == 2) {
            Scanner newObj = new Scanner(System.in);
            System.out.println("Please enter the amount you would like to add.");
            investThis = newObj.nextDouble();
            Double newTotal = billAmount + investThis;
            System.out.println("Your new total is:"+ newTotal);
        }
        return investThis;

    }
    public void investmentDestination() {
        Scanner thisObj = new Scanner(System.in);
        System.out.println("Where would you like to send the funds? Please Choose:" + "\n" + "1. Send to a family " +
                "member's account" + "\n" + "2. Donate to a charity" + "\n" + "3. Invest in a mutual fund");
        int option = thisObj.nextInt();
        if (option == 1) {
            //call Deposit() method to family class
        }
        if (option == 2) {
            //call Deposit() method to Charity class
        }
        if (option == 3) {
            //call Deposit() method to Mutual fund
        }
    }
    public void printConsole () {
    }


}
