package components;

import java.time.LocalDate;

public class Transfer extends Flow{
	private int fromAccountNumber;

	public Transfer(String comment, double amount, int toAccountNumber, boolean effect,
			LocalDate transactionDate, int fromAccountNumber) {
		super(comment, amount, toAccountNumber, effect, transactionDate);
	}
	
	public int getFromAccountNumber() {
		return fromAccountNumber;
	}
	public void setFromAccountNumber(int fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}
}
