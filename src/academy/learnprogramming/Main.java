package academy.learnprogramming;

public class Main {
    public static Bank bank = new Bank("Jatin");
    public static void main(String[] args) {
	// write your code here
        bank.addBranch("Arora");
        bank.addCustomer("Arora","Ashok Arora", 100);
        bank.addCustomer("Arora","Ashok Arora", 100);
        bank.addCustomer("Arora","Jatin Arora", 100);
        bank.addCustomer("Arora","Kartik Arora", 100);
        bank.addCustomerTransaction("Arora","Ashok Arora",123);
        bank.addCustomerTransaction("Arora","Ashok Arora",123);
        bank.addCustomerTransaction("Arora","Deepika Arora",123);
        bank.listCustomers("Arora",true);
        bank.listCustomers("Arora",false);
    }
}
