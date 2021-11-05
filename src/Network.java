public class Network {
	private Phone[] tel_list;
	private String name;

	public Network(String name) {
		super();
		this.name = name;
		tel_list = new Phone[0];
	}

	public Phone[] getTel_list() {
		return tel_list;
	}

	public void register(Phone phone) {
		Phone[] temp = new Phone[tel_list.length + 1];
		System.arraycopy(tel_list, 0, temp, 0, tel_list.length);
		temp[temp.length - 1] = phone;
		tel_list = temp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
