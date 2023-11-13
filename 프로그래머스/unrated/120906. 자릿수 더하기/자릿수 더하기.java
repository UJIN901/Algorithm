class Solution {
    public int solution(int n) {
        int answer = 0;
        String nString = Integer.toString(n);
        for(int i = 0; i < nString.length(); i++){
            answer += Integer.parseInt(String.valueOf(nString.charAt(i)));
        }
        return answer;
    }
}