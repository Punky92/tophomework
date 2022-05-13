package pack1;

public class Employee {

    public enum Gender {
        NOT_SPECIFIED,
        FEMALE,
        MALE
    }

    public enum Department {
        IT,
        ENGINEER,
        SALES
    }

    private String name;
    private String sureName;
    private Gender gender;
    private int age;
    private Department department;

    public Employee(String name, String sureName, Gender gender, int age, Department department) {
        this.name = name;
        this.sureName = sureName;
        this.gender = gender;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", department=" + department +
                '}';
    }
}
