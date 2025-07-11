class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int a:numbers) {
            answer += a;
        }
        answer = answer/numbers.length;
        return answer;
    }
}