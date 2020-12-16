package arraysLecture;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysLec {

    public static void main(String[] args) {

        /* ******************************************************** */
        /* ********** USING PRIMITIVE AND REFERENCE TYPES ********* */
        /* ******************************************************** */

        // https://stackoverflow.com/questions/29140402/how-do-i-print-my-java-object-without-getting-sometype2f92e0f4



        // Int Example
        //Declare an int array variable and assign an int array with the length of 3 to the array variable nums

        int[] nums = new int[3];

//        System.out.println(Arrays.toString(nums));
//        System.out.println(nums);
//        System.out.println("normal for loop");
//        for(int i = 0; i < nums.length; i++){
//            System.out.println(nums[i]);
//        }
//        System.out.println("enhanced for loop");
//        for(int n : nums){
//            System.out.println(n);
//        }
//
//        String[] beatles = {"matt", "", "", "", "mandy"};
//        System.out.println(Arrays.toString(beatles));

//        nums[0] = 1; //Assign each index to an int variable
//        nums[1] = 10;
//        nums [2] = 12;

//        System.out.println(nums); //Type@HashcodeOfObject

//        System.out.println(Arrays.toString(nums)); //this is an Array method

//        for(int i = 0; i < nums.length; i++){
//            System.out.println(nums[i]);
//        }




        // Dog Example
//        Dog d1 = new Dog("Bean", 1);
//        Dog d2 = new Dog("Patch", 3);
//        Dog d3 = new Dog("Rolo", 5);


//        //Declaring a Dog array variable called dogs and creating a new Dog array with a length of 4
//        Dog[] dogs = new Dog[4];
//        dogs[0] = d1;
//        dogs[1] = d2;
//        dogs[2] = d3;



//        System.out.println(dogs);

        /*
         * !!!!! NOTE !!!!!
         * System.out.println(dogs);
         *
         * When we print "dogs" you will get some version of this!
         * [LarraysLecture.Dog;@___________
         *
         * [ = single dimension
         * L = array contains a class or interface
         * arrays.Dog = type of object (arrays b/c in arrays package)
         */


//        System.out.println(Arrays.toString(dogs));

//        for (int i = 0; i < dogs.length; i += 1) {
//            System.out.println(dogs[i].getName());
//        }








        /* ******************************************************** */
        /* ********** Array Initializer & Iterating  ************** */
        /* ******************************************************** */
//        String[] languages = new String[4];
//        languages[0] = "html";
//        languages[1] = "css";
//        languages[2] = "javascript";
//        languages[3] = "java";

//        System.out.println(Arrays.toString(languages));






//        String[] languages2 = {"html2", "css2", "javascript2", "java2"};
//        System.out.println(Arrays.toString(languages2));






//        //enhanced for loop
//        for (String language : languages2) {
//            System.out.println(language);
//        }














        /* ******************************************************** */
        /* ************ Array Methods Mini Activity  ************** */
        /* ******************************************************** */
        //TODO: Experiment with the following Array methods. Add a few comments explaining what is happening. Bonus: Create your own example.


//        // Example1:  Array.fill()
//
//        String[] testArray = new String[4];
//
//        Arrays.fill(testArray,  "dogs");
//        for (String element : testArray) {
//            System.out.print(element + " ");
//        }
//        // fill the entire test array with a new value of "dogs". no index specified in function call "fill"
//
//
//        System.out.println(" ");
//
//
//
//        // ***Example1: BONUS ***
//        int[] numArray = {1,1,1,1,1,1,1,1,1,1};
//
//        Arrays.fill(numArray, 0, 4, 5);
//        for (int element : numArray) {
//            System.out.print(element + " ");
//        }
//        System.out.println(" ");

        // fill is overloaded with more parameters, providing a starting index => 0 and an ending index (excluded index)
        // to fill the array with the following value as the last parameter

//        int[] testFiller = new int[100];
//        for(int x : testFiller){
//            x = 5;
//            testFiller[x] = 5;
//        }//=======> DOES NOT WORK LIKE I THOUGHT IT WOULD
//        for(int i = 0; i < testFiller.length; i++){
//            testFiller[i] = 5;
//        }
        //^^^^^^^ SAME AS => {
//        Arrays.fill(testFiller, 0, testFiller.length-1, 5);
        //^^^^^^^ SAME AS => {
//        Arrays.fill(testFiller, 5);
//        System.out.println(Arrays.toString(testFiller));







        // Example 2: Arrays.equals(array1, array2)
        // Returns true if two array elements are equal and in the same order

//        String[] words = {"Mushroom", "Mushroom"};
//        String[] words2 = {"Mushroom", "mushroom"};
//        System.out.println(Arrays.equals(words, words2));

        String[] items = {"book", "fish", "table", "pencil", "dog", "glasses", "mouse", "key"};
        String[] newItems = Arrays.copyOf(items, items.length + 5);
        System.out.println(Arrays.toString(newItems));
        System.out.println(newItems.length);
        String[] compare = newItems.clone();
        Arrays.fill(compare, compare.length - 5, compare.length, "up");

        Arrays.fill(newItems, newItems.length - 5, newItems.length, "up");//==CHANGES THE COMPARE ARRAY SET EARLIER AS WELL / SWITCHED METHOD TO .CLONE()
//        Arrays.sort(newItems, 0, items.length);
        String arrayAsString = Arrays.toString(newItems);
        System.out.println(arrayAsString);
        System.out.println(Arrays.toString(compare));
        System.out.println(Arrays.equals(newItems, compare));










        // Example 3: Arrays.copyOf()
        // Returns a copy array of a given array of a given length

//        String[] badgerArray = new String[4];
//        Arrays.fill(badgerArray, "Badgers");

//        String[] twoBadgers = Arrays.copyOf(badgerArray, 2);
//        System.out.println(Arrays.toString(twoBadgers));










        // Example 4: Arrays.sort(array, startIndex, toIndex)
        // Sorts array elements alphabetically/numerically 2nd and 3rd arguments are optional.

//        String[] animals = {"Dog", "Rabbit", "Cat", "Snake", "Fish"};
//        System.out.println(Arrays.toString(animals));
//
//        Arrays.sort(animals);
//        System.out.println(Arrays.toString(animals));

//        String[] items = {"book", "fish", "table", "pencil", "dog", "glasses", "mouse", "key"};
//        Arrays.sort(items, 1, items.length - 1);
        // ^^^^^^^ SAME AS => {
//        Arrays.sort(items);//"book" at index 0 is already in the correct spot as far as alphabetical sorting goes
//        System.out.println(Arrays.toString(items));







        /* ******************************************************** */
        /* ************** Two-Dimensional Arrays  ***************** */
        /* ******************************************************** */


        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };





//        // access the first element in the second row
//        System.out.println(matrix[1][0]); // 4


//        // the last element in the first row
//        System.out.println(matrix[0][2]); // 3


//        // the first element in the last row
//        System.out.println(matrix[2][0]); // 7




        /* ******************************************************** */
        /* ************** Arrays vs. Array Lists  ***************** */
        /* ******************************************************** */

        //https://stackoverflow.com/questions/4842883/are-there-reasons-to-prefer-arrays-over-arraylists

        //Remember that Arrays in Java are a less flexible data type than Arrays in JavaScript. This is why our Array methods are limited.

        //collections.ArrayLists in Java which we will experience later are more similar to Arrays we saw in JavaScript and allows for different functionality.



    }
}