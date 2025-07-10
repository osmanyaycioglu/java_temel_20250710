package org.example.oo.general;

public class Employee {
    private final String  name;
    private final String  surname;
    private final Integer age;
    private final String  address;
    private final String  department;

    public Employee(final String nameParam,
                    final String surnameParam,
                    final Integer ageParam,
                    final String addressParam,
                    final String departmentParam) {
        name       = nameParam;
        surname    = surnameParam;
        age        = ageParam;
        address    = addressParam;
        department = departmentParam;
    }

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


}
