package binarySearchOnAnswer;

public class NthRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(NthRoot(2,625));

	}
	
	public static int NthRoot(int n, int m) {
        // Write your code here.
        int low = 0;
		int high = m/n;
		int mid;
		int ans=-1;

		while (low <= high) {
			mid = low + (high - low) / 2;

            int product=1;
            for(int i=0;i<n;i++){
                product=product*mid;
            }

			if (product == m) { //Note: Always use binary search when we know that till some point answer is valid and after that point the answer is not valid
				ans = mid;
				break;
			} else if(product>m){
				high = mid - 1;
			}else {
				low=mid+1;
			}
		}
		return ans;
    }

}
