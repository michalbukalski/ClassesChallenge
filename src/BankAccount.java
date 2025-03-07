public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Konstruktor - inicjalizuje wartości konta
    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Gettery i settery
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Metoda do wpłacania środków
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Wpłacono: " + amount + " PLN. Nowe saldo: " + balance + " PLN.");
        } else {
            System.out.println("Nie można wpłacić kwoty mniejszej lub równej 0.");
        }
    }

    // Metoda do wypłacania środków
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Wypłacono: " + amount + " PLN. Nowe saldo: " + balance + " PLN.");
        } else if (amount > balance) {
            System.out.println("Nie można wypłacić " + amount + " PLN. Brak wystarczających środków.");
        } else {
            System.out.println("Nie można wypłacić kwoty mniejszej lub równej 0.");
        }
    }
}
