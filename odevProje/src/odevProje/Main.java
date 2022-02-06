package odevProje;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarBucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager customerManager = new StarBucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Hatice Kübra","Öçal",1998,"000000000000000"));
		
	}

}
