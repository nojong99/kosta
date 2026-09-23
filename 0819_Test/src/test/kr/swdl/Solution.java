package test.kr.swdl;


class Solution {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int numer= (numer1*denom2)+(numer2*denom1);
		int denom= denom1*denom2;
		int[] answer = new int[2];
		
		for(int i=1000; i>1; i--) {
			if(numer%i==0 && denom%i==0)
				numer/=i;
				denom/=i;
		}
		answer[0]=numer;
		answer[1]=denom;
		System.out.println(answer[0]+""+answer[1]);
        return answer;
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
		s.solution(1,2,3,4);
	}
}