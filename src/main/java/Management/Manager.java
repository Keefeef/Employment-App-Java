package Management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;
    public Manager(String name, String deptName){
        super(name, 130, 10000);
                this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}


