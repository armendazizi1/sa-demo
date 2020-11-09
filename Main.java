public class Main{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int sum = mySum(array);
        System.out.println(sum);
    }

    public static int mySum(int [] array){
        int sum = 0;
        for(int i=0;i <array.length; i++){
            sum += array[i];
            System.out.println("This is a bug");
        }
        return sum;
    }
}