class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int tempNum : array){
            if(tempNum == n){
                answer++;
            }
        }
        return answer;
    }
}