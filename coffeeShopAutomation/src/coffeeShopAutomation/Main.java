package coffeeShopAutomation;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		
		Customer customer = new Customer();
		customer.setFirstName("Mahmut");
		customer.setLastName("Ataş");
		customer.setId(1);
		customer.setDateOfBirth(LocalDate.of(2015,1,2));
		customer.setNationalityId("12345678901");
		
		customerManager.Save(customer);
	}

}
