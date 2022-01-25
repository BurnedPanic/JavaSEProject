package components;

//1.2.1 Creation of the account class

public abstract class Accounts {
	protected String label;
	protected double balance;
	protected static int count = 1;
	protected int accountNumber;
	protected Client client;
	   public Accounts(Client client) {
	     this.client = client; 
	   }
	
	public Accounts(String label, Client client) {
		this.label = label;
		this.client = client;
		this.accountNumber = count++;		
		}
	
	 	public String getLabel() {  
	        return label;  
	    }  
	    public void setLabel(String label) {  
	        this.label = label;  
	    }  

	    
	    public double getBalance() {  
	        return balance;  
	    }  
	    public void setBalance(float balance) {  
	        this.balance = balance;  
	    }  
	    
		
	    public int getAccountNumber() {  
	        return accountNumber;  
	    }  
	    public void setAccountNumber(int accountNumber) {  
	        this.accountNumber = accountNumber;  
	    }  
	    
	    public Client getClient() {
	    	return client;    
	    }
	    public void setClient(Client client) {
	    	this.client = client;
	    }
	      
	    public String toString() {
			return client + " " + "\n" + accountNumber +" " + label + " " + balance;
		}    	 
}
