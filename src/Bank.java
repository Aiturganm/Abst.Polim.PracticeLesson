public class Bank {
    private int sum;

    public Bank(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void checkBalance(){
        System.out.println("Current balance: " + sum);
    }

    public void sendMoney(int cash){
        sum-=cash;
        System.out.println("After send money: " + sum);
    }
    public void sendToNum(long number, int cash){
        sum-=cash;
        System.out.println("You send a " + cash + " to phone number " + number);
    }
}
