package staff;

public abstract class Employee {

    private String name;
    private String NINumber;
    private int salary;

    public Employee(String name, String NINumber, int salary){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINumber() {
        return NINumber;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double raiseAmount){
        if(raiseAmount > 0){
        this.salary += raiseAmount;}
    }

    public int payBonus(){
        return this.salary / 100;
    }

    public void changeName(String newName){
        if(newName != null && newName.length()>0) {
            this.name = newName;
        }
    }
}
