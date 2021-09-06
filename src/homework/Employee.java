package homework;

/*1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.*/

import java.time.Year;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int wages;
    private int birthYear;

    public Employee(String name, String position, String email, String phoneNumber, int wages, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wages = wages;
        this.birthYear = Year.now().getValue() - age;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    @Override
    public String toString(){
        return String.format("Name: %s, position: %s, email: %s, phone number: %s, wages: %d, age: %d",
                name, position, email, phoneNumber, wages, Year.now().getValue() - birthYear);
    }
}
