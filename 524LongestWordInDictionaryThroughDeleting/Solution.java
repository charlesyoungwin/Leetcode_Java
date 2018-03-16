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
            int i = 0;
            for(char c : s.toCharArray()){
                if( i < item.length() && c == item.charAt(i))
                    i++;
            }
            if(i == item.length()){
                return item;
            }
        }
        return "";
    }


    public static void main(String[] args){
        String[] arr = {"ale","appleasdfasdf","monkey","plea"};
        List<String> d = new ArrayList<String>();
        for(String item : arr){
            d.add(item);
        }
        System.out.println(new Solution().findLongestWord("abpcplea", d));

    }
}