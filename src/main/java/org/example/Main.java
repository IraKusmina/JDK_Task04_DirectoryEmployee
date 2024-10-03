package org.example;

import java.util.HashMap;
import java.util.List;

public class Main {
    /*Создать справочник сотрудников
    Необходимо:
    Создать класс справочник сотрудников, который содержит внутри
    коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
    Табельный номер
    Номер телефона
    Имя
            Стаж
    Добавить метод, который ищет сотрудника по стажу (может быть список)
    Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
    Добавить метод, который ищет сотрудника по табельному номеру
    Добавить метод добавления нового сотрудника в справочник
    */
    public static void main(String[] args) {
        Employee employee1 = new Employee(12345, "89111234567", "Ivan Semenov", 3);
        Employee employee2 = new Employee(12456, "8976145678", "Seregey Smit", 10);
        Employee employee3 = new Employee(23456, "87642536471", "Anna Chester", 5);
        Employee employee4 = new Employee(34555, "89235275816", "Evgeniy Barns", 3);
        Employee employee5 = new Employee(23451, "87642536476", "Anna Chester", 2);

        DirectoryEmployee listEmployee = new DirectoryEmployee();
        listEmployee.addEmployee(employee1);
        listEmployee.addEmployee(employee2);
        listEmployee.addEmployee(employee3);
        listEmployee.addEmployee(employee4);
        listEmployee.addEmployee(employee5);

        List<Employee> listByExperience = listEmployee.findByExperience(3);
        System.out.println("List employees by experience: "+ listByExperience);

        System.out.println();

        List<String> listPhoneByName = listEmployee.findPhoneByName("Anna Chester");
        System.out.println("List phones employee by name: "+ listPhoneByName.toString());

        System.out.println();

        List<Employee> listEmployeeByPersonalNumber = listEmployee.findEmployeeByPersonalNumber(12345);
        System.out.println("List employees by personal number: " + listEmployeeByPersonalNumber);
    }
}