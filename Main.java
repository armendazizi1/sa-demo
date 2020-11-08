public class Main{
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        int[] array = {1,2,3,4,5,6};
        int sum = mySum(array);
        System.out.println(sum);
    }

    public static int mySum(int [] array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return sum;
    }
}