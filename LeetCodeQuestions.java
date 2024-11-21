import java.util.*;

public class LeetCodeQuestions {
    public static void main(String[] args) {
        String[] str = {"ate","eat","tea","fox","oxf","dep"};
        String[] str1 = {""};
        System.out.println(groupAnagrams(str));

    }
    //Need to group the word which are having same alphabets
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

}
