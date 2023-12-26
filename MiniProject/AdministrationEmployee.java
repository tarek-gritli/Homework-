public class AdministrationEmployee extends Person implements Park {
    private int employeeId;
    private String role;
    public AdministrationEmployee(String name, String address, int phoneNumber, String email, int employeeId,String role) {
        super(name, address, phoneNumber, email);
        this.employeeId = employeeId;
        this.role = role;
    }

    public int getEmployeeId() {return employeeId; }
    public void setEmployeeId(int employeeId) {this.employeeId = employeeId; }
    public String getRole() {return role; }
    public void setRole(String role) {this.role = role; }
    public void park(Parking p)
    {
        if(!p.isFull())
        {
            System.out.println("Administration Employee "+getName()+" parking in "+p.getName());
            p.setAvailable(p.getAvailable()-1);
        }
        else{
            System.out.println("Parking is full");
        }
    }
}