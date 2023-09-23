import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class doublonStringProblem {

    public static boolean doublon (String a, String b) {

        char[] firstString = a.toCharArray();
        Arrays.sort(firstString);

        char[] secondString = b.toCharArray();
        Arrays.sort(secondString);

        ArrayList<Character> customString = new ArrayList<>();

        for (char c: secondString) {
            customString.add(c);
        }

        String withoutA = customString.stream().filter(character -> character.equals('a')).collect(Collectors.toSet()).toString();
        System.out.println(withoutA);

        return (Arrays.equals(firstString, secondString));
    }

    @Test
    public void test() {
        System.out.println(doublon("ala", "laaaaa"));
        System.out.println(doublon("alaaaa", "laaaaa"));
        System.out.println(doublon("abcd", "cdab"));
        System.out.println(doublon("zedq", "zedqq"));
    }
}
