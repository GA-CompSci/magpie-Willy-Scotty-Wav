public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //array
        int[] collection = {5, 10, 15, 20, 25, 30, 40, 45, 50};

        // you cant add items to an arrays
        // collection  += 5 wont work
        // collection. add

        // standartd for loop
        for(int i = 0; i< collection.length; i ++){
            System.out.println(collection[i]);
        }

        // pro level traversal for each loop
        for(int sandman : collection){
            // sandman is a copy, changing it doenst change the original
            System.out.println(sandman);
        }       

        // find max
        // dont start with fixed number
        int currentMax = collection[0];
        for(int num : collection){
            if (num> currentMax) currentMax = num;
        }
        System.out.println("Max: " + currentMax);

        // find avreage
        int total = 0;
        for(int num: collection) total += num;
        System.out.println("Avrage: " + (total/collection.length));

        // is it to heavy
        System.out.println("Is to heavy?: " + isToHeavy(collection));

        // back to strings
        String name = "Charlie";
        System.out.println(name.charAt(1));

    }
    
    public static boolean isToHeavy(int[] nums){
        // train cant carry mor than 150
        int total = 0;
        // add up all the items
        for( int num : nums) total += num;
        return total > 150;
    }
}