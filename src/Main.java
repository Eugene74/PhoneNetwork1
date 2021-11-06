
/*
Задание для самостоятельной проработки.
Продвинутый уровень.
1) Создайте класс Phone (Телефон) одним из свойств должен быть его номер. Создайте
класс Network (сеть мобильного оператора). В классе Телефон должны быть описаны
следующие методы:
● Регистрация в сети мобильного оператора
● Метод реализующий исходящий звонок. Данный метод принимает один параметр
(описывающий номер мобильного телефона). Логика работы этого метода такова:
если текущий телефон не прошел регистрацию в сети, то закончить работу метода с
сообщением об этом. Если текущий телефон прошел регистрацию и в сети также
зарегистрирован телефон на номер которого совершается вызов, то вызвать метод
входящий звонок у того телефона. Если телефон на номер которого вы совершаете
вызов в сети не зарегистрирован, то закончить работу метода с сообщением об
этом.
● Метод реализующий входящий звонок. Принимает параметр в виде номера с
которого произвели вызов на текущий. Вывести сообщение вида вам звонит номер
такой то.
* */


public class Main {

	public static void main(String[] args) {
		// Регистрация сети  мобильного оператора
		Network lifeNetwork = new Network("Life");
        //
		Phone phone1 = new Phone("IPhone 6", "123456");
		Phone phone2 = new Phone("Samsung Galaxy 6", "686939");
		Phone phone3 = new Phone("HT One 5", "321456");
		Phone phone4 = new Phone("Xiaomi Redmi Note 10", "999999");
		Phone phone5 = new Phone("Xiaomi Redmi Note 10", "999991");
		Phone phone6 = new Phone("Xiaomi Redmi Note 10", "999992");
		Phone phone7 = new Phone("Xiaomi Redmi Note 10", "999993");

		// Регистрация в сети мобильных телефонов
		phone1.registrationInNetwork(lifeNetwork);
		phone2.registrationInNetwork(lifeNetwork);
		phone3.registrationInNetwork(lifeNetwork);
		//phone4.registrationInNetwork(lifeNetwork);
		phone5.registrationInNetwork(lifeNetwork);
		phone6.registrationInNetwork(lifeNetwork);
		phone7.registrationInNetwork(lifeNetwork);
		// звонящий и принимающий зарегистрированы и в сети
		phone1.call("321456"); // make a call to really number
		phone3.call("123456");
		// звонящий  зарегистрирован, но принимающий не зарегистрирован в сети
		phone2.call("999999"); // this number is not exist
		// звонящий  не зарегистрирован в сети
		phone4.call("321456");

		System.out.println("-------------------------------");
		Phone [] phones = lifeNetwork.getPhones();
		for (int i = 0; i <phones.length ; i++) {
			System.out.println(phones[i]);
		}
	}

}
