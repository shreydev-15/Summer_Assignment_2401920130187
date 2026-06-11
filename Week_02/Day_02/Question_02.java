package Week_02.Day_02;

import java.util.Arrays;

public class Question_02 {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
       int m = s2.length();
       if(n>m){
           return false;
       }
       char []s1arr = s1.toCharArray();
       Arrays.sort(s1arr);
       for(int i = 0; i<s2.length()-n+1; i++){
           String sub = s2.substring(i, i+n);
           char[]subarr = sub.toCharArray();
           Arrays.sort(subarr);
           if(Arrays.equals(subarr,s1arr)){
               return true;
           }
       }
       return false;
    }
}
