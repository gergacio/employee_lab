package management;

public class Director extends Manager{
    //state
    private double budget;
    //constructor
    public Director(String name, String niNumber, double salary, String deptName, double budget){
        super(name, niNumber, salary, deptName);
        this.budget = budget;

    }
    //getter
    public double getBudget(){
        return this.budget;
    }
    //override methods
    public double payBonus(){
        return super.getSalary() * 2/100;
    }
}
