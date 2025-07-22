import java.util.*;
class Solution {
    public long solution(long n) {
        String num = String.valueOf(n);
        char[] arr = num.toCharArray();
        Character[] numArray = new Character[arr.length];
        for (int i = 0; i<numArray.length; i++){
            numArray[i] = arr[i];
        }
        Arrays.sort(numArray, Collections.reverseOrder());
        num = "";
        for (int i = 0; i<arr.length; i++){
            num += numArray[i];
        }
        return Long.valueOf(num);
    }
}