import java.util.Scanner;

public class StringExplorer {


	public static void main(String[] args)
	{
      // Count down with a "T minus 5"
      for (int x = 5; x >= 0; x -- ){
        System.out.println("T minus" + x);
      }

      // Declare and instantiate a Scanner
      Scanner s = new Scanner(System.in);
    
      // infinite loop 
    //   while(true){
    //       // take an input
    //         System.out.print("Meaning of live: ");
    //         String answer = s.nextLine();
    //       // repeat input + message
    //         System.out.print("lol u thought" + answer + "was right");
    //       // implement "equals" to stop with the word "stop"
    //   }     if(answer.equals("42")) break;


      /*
      ---------------------------
          SAMPLE STUFF
      ---------------------------
      */
  		String sample = "The quick brown fox jumped over the lazy dog.";
  
      // Print the sample and add a blank line after
      System.out.println("OUR SAMPLE:");
  	  System.out.println(sample + "\n");
      //  Demonstrate the length method.
  	  int l = sample.length();
  	  System.out.println ("sample.length() = " + l);
  
  		//  Demonstrate the indexOf method.
  		int position = sample.indexOf("quick");
  		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
      //  Demonstrate the toLowerCase method.
		  String lowerCase = sample.toLowerCase();
		  System.out.println ("sample.toLowerCase() = " + lowerCase);
		  System.out.println ("After toLowerCase(), sample = " + sample);
				
      //  toUpperCase
      System.out.println(sample.toUpperCase());


      // lastIndexOf
      System.out.println("Last h:"+ sample.lastIndexOf("h"));

      // substring
      System.out.println("SUBSTRING PRATICE");
      System.out.println(sample.substring(0));
      // equals
      String str1 = "Decode";
      String str2 = "Decode";

      System.out.println("Decpde == Decode?: " + str1.equals(str2));


	}
}


