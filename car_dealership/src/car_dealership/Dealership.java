package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("123 blank street");
		cust1.setCashOnHand(25000);
		
		Vehicle vehicle = new Vehicle("Honda", "Accord", 10000);
		Vehicle car1 = new Vehicle("BMW", "M3", 20000);
		Vehicle car2 = new Vehicle("BMW", "M3", 20000);
		
		Employee emp = new Employee();
		
		
		
		// The significance of this is it compares the data and not the hash. This is done by the over ride in vehicles
		boolean value = car1.equals(car2);
		System.out.println(value);
		
		cust1.purchaseCar(vehicle, emp, false);
		

		

	}

}
