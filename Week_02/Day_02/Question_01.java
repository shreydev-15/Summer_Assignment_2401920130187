package Week_02.Day_02;

class Question_01 {
    public int lengthOfLongestSubstring(String s) {
        int lastindex[]= new int[256];
       for(int i = 0; i< lastindex.length; i++){
           lastindex[i]=-1;
       }
       int start = 0;
       int maxlen = 0;
       for(int end = 0; end<s.length(); end++){
           char ch = s.charAt(end);
           if(lastindex[ch]>=start){
               start = 1+lastindex[ch];
           }
           lastindex[ch] = end;
           maxlen = Math.max(maxlen, end-start+1);
       }
       return maxlen;
    }

    
}