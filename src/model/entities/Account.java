package model.entities;

import model.exceptions.InsufficientBalanceException;
import model.exceptions.WithdrawLimitExceededException;

public class Account {
	
	    private Integer number;
	    private String holder;
	    private Double balance;
	    private Double withdrawLimit;

	    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
	        this.number = number;
	        this.holder = holder;
	        this.balance = balance;
	        this.withdrawLimit = withdrawLimit;
	    }

	    public void deposit(Double amount) {
	        balance += amount;
	    }

	    public void withdraw(Double amount) throws InsufficientBalanceException, WithdrawLimitExceededException {
	        if (balance < amount) {
	            throw new InsufficientBalanceException("Not enough balance");
	        }
	        if (amount >	 withdrawLimit) {
	            throw new WithdrawLimitExceededException("The amount exceeds withdraw limit");
	        }
	        balance -= amount;
	    }

	    public Double getBalance() {
	        return balance;
	    }
	}


	
