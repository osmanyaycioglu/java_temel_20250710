package org.example.oo.general;

public class EmployeeWithBuilderRun {
    public static void main(String[] args) {
        EmployeeWithBuilder employeeLoc = EmployeeWithBuilder.builder()
                                                             .setName("osman")
                                                             .setSurname("yaycıoğlu")
                                                             .setAge(55)
                                                             .setDepartment("Development")
                                                             .setAddress("Ataşehir")
                                                             .build();

        EmployeeBasic employeeBasicLoc = new EmployeeBasic();
        employeeBasicLoc.setName("osman");
        System.out.println("test");
        employeeBasicLoc.setSurname("yaycıoğlu");
        if (args.length > 2){
            System.out.println("deneme");
        }
        employeeBasicLoc.setAge(55);
        employeeBasicLoc.setDepartment("Development");
        employeeBasicLoc.setAddress("Ataşehir");
    }
}
