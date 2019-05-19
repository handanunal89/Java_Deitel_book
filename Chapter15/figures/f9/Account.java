/**
 *Figures 15.9 -   Account
 * 
 * Author: Handan Unal
 * 
 */
package figures.f9;

import java.io.Serializable;

public class Account implements Serializable {

	private int account;
	private String firstName;
	private String lastName;
	private double balance;

	public Account() {
		this(0, "", "", 0.0); // call other constructor
	}

	public Account(int account, String firstName, String lastName, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = account;
		this.balance = balance;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
