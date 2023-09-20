/**
 * this is a javadoc_method_tags class
 */
public class javadoc_method_tags {
    /**
     *
     * @param args these arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("this is my main method!");
    }

    /**
     * this method add two numbers
     * @param i this is the first number to add
     * @param j this is the second number to add
     * @return sum fo two number
     * @throws Exception if number is equal to zero
     * @deprecated  this method is deprecated please use + operator
     */
    public int add(int i, int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c = i+j;
        return c;
    }
}
