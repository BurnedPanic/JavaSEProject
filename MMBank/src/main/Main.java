package main;

import java.util.ArrayList;

import components.Client;
import components.CurrentAccount;
import components.SavingsAccount;

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
	}
}
