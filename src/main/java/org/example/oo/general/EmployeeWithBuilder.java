package org.example.oo.general;

public class EmployeeWithBuilder {
    private final String  name;
    private final String  surname;
    private final Integer age;
    private final String  address;
    private final String  department;

    private EmployeeWithBuilder(final String nameParam,
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

    public static EmployeeWithBuilderBuildHelper builder() {
        return new EmployeeWithBuilderBuildHelper();
    }

    public static class EmployeeWithBuilderBuildHelper {
        private String  name;
        private String  surname;
        private Integer age;
        private String  address;
        private String  department;

        private EmployeeWithBuilderBuildHelper() {
        }

        public String getName() {
            return name;
        }

        public EmployeeWithBuilderBuildHelper setName(final String nameParam) {
            name = nameParam;
            return this;
        }

        public String getSurname() {
            return surname;
        }

        public EmployeeWithBuilderBuildHelper setSurname(final String surnameParam) {
            surname = surnameParam;
            return this;
        }

        public Integer getAge() {
            return age;
        }

        public EmployeeWithBuilderBuildHelper setAge(final Integer ageParam) {
            age = ageParam;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public EmployeeWithBuilderBuildHelper setAddress(final String addressParam) {
            address = addressParam;
            return this;
        }

        public String getDepartment() {
            return department;
        }

        public EmployeeWithBuilderBuildHelper setDepartment(final String departmentParam) {
            department = departmentParam;
            return this;
        }

        public EmployeeWithBuilder build() {
            return new EmployeeWithBuilder(name,
                                           surname,
                                           age,
                                           address,
                                           department);
        }
    }


}
