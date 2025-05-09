// package bank;

@FunctionalInterface
interface Penalty {
    long compute(long balance, long minimumBalance);
}

public class code {
    private long accountNumber;
    private String name;
    private long balance;
    private static final long MINIMUM_BALANCE = 10_000;
    private static Penalty PENALTY = (bal, minBal) -> {
        long diff = minBal - bal;
        if (diff < 0) return 0;
        if (diff < 1_000) return 50;
        if (diff < 2_000) return 100;
        if (diff < 4_000) return 200;
        return 500;
    };

    public static void setPenalty(Penalty p) {
        PENALTY = p;
    }

    public code(long acNo, String n, long openBal) {
        this.accountNumber = acNo;
        this.name = n;
        this.balance = openBal;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public String getName() {
        return this.name;
    }

    public long getBalance() {
        return this.balance;
    }

    public void deposit(long amt) {
        this.balance += amt;
    }

    public boolean withdraw(long amt) {
        if (amt > this.balance) {
            return false;
        }
        this.balance -= amt;
        if (this.balance < MINIMUM_BALANCE) {
            this.balance -= PENALTY.compute(this.balance, MINIMUM_BALANCE);
        }
        return true;
    }

    @Override
    public String toString() {
        return "Account{" + this.accountNumber + ", " + this.name + ", " + this.balance + "}";
    }

    public static void main(String[] args) {
        code account = new code(457856, "Ashok", 100000);
     
        account.withdraw(95000);
        account.setPenalty(2000);
        System.out.println(account.toString());
    }
}