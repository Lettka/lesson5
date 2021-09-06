package homework;

/*4. Создать массив из 5 сотрудников. Пример: Person[] persArray = new Person[5];
Вначале объявляем массив объектов persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
потом для каждой ячейки массива задаем объект persArray[1] = new Person(...); ... persArray[4] = new Person(...);*/

//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

public class Solution {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employeesArray[1] = new Employee("Iva Ivan", "Engineer", "ivivan2@mailbox.com", "892312313", 35000, 40);
        employeesArray[2] = new Employee("Nov Ivan", "Engineer", "ivivan3@mailbox.com", "892312314", 34000, 55);
        employeesArray[3] = new Employee("Vanov Ivan", "Engineer", "ivivan4@mailbox.com", "892312315", 37000, 41);
        employeesArray[4] = new Employee("Ivano Ivan", "Engineer", "ivivan5@mailbox.com", "892312316", 38000, 39);
        for (Employee employee:
             employeesArray) {
            if(employee.getAge() > 40) System.out.println(employee);
        }
    }
}
