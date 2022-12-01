package staff;

public abstract class Employee {
    //fields - represent state data
    private String name;
    private String niNumber;
    private double salary;

    private double bonus;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }
    //setter
    public void setName(String name){
        if(name == null){
            return;
        }
        this.name = name;
    }

    //access state through getters
    public String getName(){
        return this.name;
    }
    public String getNiNumber(){
        return this.niNumber;
    }
    public double getSalary(){
        return this.salary;
    }
    public double raiseSalary(double bonus){
        if(bonus < 0){
            bonus = 0;
        }
        return this.salary + bonus;
    }
    public double payBonus(){
        return this.salary * 1/100;
    }
}
