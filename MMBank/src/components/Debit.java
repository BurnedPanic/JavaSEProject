package components;

import java.time.LocalDate;

public class Debit extends Flow{

	public Debit(String comment, double amount, int toAccountNumber, boolean effect,
			LocalDate transactionDate) {
		super(comment, amount, toAccountNumber, effect, transactionDate);
	}
	

}
