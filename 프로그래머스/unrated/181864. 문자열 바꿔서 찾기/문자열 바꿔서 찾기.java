class Solution {
    public int solution(String myString, String pat) {
        StringBuilder newString = new StringBuilder(myString);
        int answer = 0;
        
        for(int i = 0; i < newString.length(); i++){
            if(newString.charAt(i) == 'A'){
                newString.setCharAt(i, 'B');
            } else {
                newString.setCharAt(i, 'A');
            }
        }
        if(newString.toString().contains(pat)){
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}