package org.example.oo.general;

public class EmployeeRun {
    public static void main(String[] args) {
        Employee employeeLoc = new Employee("osman",
                                            "yaycıoğlu",
                                            55,
                                            "ataşehir",
                                            "IT");

        employeeLoc.printContact();

        System.out.println("------------------------------------------------");

        EmployeeEx employeeExLoc = new EmployeeEx("osman",
                                                  "yaycıoğlu",
                                                  55,
                                                  "ataşehir",
                                                  "IT",
                                                  "eğitmen");
        employeeExLoc.printContact2();
    }
}
