package company;

public class Employee {

    String id;
    float bonus;
    float rating;
    String name;
    float salary;
    public Employee(String id, float bonus, float rating, String name, float salary){
        if(id == null || name == null)
            throw new IllegalArgumentException();

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.rating = rating;
        this.bonus = bonus;
    }

    public String getId() {
        return id;
    }

    public float getBonus() {
        return bonus;
    }

    public float getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

}
