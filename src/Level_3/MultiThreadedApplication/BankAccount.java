package Level_3.MultiThreadedApplication;

class Account {

    private int balance = 1000;

    public synchronized void withdraw(int amount) {

        System.out.println(
                Thread.currentThread().getName()
                        + " is trying to withdraw ₹" + amount
        );

        if (balance >= amount) {

            System.out.println(
                    Thread.currentThread().getName()
                            + " withdrawal successful"
            );

            balance -= amount;

            System.out.println(
                    "Remaining balance: ₹" + balance
            );

        } else {

            System.out.println(
                    Thread.currentThread().getName()
                            + " withdrawal failed - Insufficient balance"
            );
        }
    }
}


public class BankAccount {

    public static void main(String[] args) {

        Account account = new Account();

        Thread user1 = new Thread(
                () -> account.withdraw(700),
                "User-1"
        );

        Thread user2 = new Thread(
                () -> account.withdraw(500),
                "User-2"
        );

        user1.start();
        user2.start();
    }
}