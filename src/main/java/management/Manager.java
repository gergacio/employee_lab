package management;

import staff.Employee;

public class Manager extends Employee {
    //state
    private String deptName;
    //constructor
    public Manager(String name, String niNumber, double salary, String deptName){
        super(name, niNumber, salary);
        this.deptName = deptName;
    }
    //getters
    public String getDeptName(){
        return this.deptName;
    }

}
