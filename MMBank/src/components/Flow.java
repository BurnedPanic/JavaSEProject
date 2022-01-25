package components;

import java.time.LocalDate;

//1.3.2 Creation of the Flow class

public abstract class Flow {
	private String comment;
	private static int count = 1;
	private int identifier;
	private double amount;
	private int toAccountNumber;
	private boolean effect;
	private LocalDate transactionDate;
	
	public Flow(String comment, double amount, int toAccountNumber, boolean effect, LocalDate transactionDate) {
		this.comment = comment;
		this.identifier = count++;
		this.setAmount(amount);
		this.setToAccountNumber(toAccountNumber);
		this.setEffect(effect);
		this.setTransactionDate(transactionDate);
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}


	public int getIdentifier() {
		return identifier;
	}
	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}


	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}


	public int getToAccountNumber() {
		return toAccountNumber;
	}
	public void setToAccountNumber(int toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}


	public boolean isEffect() {
		return effect;
	}
	public void setEffect(boolean effect) {
		this.effect = effect;
	}


	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
}
