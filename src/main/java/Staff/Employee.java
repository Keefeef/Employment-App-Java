package Staff;

public abstract class Employee {
    private String name;
    private int niNum;
    private int salary;


    public Employee(String name, int niNum, int salary) {
        this.name = name;
        this.niNum = niNum;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNiNum() {
        return niNum;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNiNum(int niNum) {
        this.niNum = niNum;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double increaseSalary(double increase){
    return this.salary + increase;
    }

    public double payBonus(){
    return this.salary / 100;
    }

}







