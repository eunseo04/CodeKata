class Solution {
    public boolean solution(int x) {
        int number = 0;
        String num = String.valueOf(x);
        for (char a : num.toCharArray()){
            number += Character.getNumericValue(a);
        }
        if ((x%number) == 0) {
            return true;
        } else {
            return false;
        }
    }
}