class Solution {
    public int[] solution(int []num_list) {
        int[] answer = new int[2]; // 홀수와 짝수의 개수를 저장할 배열
    
    for (int num : num_list) {
        if (num % 2 == 0) { // 짝수인 경우
            answer[0]++;
        } else { // 홀수인 경우
            answer[1]++;
        }
    }
    
    return answer; // 홀수와 짝수의 개수를 담은 배열 반환
}
}