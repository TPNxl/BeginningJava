/* Account number, constructor should generate #
Name
Type
Balance ( >=0)
Create default constructor with account number; ask user for name and type of account, balance = 0
Create mutator, accessor, toString and equals methods
Create a withdraw method and a deposit method
Create a fee method (balance <= 200.00)
Create a transfer method between bank accounts
*/
package Bank;

import org.jetbrains.annotations.Nullable;
import java.util.Random;
import java.text.DecimalFormat;

public class Account {
    // Instance variables
    public int AcctNum = 0;
    private int accountNumber;
    private String name, type;
    private float balance = 0.0f;

    // Constructor
    public Account(@Nullable String nameInput, @Nullable String typeInput, @Nullable float balanceInput) {
        Random rand = new Random();
        accountNumber = rand.nextInt(999999);
        name = nameInput;
        type = typeInput;
        if (balanceInput < 0.0f) {
            System.out.println("ERROR: balance input less than 0");
            balance = 0.0f;
        }
        else {
            balance = (float)((int)(balanceInput*100)/100);
        }
    }

    // Accessors
    public int accountNumber() {
        return accountNumber;
    }
    public String name() {
        return name;
    }
    public String type() {
        return type;
    }
    public float balance() {
        return balance;
    }

    // Mutators
    public void checkValues() {
        if(name == null || name == "") {
            name = TPNxl.HelpfulMethods.ask("What is the account name for account #" + accountNumber + "?", true);
        }
        if(type == null || type == "") {
            type = TPNxl.HelpfulMethods.ask("What is the account type for account #" + accountNumber + "?", true);
        }
        if(balance < 0.0f) {
            System.out.println("ERROR: negative balance on account");
            balance = 0.0f;
        }
    }
    public void withdraw(float amount) {
        if(amount > balance) {
            System.out.println("ERROR: not enough balance to withdraw");
        }
        else {
            balance -= (float)((int)(amount*100)/100);
        }
    }
    public void deposit(float amount) {
        balance += (float)((int)(amount*100)/100);
    }
    public void fee() {
        if(balance <= 200.0f && balance >= 50.0f) {
            balance -= 50.0f;
        }
        else if (balance < 50.0f) {
            balance = 0.0f;
        }
    }
    public void transfer(Object receiver, float amount) {
        if(amount > balance) {
            System.out.println("ERROR: not enough balance to transfer");
        }
        else {
            amount = (float)((int)(amount*100)/100);
            Account objReceiver = (Account)receiver;
            objReceiver.deposit(amount);
            withdraw(amount);
        }
    }

    // toString, equals()
    public String toString() {
        DecimalFormat round2 = new DecimalFormat("#0.00");
        return "account number: " + accountNumber + "; account name: " + name + "; account type: " + type + "; current balance: " + round2.format(balance);
    }
    public boolean equals(Object o) {
        if(!(o instanceof Account)) {
            return false;
        }
        else {
            Account objAccount = (Account)o;
            return accountNumber == objAccount.accountNumber && name.equals(objAccount.name) && type.equals(objAccount.type) && balance == objAccount.balance;
        }
    }

}
