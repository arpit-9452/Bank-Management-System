import java.util.Scanner;

public class Main {
    public static double debitAmount(double acBal, double debitAmt) {
        if (debitAmt <= 0 || debitAmt > acBal) {
            System.out.println("Widraw Transaction Failed..");
        } else {
            System.out.println("Widraw Transaction has SuccessFully Completed..");
        }
        double amtAfterDebit = acBal - debitAmt;
        return amtAfterDebit;
    }

    public static double creditAmount(double acBal, double creditAmt) {
        if (creditAmt <= 0 || creditAmt > 100000) {
            System.out.println("Credit Transaction has Failed..");
        } else {
            System.out.println("Credit Transaction SuccessFully Completed..");
        }
        double amtAfterCredit = acBal + creditAmt;
        return amtAfterCredit;
    }

    public static void main(String args[]) {
        System.out.println("Welcome to CC Bank");
        System.out.println("Please Enter your 4 digits Bank Pin..");
        int bPin = 9452;
        double acBal = 5540.60;
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        if (pin == bPin) {
            System.out.println("Pin Matched...");
            System.out.println("Press 1 for View Balance, 2 for Debit Amount, 3 for Credit Amount, 4 for KYC");
            int entry = sc.nextInt();
            if (entry == 1) {
                System.out.println("Your Account Balance is " + acBal);
            }
            if (entry == 2) {
                System.out.println("How much you Want to Debit from your Account..?");
                double debitAmt = sc.nextDouble();
                double amtAfterDebit = debitAmount(acBal, debitAmt);
                System.out.println("Your Account Balance is " + amtAfterDebit);
            }
            if (entry == 3) {
                System.out.println("How much Amount you want to Credit..?");
                double creditAmt = sc.nextDouble();
                double amtAfterCredit = creditAmount(acBal, creditAmt);
                System.out.println("Your Acount Balance is " + amtAfterCredit);
            }
            if(entry == 4){
                System.out.println("Welcome to the KYC saction..");
                System.out.println("Please Enter your 10 digits Mobile Number..");
                double mobileNumber = sc.nextDouble();
                double mustcharectorMobile = 10;
                if(mobileNumber<= mustcharectorMobile || mobileNumber> mustcharectorMobile){
                    System.out.println("You Enter Invalid Mobile Number..");
                }
                else{
                    System.out.println("Mobile Number Veryfied..");
                }
            }
            else{
                System.out.println("Invalid Entry..");
            }
        } 
        else {
            System.out.println("Invalid Bank Pin...");
        }
    }
}