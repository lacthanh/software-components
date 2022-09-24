package homework3.customer_and_account;

public class TestMain {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(520, "Thanh", 'f');
		System.out.println(customer1);
		
        Customer customer2 = new Customer(910, "Phong", 'm');
        System.out.println(customer2.getGender());
        System.out.println(customer2.getID());
        System.out.println(customer2.getName());

        Account account1 = new Account(520, customer1);
        Account account2 = new Account(910, customer2, 10000);
        System.out.println(account2);
        System.out.println(account2.getBalance());
        System.out.println(account2.getId());
        System.out.println(account2.getCustomer());
        System.out.println(account2.getCustomerName());

        account1.setBalance(1000);
        System.out.println(account1);
        System.out.println(account1.withdraw(1000));
        System.out.println(account2.withdraw(1000));
        System.out.println(account1.deposite(1000));		
	}

}
