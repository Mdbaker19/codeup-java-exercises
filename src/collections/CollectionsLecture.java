package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class CollectionsLecture {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(23, 46, 32, 10, 6));
        for(int num : nums){
            System.out.println(num);
        }

        HashMap<Character, String> answers = new HashMap<>();
        // answers for a quiz possibly what each student "String" chose as an answer "Character"

        answers.put('A', "Sally");
        answers.put('C', "Jim");
        answers.put('D', "Jimbo");
        answers.put('T', "Jimbo");
        answers.put('U', "Jimbo");
        answers.put('E', "Dwight");
        answers.put('B', "Dwigt");
        answers.put('X', "Jim");

        System.out.println(answers);
        System.out.println(answers.get('C'));

        System.out.println(answers.keySet());//ALL THE KEYS IN THE GIVEN HASH MAP, STORED INTO A VARIABLE SET
        Set<Character> keys = answers.keySet();
        System.out.println(keys);

        // HOW TO FIND ALL THE KEYS ASSOCIATED WITH VALUE JIMBO
        // VALUE OF
        // LOOP AND/OR CONDITIONAL
        //  IS THERE A VALUE SET METHOD?

        // get the keys out with Set answer.keyset to then loop through it and compare all the keys to answers.get the key
        // and run the comparison operator ( if / else ) on it to check

        for(char key : keys){
            if(answers.get(key).equals("Jimbo")){
                System.out.println(key);
            }
        }


    }
}
