package java8;

public class ExOnArray {
    public static void main(String[] args) {

        //Declare and initialize an array.
        int[] numbers = {10, 20, 30, 40, 50};
        //print all elements in the array
        System.out.println("Elements in the array");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ":" + numbers[i]);
        }
        //calculate the sum of elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("sum of all elements " + sum);

            //Modify an element
            numbers[4]=60;
          System.out.println("After modifying element at index 4:"+numbers[4]);
        }
    }
