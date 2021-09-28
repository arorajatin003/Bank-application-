package academy.learnprogramming;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name){
        Branch newBranch = new Branch(name);
        if(findBranch(name) ==  null) {
            branches.add(newBranch);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String name, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            branch.addCustomer(name,amount);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String name, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            branch.addCustomerTransaction(name,amount);
            return true;
        }
        return false;
    }

    private Branch findBranch(String name){
        for(Branch branch : branches){
            if(branch.getName().equals(name)){
                return branch;
            }
        }
        return null;
    }

    public void listCustomers(String branchName, boolean printTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customer detail for branch "+branchName);
            if(printTransaction){
                int i=1;
                for(Customer customer:branch.getCustomers()){
                    System.out.println("Customer: "+ customer.getName()+"[" + i +"]");
                    System.out.println("Transactions");
                    int j=1;
                    for(double transaction : customer.getTransactions()){
                        System.out.println("["+j+"] Amount "+transaction );
                        j++;
                    }
                   i++;

                }
            }else {
                int i=1;
                for(Customer customer:branch.getCustomers()){
                    System.out.println("Customer: "+ customer.getName()+"[" + i +"]");
                    i++;
                }
            }
        }
    }
}
