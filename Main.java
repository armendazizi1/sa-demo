public class Main{
    public static void main(String[] args) {
        System.out.println("clse issue 1");
        System.out.println("clse issue 1");
        int[] array = {1,2,3,4,5,6};
        int sum = mySum(array);
        System.out.println(sum);
    }

    public static int mySum(int [] array){
        int sum = 0;
        for(int i=0;i <array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}