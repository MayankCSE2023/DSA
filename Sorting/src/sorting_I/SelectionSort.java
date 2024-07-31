package sorting_I;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,32,3,33,5,6,83,1};
		selectionSort(arr,arr.length);
		
		for(int e: arr) {
			System.out.print(e+" ");
		}
		

	}
	
	static void selectionSort(int arr[], int n)
	{
	    //code here
	    
	    for(int i=0;i< n;i++){
	        for(int j=i+1;j<n;j++){
	            if(arr[j]<arr[i]){
	                int temp=arr[j];
	                arr[j]=arr[i];
	                arr[i]=temp;
	            }
	        }
	    }
	}

}
