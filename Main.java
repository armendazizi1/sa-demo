public class Main{
    public static void main(String[] args) {
        //
        int[] array = {1,2,3,4,5,6};
        int sum = mySum(array);

        System.out.println("what is this??");
        System.out.println("lalalla");
        System.out.println("lalalla");
        System.out.println("what is this?");
        System.out.println("update check");
        System.out.println("update check2");


    }

    public static int mySum(int [] array){
        int sum = 0;
        for(int i=0;i <array.length; i++){
            sum += array[i];
        }
        return sum;
    }

}
