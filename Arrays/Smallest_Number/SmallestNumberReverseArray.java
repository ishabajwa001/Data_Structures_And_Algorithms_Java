import java.util.Scanner;
public class SmallestNumberReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Enter the number of elements user wants to enter
        System.out.print("Enter the number of elements you want in the array : ");
        int element_numbers = scan.nextInt();

        // Check if the user entered a positive number
        if(element_numbers <= 0) {
            System.out.println("Invalid Request for total elements in the array");
            return;
        }

        //Initialize the array
        int numbers[] = new int[element_numbers];
        //Array is going to fill from the end ---> Last index
        System.out.print("Enter the number : ");
        numbers[element_numbers - 1] = scan.nextInt();

        //Smallest is assigned to last element of the array at index elements_numbers-1
        int smallest = numbers[element_numbers-1];
        int count = element_numbers-1;

        //where we have to insert a value now
        int current_index = element_numbers-2;

        //Insert the elements from element_numbers-2 index 
        //Also check if they are smaller from the element stores in smallest
        while(count > 0)
        {
            System.out.print("Enter the number : ");
            numbers[current_index] = scan.nextInt();

            if (numbers[current_index] < smallest)
            {
                smallest = numbers[current_index];
            }
            //decrease the index by -1
            current_index --;
            count--;
        }
        System.out.println("The Smallest number from all numbers is : "+smallest);


        scan.close();
    }
    
}
/*
-----------------------------------------------------------------------------------------------------
                                NOTES AND CONCEPT
-----------------------------------------------------------------------------------------------------
* This program takes input values and stores them in the array from the end
* Array indices start from 0, so the last valid index is (element_numbers - 1)
* Index is given as because index starts from 0 and elements count starts from 1
* As (element_numbers-1) in the index of first number stored in that array 
* So smallest is also assigned to that number
* current_index is the index of the element from which loop is going to start
* count is initialized to (element_numbers - 1) to track how many inputs remain
* condition (count > 0 ) is taken for loop checking
* One element is stored before the loop at index (element_numbers - 1)
* Array indices start from 0, so the next valid index is (element_numbers - 2)
* The loop inserts the remaining elements from index (element_numbers - 2) down to 0
* The loop therefore runs (element_numbers - 1) times to fill the remaining elements
* if block check if the number stored in the current_index is smaller that smallest
* if it is then smallest will be assigned to new value which is the value of current_index
* at the end current_index decremented by one to move to one lower index current_index
* now current_index lower till it become 0
* then count decremented by 1 to ensure that loop will run acocording to the current_index
* and to ensure that loop will not become infinite
* */

