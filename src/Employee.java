public class Employee {

    private String name;
    private String Department;
    private Integer salary;

    public Employee(String name, String department, Integer salary) {
        this.name = name;
        Department = department;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public String getDepartment() {
        return Department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Department='" + Department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
