class Solution {
    public int[] solution(int[] numbers) {
        for(int i=0; i<=numbers.length-1; i++){
            numbers[i]*=2;
        }
        return numbers;
    }
}