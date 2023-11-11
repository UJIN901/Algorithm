import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        Arrays.sort(array);
        int answer = 0;
        for (int otherHeight : array){
            if(otherHeight > height){
                break;
            }
            answer++;
        }
        return array.length - answer;
    }
}