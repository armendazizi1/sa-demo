public class Main{
    public static void main(String[] args) {
        //
        int[] array = {1,2,3,4,5,6};
        int sum = mySum(array);
    }

    public static int mySum(int [] array){




        System.out.println("just curious again");
        int sum = 0;
        for(int i=0;i <array.length; i++){
            sum += array[i];
        }
        return sum;
    }

}
