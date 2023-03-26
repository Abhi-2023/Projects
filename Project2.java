import java.util.*;

public class Project2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our falaana dhimkana bank.");
        System.out.println("Please enter your name.");
        String name = sc.nextLine();
        System.out.println("Please enter your Customer ID.");
        String customerID = sc.nextLine();
        BankAccount BA = new BankAccount(name, customerID);
        BA.menu();

    }
}

    class BankAccount {
        double bal;
        double prevtrans;
        String name;
        String customerID ;
        BankAccount(String name, String customerID){
            this.name = name;
            this.customerID = customerID;
        }
        void deposit(double amt){
            if(amt > 0){
                bal += amt;
                prevtrans = amt;
            }
        }
        void withdraw (double amt){
            if(amt> 0 && bal >=amt){
                bal -=amt;
                prevtrans=- amt;
            }
            else {
                System.out.println("Balance is insufficient to withdraw this amount.");
            }
        }
        void getprevtrans(){
            if(prevtrans>0){
                System.out.println("Deposited Amount : " + prevtrans);
            }
            else if (prevtrans < 0){
                System.out.println("Withdrawn Amount :" + Math.abs(prevtrans));
            }
            else{
                System.out.println("No transaction occured.");
            }
        }
        void menu(){
            char option ;
            Scanner sc = new Scanner(System.in);
            System.out.println("*************************************************");
            System.out.println("Welcome : " + name);
            System.out.println("Your ID : " +customerID) ;
            System.out.println();
            System.out.println("Please select below mentioned option to process further.");
            System.out.println("Press a to check balance");
            System.out.println("Press b to deposit amount.");
            System.out.println("Press c to withdraw amount.");
            System.out.println("Press d to get details of previous transaction.");
            System.out.println("Press e to exit.");
            do{
                System.out.println("**************************************************");
                option = sc.next().charAt(0);
                switch (option){
                    case 'a' : 
                    System.out.println("......................");
                    System.out.println("Your balance is : " + bal);
                    System.out.println("......................");
                    break;
                    case 'b' :
                    System.out.println("......................");
                    System.out.println("Enter amount to deposit.");
                    double amtD = sc.nextDouble();
                    deposit(amtD);
                    break;
                    case 'c' :
                    System.out.println("......................");
                    System.out.println("Enter amount to withdraw.");
                    double amtW = sc.nextDouble();
                    break;
                    case 'd':
                    System.out.println("......................");
                    System.out.println("Your previous transaction.");
                    getprevtrans();
                    break;
                    case 'e' :
                    System.out.println("Thank you to use our system.");
                    default:
                    System.out.println("Please enter correct option.");
                }
            } while(option != 'e');

            System.out.println("Thank you to visiting our services, Hope you are satisfied with our services!!!");


        }
    }
    

