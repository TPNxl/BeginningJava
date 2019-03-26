/*
Create account by submitting name, type, balance
Create default account, when user is asked for info should add name and account type
Check if balance is zero to deposit
Print a summary of the account for the user
 */

package Bank;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("| Bank Management System v1.0.0 |\n");
        Scanner sc = new Scanner(System.in);
        Account defaultAccount = new Account("","",0.0f);
        defaultAccount.checkValues();

    }
}
