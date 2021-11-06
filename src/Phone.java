public class Phone {
	private String brand;
	private String phoneNumber;
	private Network network;

	public Phone(String brand, String phoneNumber) {
		super();
		this.brand = brand;
		this.phoneNumber = phoneNumber;
	}

	public void registrationInNetwork(Network network) {
		network.register(this);
		this.network = network;

	}

	public void call(String phoneNumber) {
		if (this.network!=null){
			Phone[] phones = network.getPhones();
			System.out.println("'\u001B[35m" +this.brand+ "' Number "+this.phoneNumber +"\u001B[34m" + " Called for number "+ phoneNumber + "\u001B[0m");
			for (Phone phone : phones) {
				if(phone!=null && phone.getPhoneNumber().equals(phoneNumber)){
					phone.answer();
					return;
				}
			}
			System.out.println("Unfortunately, this number '" + phoneNumber+ "\u001B[33m" + "' is not in service"  + "\u001B[0m" );
		}else {
			System.out.println("Phone  '" + this.brand + "\u001B[31m" +"' is not registered on the network" + "\u001B[0m");
		}
	}
	
	public void answer(){
		System.out.println("Hello you call the phone number "+this.getPhoneNumber());
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Phone{" +
				"brand='" + brand + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", network=" + network +
				'}';
	}
}
