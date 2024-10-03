package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DirectoryEmployee {
    public List<Employee> listEmployee = new ArrayList<>();

    public void addEmployee(Employee employee){
        listEmployee.add(employee);
    }

    public List<Employee> findByExperience(int experience){
        List<Employee> listEmployeeByExperience = new ArrayList<>();
        for (Employee employee: listEmployee){
            if (employee.getExperience()==experience){
                listEmployeeByExperience.add(employee);
            }
        }
        return listEmployeeByExperience;
    }

    public List<String> findPhoneByName(String name){
        List<String> listPhoneByName = new ArrayList<>();
        for(Employee employee: listEmployee){
            if (employee.getName().equals(name)){
                listPhoneByName.add(employee.getPhone());
            }
        }
        return listPhoneByName;
    }

    public List<Employee> findEmployeeByPersonalNumber(int number){
        List<Employee> listEmployeeByNumber = new ArrayList<>();
        for (Employee employee: listEmployee){
            if(employee.getPersonalNumber()==number){
                listEmployeeByNumber.add(employee);
            }
        }
        return listEmployeeByNumber;

    }
}
