package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

import components.Accounts;
import components.Client;
import components.Credit;
import components.CurrentAccount;
import components.Debit;
import components.Flow;
import components.SavingsAccount;
import components.Transfer;

//1.1.2 Creation of main class for tests
//1.2.3 Creation of the table account
//1.3.1 Adaptation of the table of accounts


public class Main {
	public static ArrayList<Client> CollectionOfClients = new ArrayList<Client>();
	public static ArrayList<CurrentAccount> CollectionOfCurrentAccounts = new ArrayList<CurrentAccount>();
	public static ArrayList<SavingsAccount> CollectionOfSavingsAccounts = new ArrayList<SavingsAccount>();

	
	public static void insertClientsInSavingsAccounts() {
		for (int j=0; j < CollectionOfClients.size(); j++) {
			CollectionOfSavingsAccounts.add(new SavingsAccount("Savings Account", CollectionOfClients.get(j)));
			System.out.println(CollectionOfSavingsAccounts.get(j));
		}
	}
	
	public static void insertClientsInCurrentAccounts() {
		for (int z=0; z < CollectionOfClients.size(); z++) {
			CollectionOfCurrentAccounts.add(new CurrentAccount("Current Account", CollectionOfClients.get(z)));
			System.out.println(CollectionOfCurrentAccounts.get(z));
		}
	}
	
	public static Client mateus = new Client("Maia", "Mateus");
	public static Client nathalia = new Client("Foureaux", "Nathalia");
	public static Client alessandra = new Client("Foureaux", "Alessandra");    
	
	
	public static Hashtable<Integer, String> accountIdentifier = new Hashtable<Integer, String>();
	
	public void fillAccountIdentifier() {
		for (int f=0; Accounts.getAccountNumber() > f; f++) {
			accountIdentifier.put(Accounts.getAccountNumber(), Accounts.class.toString());
		}
	}
	
	public Flow[] transactions = new Flow[4]; {
	transactions[0] = new Debit("Debit 50 account 1", 50, 1, true, LocalDate.now().plusDays(2));
	transactions[1] = new Credit("Credit 100.5 all current", 100.5, 1, true, LocalDate.now().plusDays(2));
	transactions[2] = new Credit("Credit 1500 all savings", 1500, 1, true, LocalDate.now().plusDays(2));
	transactions[3] = new Transfer("Transfer of 50 from account 1 to account 2", 50, 2, true, LocalDate.now().plusDays(2), 1);
	}
		
	public static void main(String[] args) {	
		CollectionOfClients.add(mateus);
	    CollectionOfClients.add(nathalia);
	    CollectionOfClients.add(alessandra);
		
	    insertClientsInSavingsAccounts();
	    
	    System.out.println();
	    
	    insertClientsInCurrentAccounts();

	    System.out.println();

		for (int i=0; i < CollectionOfClients.size(); i++) {
			System.out.println(CollectionOfClients.get(i));
		}
			
		Set<Integer> keys = accountIdentifier.keySet(); { 
			for(Integer x : keys) {
				System.out.println(accountIdentifier.get(x));
			}
		}
		
		System.out.println(accountIdentifier);		
	}
}
