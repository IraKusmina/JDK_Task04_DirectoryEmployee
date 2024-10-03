package org.example;

public class Employee {
    protected int personalNumber;
    protected String phone;
    protected String name;
    protected int experience;

    public Employee(int personalNumber, String phone, String name, int experience) {
        this.personalNumber = personalNumber;
        this.phone = phone;
        this.name = name;
        this.experience = experience;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "personal number=" + personalNumber +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", experience=" + experience + " year";
    }
}
