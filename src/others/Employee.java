package others;

public class Employee {
    private String firstName;
    private String lastName;
    private long id;
    private Department department;
    private WorkAddress workAddress;
    private HomeAddress homeAddress;
    private Hierarchy hierarchy;
    public Employee(String firstName, String lastName, long id, Department department, WorkAddress workAddress,
                    HomeAddress homeAddress, Hierarchy hierarchy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.department = department;
        this.workAddress = workAddress;
        this.homeAddress = homeAddress;
        this.hierarchy = hierarchy;

    }

}