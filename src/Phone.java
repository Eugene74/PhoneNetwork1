public class Phone {
	private String brand;
	private int phone_number;
	private Network network;

	public Phone(String brand, int phone_number) {
		super();
		this.brand = brand;
		this.phone_number = phone_number;
	}

	public void registrationInNetwork(Network network) {
		this.network = network;
		network.register(this);
	}

	public void call(int phone_number) {
		if (this.network!=null){
			Phone[] phone_list = network.getTel_list();
			System.out.println("'\u001B[35m" +this.brand+ "' Number "+this.phone_number +"\u001B[34m" + " Called for number "+ phone_number + "\u001B[0m");
			for (Phone phone : phone_list) {
				if(phone.getPhone_number()==phone_number){
					phone.answer();
					return;
				}
			}
			System.out.println("Unfortunately, this number '" + phone_number+ "\u001B[33m" + "' is not in service"  + "\u001B[0m" );
		}else {
			System.out.println("Phone  '" + this.brand + "\u001B[31m" +"' is not registered on the network" + "\u001B[0m");
		}
	}
	
	public void answer(){
		System.out.println("Hello you call the phone number "+this.getPhone_number());
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	
}
