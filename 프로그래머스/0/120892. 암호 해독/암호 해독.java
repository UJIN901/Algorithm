class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        for(int i = code - 1; i < cipher.length(); i += code){
            char ch = cipher.charAt(i);
            sb.append(ch);
        }
        
        String answer = sb.toString();
        return answer;
    }
}