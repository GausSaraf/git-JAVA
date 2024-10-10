
class Employee {

    int jobID;
    String Name;
    float Salary;

    Employee(int jobID, String Name, float Salary) {
        this.jobID = jobID;
        this.Name = Name;
        this.Salary = Salary;
    }

    void display() {
        System.out.println(jobID + ", " + Name + ", " + Salary);
    }
}

public class Test {

    public static void main(String args[]) {
        Employee E1 = new Employee(905, "Atik", 5000.0f);

        E1.display();
    }
}
