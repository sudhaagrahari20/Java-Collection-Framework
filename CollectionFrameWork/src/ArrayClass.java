import java.util.Arrays;
public class ArrayClass {
    public static void main(String[] args) {
        //Binary Search
//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        int index = Arrays.binarySearch(numbers,4);
//        System.out.println("The index of element 4 in the array is " + index);

        //Sort Array
        Integer[] numbers = {10,2,5,6,23,78,45,85,8,98,1};
        Arrays.sort(numbers);

        Arrays.fill(numbers, 12);

        for(int i: numbers) {
            System.out.print(i + " ");
        }
    }
}
