
public class Network {
	private Phone[] phones;
	private String name;
	private int phonesSize = 0;
	public Network(String name) {
		super();
		this.name = name;
		phones = new Phone[1];
	}

	public Phone[] getPhones() {
		return phones;
	}

	public void register(Phone phone) {
		Phone[] temp;

		if (phonesSize > phones.length * 0.75) {
			temp = new Phone[(phones.length * 3) / 2 + 1];
			System.arraycopy(phones, 0, temp, 0, phones.length);
			temp[phonesSize] = phone;
			phones = temp;
		//	System.out.println("----------call method like arraylist---------");
		} else {
			phones[phonesSize] = phone;
		}
		phonesSize++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
