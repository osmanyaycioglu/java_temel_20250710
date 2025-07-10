package org.example.oo.general;

public class EmployeeEx extends Employee {
    private final String note;


    public EmployeeEx(final String nameParam,
                      final String surnameParam,
                      final Integer ageParam,
                      final String addressParam,
                      final String departmentParam,
                      final String note) {
        super(nameParam,
              surnameParam,
              ageParam,
              addressParam,
              departmentParam);
        this.note = note;
    }

    @Override
    public void printContact() {
        System.out.println(getName()
                           + " "
                           + getSurname()
                           + "\n"
                           + getAddress()
                           + "\n"
                           + getDepartment()
                           + "\n"
                           + this.note);
    }

    public void printContact2() {
        super.printContact();
        System.out.println(this.note);
    }

}
