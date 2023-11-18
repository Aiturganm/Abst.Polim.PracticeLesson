import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerForNum = new Scanner(System.in);
        Bank bank = new Bank(3700);
        Phone phone = new Phone("Samsung note", bank);
        System.out.println(phone);
        while(true){
            System.out.println("""
                    
                    1. Change note
                    2. Calculator
                    3. Bank system
                    4. Exit
                    
                    """);
            System.out.println("Enter the number");
            int operation = scannerForNum.nextByte();
            switch (operation){
                case 1: {
                    System.out.println("Old note: " + phone.getNote());
                    System.out.println("Write sentence to change note: ");
                    String newNote = new Scanner(System.in).nextLine();
                    phone.setNote(newNote);
                    System.out.println("Note succesfully changed. ");
                    System.out.println("New note: " + phone.getNote());
                    break;
                }
                case 2: {
                    System.out.println("Enter the first number: ");
                    int num1 = scannerForNum.nextInt();
                    System.out.println("Enter the second number: ");
                    int num2 = scannerForNum.nextInt();
                    System.out.println("Enter the operation: ");
                    char oper = new Scanner(System.in).nextLine().charAt(0);
                    Phone.calculator(num1, num2, oper);
                    break;
                }
                case 3: {
                    int num;
                    boolean isTrue = true;
                    while(isTrue){
                        System.out.println("""
                                
                                1. Check balance
                                2. Send money
                                3. Send money to phone number
                                4. Close
                                
                                Chose the number:
                                """);
                        num = scannerForNum.nextInt();
                        switch (num){
                            case 1: {
                                bank.checkBalance();
                                break;
                            }
                            case 2: {
                                System.out.println("Enter the sum: ");
                                bank.sendMoney(new Scanner(System.in).nextInt());
                                break;
                            }
                            case 3: {
                                System.out.println("Enter the phone number: ");
                                long phoneNum = scannerForNum.nextLong();
                                System.out.println("Enter the sum: ");
                                int cash = scannerForNum.nextInt();
                                bank.sendToNum(phoneNum, cash);
                                break;
                            }
                            case 4: {
                                isTrue=false;
                                break;
                            }
                        }
                        }
                    break;
                }
                case 4: {
                    return;
                }
                }
            }
        }
}