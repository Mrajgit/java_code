class getter{
    private int id;
    private String name;
    public String get_name(){
        return name;
    }
    public void set_name(String n){
        name = n;
    }
    public void set_id(int i){
        id = i;
    }
    public int get_id(){
        return id;
    }
        }
public class getters_setters {
    public static void main(String[] args) {
        getter m1 = new getter();
        m1.set_name("raj");
        m1.set_id(2);
        System.out.println("name "+m1.get_name());
        System.out.println("ID "+m1.get_id());
    }
}
