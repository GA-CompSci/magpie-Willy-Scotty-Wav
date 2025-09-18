import java.util.Scanner;

public class Drills {
    
    public static void main(String[] args) {
    
        // Declare 5 different data types with initial values (include at least one array)
        boolean mark = true;
        String june = "tastey";
        int k = 4;
        int[] bobby = {1,2,3,4,5,6,7,8,9,10};
        float floatNum = 5;
        
        // A standard for loop printing numbers 1-5 with their squares
        for(int i = 0; i< 5; i ++){
            System.out.println(bobby[i]);
        }

        
        // Create an int array with test scores: 85, 92, 78, 95, 88, 73, 91
        int[] testScores = {85, 92, 78, 95, 88, 73, 91};
        // Use a for-each loop to traverse and print each score
        for(int i = 0; i < 5; i ++){
            System.out.println(testScores[i]);
        }
        // Calculate and print the average of the test scores array
        int total = 0;
        for(int num: testScores) total += num;
        System.out.println("Avrage: " + (total/testScores.length));
        // Count how many scores are above 85 using a loop
        int count = 0;
        for(int num : testScores){

            if (num > 85) count ++;
        }
        System.out.println(count);
        // An infinite loop that collects user input
        Scanner s = new Scanner (System.in);
        while(mark){
            System.out.println("Enter a Number: ");
            int input = s.nextInt();
   
            // A short-circuit conditional with four tests
            // (check if input is: positive && less than 100 && even && divisible by 5)
            if( input > 0 && input < 100 && input % 2 == 0 && input % 5 == 0){
                System.out.println("Passed");
                // Break the loop if all conditions pass
        
                break;
            }
        }     
        // Loop through each char in the String "DataScience"
        String aBetterName = "DataScience";
        for (int i = 0; i < aBetterName.length(); i++){
            // Print each character on a separate line with its index
            System.out.print(aBetterName.charAt(i) + " - ");

        }       
        // Given String word = "Algorithm", print only the first three letters
        String Marcus = "Algorithm";
        System.out.println(Marcus.substring(0,3)); 
            // Print each character on a separate line with its index
            for (int i = 0; i < Marcus.length(); i++){
            System.out.print(Marcus.charAt(i) + " - "); 
        }
        int odd = 0;
        for(int i = 0; i < 100; i ++){
            if(1 % 2 !=0 ) System.out.println(" " + i);
        }
        // Print all the odd numbers from 1-100 in rows of 10 numbers each
        
        // Create a Scanner and take a String input (ask for user's name)
        
        // Create a Scanner, take a number, print a countdown from that number to 0
        // Format: "T-minus [number]..."
        
        // Create a double array for temperatures: {72.5, 68.3, 75.1, 69.8, 71.2}
        // Find and print the highest and lowest temperatures
        
    }
    
    // Create a method that compares two arrays and returns the larger average
    // Include a proper JavaDoc comment
    
    // Create a method that formats a number as a percentage (returns String)
    // Include a proper JavaDoc comment
    
}

