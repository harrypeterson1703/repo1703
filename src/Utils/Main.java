package Utils;

import Utils.Employee;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee(
                "Abramov Avtandil",
                "Boss",
                "abramov@mail.ru",
                "8 916 111 11 11",
                100000,
                55
        );

        Employee employee2 = new Employee(
                "Babramov Boris",
                "Senior",
                "boris@mail.ru",
                "8 916 111 22 22",
                90000,
                44
        );

        Employee employee3 = new Employee(
                "Cahal Carles",
                "Middle QA Engineer",
                "carl@mail.ru",
                "8 916 111 33 33",
                80000,
                33
        );

        Employee employee4 = new Employee(
                "Dahal Denis",
                "QA Engineer",
                "dewn@mail.ru",
                "8 916 111 44 44",
                70000,
                40
        );

        Employee employee5 = new Employee(
                "Eahal Eva",
                "trainee",
                "dewn@mail.ru",
                "8 916 111 55 55",
                20000,
                52
        );

        Employee[] employee = {employee1, employee2, employee3, employee4, employee5};
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getAge() > 40)
            System.out.println(employee[i].toString());
        }
    }
}



