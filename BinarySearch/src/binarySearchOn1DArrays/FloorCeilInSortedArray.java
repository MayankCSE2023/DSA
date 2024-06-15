package binarySearchOn1DArrays;

/*You're given a sorted array 'a' of 'n' integers and an integer 'x'.



Find the floor and ceiling of 'x' in 'a[0..n-1]'.



Note:
Floor of 'x' is the largest element in the array which is smaller than or equal to 'x'.
Ceiling of 'x' is the smallest element in the array greater than or equal to 'x'.


Example:
Input: 
n=6, x=5, a=[3, 4, 7, 8, 8, 10]   

Output:
4

Explanation:
The floor and ceiling of 'x' = 5 are 4 and 7, respectively.


Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
6 8
3 4 4 7 8 10


Sample Output 1 :
8 8


Explanation of sample input 1 :
Since x = 8 is present in the array, it will be both floor and ceiling.


Sample Input 2 :
6 2
3 4 4 7 8 10


Sample Output 2 :
-1 3*/

public class FloorCeilInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,3,4,6,7,10};
		int[] out= getFloorAndCeil(nums, 6, 8);
		
		for (int i : out) {
			System.out.println(i + " ");
		}

	}
	
	 public static int[] getFloorAndCeil(int[] a, int n, int x) {
	      // Wriute your code here.
	      int low=0;
	      int high=n-1;
	      int mid=0;

	      int[] out=new int[2];

	      while (low<=high) {

	        mid=low+(high-low)/2;

	        if(a[mid]==x){
	          out[0]=a[mid];
	          out[1]=a[mid];
	          break;
	        }else if(a[mid]>x){
	          if(mid-1!=-1 && a[mid-1]<x){
	            out[0]=a[mid-1];
	            out[1]=a[mid];
	            break;
	          }else if(mid-1==-1){
	            out[0]=-1;
	            out[1]=a[mid];
	            break;
	          }
	          high=mid-1;
	        }else{
	          if (mid+1!=n && a[mid+1]>x) {
	            out[0]=a[mid];
	            out[1]=a[mid+1];
	            break;
	          }else if(mid+1==n){
	            out[0]=a[mid];
	            out[1]=-1;
	            break;
	          }
	          low=mid+1;
	        }
	        
	      }

	      return out;
	    }

}
