mport java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int check;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        for (int element: array) {
            System.out.println(element);
        }
		System.out.println("Please type a number ");
		check=  read.nextInt();
        for(int i:array) { // Check if input value is in range or not
            if( i == check){
                System.out.println("the array is found");
        //...
    }
	else {
		System.out.println("Not fond");
	}
    //...
}
    }

}


import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int check;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        for (int element: array) {
            System.out.println(element);
        }
		System.out.println("Please type a number ");
		check=  read.nextInt();
        for(int i:array) { // Check if input value is in range or not
            if( i == check){
                System.out.println("the array is found");
        //...
    }
	else {
		System.out.println("Not found");
	}
    //...
}
    }

}
