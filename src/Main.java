public class Main {

	public static void main(String[] args) {
		// Регистрация сети  мобильного оператора
		Network lifeNetwork = new Network("Life");
        //
		Phone phone1 = new Phone("IPhone 6", 123456);
		Phone phone2 = new Phone("Samsung Galaxy 6", 686939);
		Phone phone3 = new Phone("HT One 5", 321456);
		Phone phone4 = new Phone("Xiaomi Redmi Note 10", 999999);

		// Регистрация в сети мобильных телефонов
		phone1.registrationInNetwork(lifeNetwork);
		phone2.registrationInNetwork(lifeNetwork);
		phone3.registrationInNetwork(lifeNetwork);
		// звонящий и принимающий зарегистрированы и в сети
		phone1.call(321456); // make a call to really number
		// звонящий  зарегистрирован, но принимающий не зарегистрирован в сети
		phone2.call(999999); // this number is not exist
		// звонящий  не зарегистрирован в сети
		phone4.call(321456);
	}

}
