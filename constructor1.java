class employees{
    employees(String s, int id){
        System.out.println("my company name is "+s+" and my id is "+id);
    }
    employees(String s, int id , int salary){
        System.out.println("my company name is "+s+" and my id is "+id+" and my salary is "+salary);
    }
}
public class constructor1 {
    public static void main(String[] args) {
    employees raj= new employees("google", 125622);
    employees m = new employees("microsoft", 9076556, 100000000);
    }
}
