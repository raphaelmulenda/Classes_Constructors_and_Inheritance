public class Main {
    public static void main(String[] args) {
        //SimpleCalculator calculator = new SimpleCalculator();
        //calculator.setFirstNumber(5);
        //calculator.setSecondNumber(0);
        //calculator.getAdditionResult();
        //calculator.getSubtractionResult();
       // calculator.getMultiplicationResult();
        //calculator.getDivisionResult();
        //Person person = new Person();
        //person.setFirstName("John");
       // person.setLastName("Doe");
        //person.setAge(3);
        //person.isTeen();
        //person.getFullName();
        BankAccount bank = new BankAccount();
        bank.setName("John Doe");
        bank.setEmail("doejhon@outlook.com");
        bank.setPhoneNumber("0815791436");
        bank.setAccountNumber(987654321);
        bank.setBalance(0);
        bank.getEmail();
        bank.getName();
        bank.getPhoneNumber();
        bank.getAccountNumber();
        bank.deposit(100);
        bank.getBalance();
        bank.withdraw(20);
        bank.getBalance();
        bank.withdraw(120);
        bank.getBalance();



    }

}
