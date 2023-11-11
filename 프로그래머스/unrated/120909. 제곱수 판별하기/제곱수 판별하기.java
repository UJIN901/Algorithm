class Solution {
    public int solution(int n) {
        int answer = 2;
        int answerTemp = (int)Math.sqrt(n);
        if(answerTemp * answerTemp == n){answer = 1;}
        return answer;
    }
}