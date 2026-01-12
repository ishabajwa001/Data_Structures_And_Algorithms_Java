import java.util.Scanner;

public class LargestNumberByForLoop {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            //takes the number of elements user wants to enter in array 
            System.out.print("How many numbers you want to enter : ");
            int n = Integer.valueOf(scan.nextLine());

            //If user enter invalid numbers
            if (n <= 0) {
                System.out.println("Invalid request for input ");
                return; 
            }

            //initilialization of array named numbers which consists of n number of elements
            int [] numbers=new int[n];
            System.out.print("Enter the number : ");
            numbers[0] = Integer.valueOf(scan.nextLine());

            //largest variable to keep track of the largest element 
            int largest = numbers[0] ;

            //takes the numbers user wants to enter in array
            //and compare it with already stored largest number
            for(int i = 1 ; i <n ; i++)
            {
                System.out.print("Enter the number : ");
                numbers[i] = Integer.valueOf(scan.nextLine());
                if(largest < numbers[i])
                {
                largest = numbers[i]; 
                }
            }
            
            //print the largest number based on the logic
            System.out.println("The largest number is : "+largest);
            scan.close();
    }

}

/*
//---------------------------------------------------------------------------------------------------
//                                      Notes And Concepts
// --------------------------------------------------------------------------------------------------
                                        LARGEST NUMBER
* I use one loop - for taking numbers as input and for comparing largest numbers
* I assigned i to 1 because it starts the loops from index 1 as largest is already assigned to element 1 at index 0 
 so this loop will compare the existing value of largest to index i
 In beginning the largest is 1st element at index 0 so loop compares largest with second element at index 1
 and assigned the largest to second element if it is largest otherwise largest remains same
 and then this will be happen for further other elements


//  */
