class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        for(int i = 1; i <= ((n+1) / 2); i++){
            answer[i-1] = i * 2 - 1; 
        }
        
        return answer;
    }
}