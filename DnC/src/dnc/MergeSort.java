package dnc;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {3,54,2,1,4,5,2,3,53};
		mergeSort(nums, 0, nums.length-1);
		
		for(int e:nums) {
			System.out.print(e+" ");
		}

	}
	
	public static void mergeSort(int[] nums,int low,int high) {
		if(low<high) {
			int mid= low+ (high-low)/2;
			
			mergeSort(nums,low,mid);
			mergeSort(nums,mid+1,high);
			merge(nums,low,mid,high);
		}
	}

	private static void merge(int[] nums, int low, int mid, int high) {
		// TODO Auto-generated method stub
		int i=low;
		int j=mid+1;
		int k=0;
		int[] aux=new int[high-low+1];
		
		while(i<mid+1 && j<=high) {
			if(nums[i]<=nums[j]) {
				aux[k++]=nums[i++];
			}else {
				aux[k++]=nums[j++];
			}
		}
		
		if(i>=mid+1) {
			while(j<=high) {
				aux[k++]=nums[j++];
			}
		}else {
			while(i<mid+1) {
				aux[k++]=nums[i++];
			}
		}
		
		k=0;
		while(low<=high) {
			nums[low++]=aux[k++];
		}
	}

}
