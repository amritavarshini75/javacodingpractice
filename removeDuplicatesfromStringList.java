/* input : ["google" , "yaho"]
ouput: [[g,o,l,e],['y,a,h,o']]
 */

import java.util.*;

public class removeDuplicatesfromStringList {

    public static void main(String[] args) {


        List<String> arr = new ArrayList<String>();
        arr.add("google");
        arr.add("yahoo");
        List<String> nonDup = new ArrayList<String>();

        for (int a = 0; a< arr.size() ; a++) {
            char s[];
            s=arr.get(a).toCharArray();
            LinkedHashSet<Character> removeDup = new LinkedHashSet<>();
            for (Character c:s
                 ) {
                removeDup.add(c);
            }
            nonDup.add(removeDup.toString());
        }

        System.out.println(nonDup.toString());
    }


}
