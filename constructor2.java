class mmemployee{
    private int id;
    private String name;
    public mmemployee(){
        id =0;
        name = "raj";
    }
    public mmemployee(String n, int id){
        id = id;
        name = n;
    }
    public mmemployee(String n){
        id =1;
        name = n;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

}
public class constructor2 {
    public static void main(String[] args) {
        mmemployee raj = new mmemployee("sonu", 790);
        System.out.println(raj.getId());
        System.out.println(raj.getName());
    }
}
