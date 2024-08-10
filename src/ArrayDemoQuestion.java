import java.util.Arrays;

public class ArrayDemoQuestion {
    /*
    1. Check whether the two given arrays are same.
     output - arrays are same or arrays are different
     arr1 = 10,20,30,40,50,60
     arr2 = 10,20,30,40

    2. Write a program to copy first array at the end of second array,
     by creating third array,
     both the arrays can have different size.

    3. Write a program to copy two arrays into a third array.
        but first copy the elements of small array, then big array.
        Array can be small of big based on there length. if length are same,
        then they are small or big based on the value of element at last index
     */

    public static void main(String[] args) {
        int[] first = {10,20,30,40,50,60};
        int[] second = {10,20,30,40,50};

        int[] third = new int[first.length + second.length];

        int firstIndex = 0;
        int seondIndex = 0;
        for (int i = 0; i < first.length; i++) {
            third[i] = first[i];
            //System.out.println(Arrays.toString(third));
        }

        for(int i = first.length ; i < third.length; i++){
            third[i] = second[seondIndex];
            seondIndex++;
            //System.out.println(Arrays.toString(third));
        }
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println(Arrays.toString(third));

        sameArrays(first, second);

    }
    public static void sameArrays(int[] arr, int[] brr){
        if(arr.length == brr.length) {
            boolean isSame = true;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != brr[i]){
                    isSame = false;
                }
            }
            if(isSame){
                System.out.println("Arrays are same");
            }else{
                System.out.println("Arrays are different");
            }
        }else{
            System.out.println("Arrays are different!!!!!!!!!!");
        }

    }
}
