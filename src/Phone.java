public class Phone {
    private String note;
    private Bank bank;

    public Phone(String note, Bank bank) {
        this.note = note;
        this.bank = bank;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
    public static void calculator(int number1, int number2, char operation){
        switch (operation){
            case '+' -> System.out.println("Result: " + (number1 + number2));
            case '-' -> System.out.println("Result: " + (number1 - number2));
            case '*' -> System.out.println("Result: " + (number1 * number2));
            case '/' -> System.out.println("Result: " + (number1 / number2));
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "note='" + note + '\'' +
                ", bank=" + bank +
                '}';
    }
}
