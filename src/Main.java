import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //create array
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        //calculate and print sum
        for(int i:array){
            sum += i;
        }
        System.out.println(sum);

        //get 10 numbers from user and calculate average
        int[] numbers = new int[10];
        int sum2 = 0;

        for(int i=0; i<numbers.length; i++){
            System.out.println("Please input a number: ");
            numbers[i] = sc.nextInt();
            sum2 += numbers[i];
        }
        double average = (sum2/numbers.length);
        System.out.println("Average: "+average);

        //store 3 names and print
        String[] names = new String[3];

        for (int i=0; i<names.length; i++){
            System.out.println("Enter a name: ");
            names[i] = sc.next();
        }

        for(String name:names){
            System.out.println(name);
        }


        //create array with values and print index when element value = 5
        int[] array2 = {2,5,9,0,2,1,8,5,4};

        for(int i=0; i<array2.length; i++){
            if(array2[i]==5){
                System.out.println("Index location of 5:  "+i);
            }

        }

//=============================================================================

        //print array 1-10 backwards
        int[] array3 = {1,2,3,4,5,6,7,8,9,10};

        for(int i=(array3.length-1); i>=0; i--){
            System.out.println(array3[i]);
        }


        //replace "t" with hello
        String[] array4 = {"w","t","y","h","k"};

        for(int i=0; i<array4.length; i++){
            if(array4[i].equals("t")) {
                array4[i] = "hello";
            }
        }
        System.out.println(Arrays.toString(array4));

        //compare arrays and print all matching pairs
        int[] a1 = {1,7,6,5,9};
        int[] a2 = {2,7,6,3,4};

        for(int i=0; i<a1.length; i++){
            if(a1[i]==a2[i]){
                System.out.printf("(%d, %d)%n",a1[i],a2[i]);
            }
        }












    }
}
