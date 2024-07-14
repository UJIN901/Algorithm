public class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String charK = Integer.toString(k);
        for(int c = i; c <= j; c++){
            String temp = Integer.toString(c);
            for(int a = 0; a < temp.length(); a++){
                if(temp.charAt(a) == charK.charAt(0)){
                    answer++;
                }
            }
        }
        return answer;
    }
}