import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterWordsProblem {

    public static String[] filterWords(String[] words, String letters) {

        List<String> filteredWords = new ArrayList<>() ;


         for (char letter : letters.toCharArray()) {
             filteredWords.addAll(Arrays.stream(words).filter(word -> word.indexOf(letter) >= 0).toList());
         }

         return filteredWords.toArray(String[]::new);


    }



    @Test
    public void shouldTest() {
        String[] words = {"the" , "dog", "got", "a", "bone"};
        System.out.println(Arrays.toString(filterWords(words, "ae")));

    }

}
