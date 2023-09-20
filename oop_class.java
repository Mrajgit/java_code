class employee{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("My ID is "+ id +" and my name "+ name);
    }
    public int getsalary(){
        return salary;
    }
}
public class oop_class {
    public static void main(String[] args) {
        System.out.println("it is java custom class");
        employee raj = new employee();
        raj.id= 193900;
        raj.salary = 100000000;
        raj.name = "raj";
        employee rajkumar = new employee();
        rajkumar.id= 193900;
        rajkumar.salary = 100000000;
        rajkumar.name = "rajkumar";

        raj.printdetails();
        rajkumar.printdetails();

        int s = raj.getsalary();
        System.out.println("both salary is "+s);
    }
}
