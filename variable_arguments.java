public class variable_arguments {
    static int add(int ...arr){
        int result =0;
        for (int a : arr) {
            result =result + a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(add(2,4));
        System.out.println(add(2,4,5));
        System.out.println(add(2,4,8));
    }
}
