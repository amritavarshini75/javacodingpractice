import java.util.*;

public class DuplicateElementsAndItsCount {
    public static void main(String[] args) {
        String[] arr = {"baby","ball","soap","baby","shampoo","chalk","soap","makeup","baby","lotion"};
        int count;
        List<String>  wordList = new ArrayList<>();
        wordList.addAll(Arrays.asList(arr));
        Map<String,Integer> wordCountList = new HashMap<>();
        for (String word:
             wordList) {
            wordCountList.put(word,wordCountList.getOrDefault(word,0)+1);
        }

        for(Map.Entry<String,Integer> entries : wordCountList.entrySet())
        {
            if(entries.getValue()>1)
            {
                System.out.println(entries.getKey() + " " + entries.getValue());
            }
        }

    }
}
