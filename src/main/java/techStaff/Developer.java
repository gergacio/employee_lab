package techStaff;

import staff.Employee;

//get same parameter as Employee thats why we inherit from
//get same param as employee and give it level up to inherit chain to Employee constructor
public class Developer extends Employee {
    //constructor
    public Developer(String name, String niNumber, double salary){
        super(name, niNumber, salary);

    }
}
