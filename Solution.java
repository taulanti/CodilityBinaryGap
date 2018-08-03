class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int bestDist = 0;
        firstNum = N;
        firstDist = (int)(Math.log(N)/Math.log(2));
        int secondDist = 0;
        secondNum = N - Math.pow(2,firstDist);
        while(secondNum > 0){
            secondDist = (int)(Math.log(secondNum)/Math.log(2));
            if(bestDist < (firstDist - secondDist -1))
                bestDist = firstDist - secondDist - 1;
                firstDist = secondDist;
                firstNum = secondNum;
                secondNum -= Math.pow(2, secondDist);
            }
        return bestDist;
    }
}
