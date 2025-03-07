public class Main {

    public static void main(String[] args) {

        // Tworzymy nowe konto bankowe
        BankAccount konto = new BankAccount("123456789", 5000, "Jan Kowalski", "jan.kowalski@example.com", "123-456-789");

        BankAccount konto2 = new BankAccount("123456789123456789", 10000, "Marcin Kowalski", "marcin-kowalski@example.com", "123-456-789");

        // Wyświetlamy informacje początkowe
        System.out.println("Konto utworzone dla: " + konto.getCustomerName());
        System.out.println("Początkowe saldo: " + konto.getBalance() + " PLN.");

        // Testujemy wpłatę środków
        konto.deposit(1500);

        // Testujemy wypłatę środków
        konto.withdraw(3000);

        // Próba wypłaty większej niż saldo
        konto.withdraw(5000);

        // Próba wypłaty ujemnej kwoty
        konto.withdraw(-100);

        System.out.println("Konto utworzone dla: " + konto2.getCustomerName());
        System.out.println("Początkowe saldo: " + konto2.getBalance() + " PLN.");
        konto2.deposit(5000);
        konto2.withdraw(9000);
        konto2.withdraw(200000);


    }
}
