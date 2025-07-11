package org.example.oo.general;

public class EmployeeBasic {
    private  String  name;
    private  String  surname;
    private  Integer age;
    private  String  address;
    private  String  department;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getDepartment() {
        return department;
    }

    public void printContact() {
        System.out.println(name + " " + surname + "\n" + address + "\n" + department);
    }

    public void setName(final String nameParam) {
        name = nameParam;
    }

    public void setSurname(final String surnameParam) {
        surname = surnameParam;
    }

    public void setAge(final Integer ageParam) {
        age = ageParam;
    }

    public void setAddress(final String addressParam) {
        address = addressParam;
    }

    public void setDepartment(final String departmentParam) {
        department = departmentParam;
    }
}
