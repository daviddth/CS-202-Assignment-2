/*David Hoang - CSC 202 - September 5, 2017 - Programming Ex. 19.7 pg. 759*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class generic_binary_search {
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);  // simple text scanner to grab text
        System.out.println("Please enter the size of the array: "); // print to screen asking user to enter an array size
        Integer[] list = createArray(scanInput.nextInt()); // create array with argument as scanInput as an int
        System.out.println("Please enter the number you want to look for in the array: "); // ask the user for the number
        int key = scanInput.nextInt(); // takes in the number
        System.out.println("The array created is: " + Arrays.toString(list));// printing the unsorted list to screen as a string
        Arrays.sort(list); // method call to sort the list
        System.out.println("The sorted array is: " + Arrays.toString(list)); // printing the sorted list to screen as a string
        if (binarySearch(list, key) == -1){ // if the number does not exist in the array, return negative 1 as the index
            System.out.println("The index of the element selected, " + key + ", is not in the created array. Returned: " + binarySearch(list, key)); // print out statement saying not found
        }else{ // else number is found in array state the index
            System.out.println("The index of the element selected, " + key + ", is: " + binarySearch(list, key)); // printing the index of the key
        }
    }

    public static Integer[] createArray(int sizeOfArray) { // creates an array of random numbers based on size user specified
        Random someRandomNumber = new Random();
        Integer[] someList = new Integer[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++){ // for loop to fill the list with random numbers
            someList[i] = someRandomNumber.nextInt(sizeOfArray);
        }
        return someList; // returns that list of random numbers
    }

    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) { // textbook problem
        return binarySearch(list, key, 0, list.length); // passes four arguments into the helper method below
    }

    public static <E extends Comparable<E>> int binarySearch(E[] list, E key, int lowNumber, int highNumber) { // arguments are array, selected number by user, zero always, the highest number is the length of the list
        int middleNumber = (lowNumber + highNumber) / 2; // find the middle number
        if (lowNumber > highNumber) { // handles this case
            return -1; // return not found
        }else if (list[middleNumber].equals(key)) { // else if you find the user's number
            return middleNumber; // return the middle number
        }else if (list[middleNumber].compareTo(key) == -1) { // else if the middle number is less than the user's number
            return binarySearch(list, key, middleNumber + 1, highNumber); // search to the right side of the middle number
        }else { // else the middle number is greater than the user's number
            return binarySearch(list, key, lowNumber, middleNumber - 1); // thus search to the left side of the middle number
        }
    }
}


