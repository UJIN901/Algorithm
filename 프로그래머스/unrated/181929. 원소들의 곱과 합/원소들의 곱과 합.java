import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int temp_1 = 1;
        int temp_2 = Arrays.stream(num_list).sum();
        for(int num : num_list){
            temp_1 *= num;
        }
        answer = temp_1 > (temp_2 * temp_2) ? 0 : 1;
        
        return answer;
    }
}