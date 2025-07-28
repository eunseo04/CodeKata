class Solution {
    public int solution(long num) {
        int answer = 0;
        while (answer <= 500) {
            if(num%2 == 0){
                num /= 2;
                answer += 1;
            } else if (num == 1){
                return answer;
            } else {
                num = num*3+1;
                answer += 1;
            }
        }
        return -1;
    }
}