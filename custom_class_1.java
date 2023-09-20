class employee1{
    int salary;
    String name;
    public int get_salary(){
        return salary;
    }
    public String get_name(){
        return name;
    }
    public void set_name(String n){
        name =n;
    }
}
public class custom_class_1 {
    public static void main(String[] args) {
        employee1 raj = new employee1();
        raj.set_name("monu raj");
        raj.salary = 100000000;
        System.out.println(raj.get_name());
        System.out.println(raj.get_salary());
    }
}
