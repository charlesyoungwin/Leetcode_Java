import java.util.*;

class Solution {

    public String findLongestWord(String s, List<String> d) {
        Collections.sort(d, new Comparator<String>(){
            public int compare(String s1, String s2){
                if(s1.length() < s2.length()){
                    return 1;
                }
                else if(s1.length() > s2.length()){
                    return -1;
                }
                else{
                    return s1.compareTo(s2);
                }
            }
        }); 
        for(String item : d){
            if (s.length() < item.length())
                continue;
            if (isSubSeq(item, s)){
                return item;
            }
        } 
        return "";
   
    }

    public boolean isSubSeq(String item, String s){
        int i = 0;
        int j = 0;
        while(i < item.length() && j < s.length()){
            if(item.charAt(i) == s.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i == item.length();
    }

    public static void main(String[] args){
        String[] arr = {"ale","apple","monkey","plea"};
        List<String> d = new ArrayList<String>();
        for(String item : arr){
            d.add(item);
        }
        System.out.println(new Solution().findLongestWord("abpcplea", d));

    }
}