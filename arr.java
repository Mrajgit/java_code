public class arr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 30;
        arr[4] = 310;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[] arr1;
        arr1 = new int[5];
        arr1[0] = 110;
        arr1[1] = 13;
        arr1[2] = 22;
        arr1[3] = 330;
        arr1[4] = 3110;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i]);
        }

        int [] arr2={21,32,44,556};
//        foreach loop
        for (int i: arr2) {
            System.out.print(i+", ");
        }
    }
    }
