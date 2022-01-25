package components;

import java.time.LocalDate;

public class Credit extends Flow{

	public Credit(String comment, double amount, int toAccountNumber, boolean effect,
			LocalDate transactionDate) {
		super(comment, amount, toAccountNumber, effect, transactionDate);
	}

}
