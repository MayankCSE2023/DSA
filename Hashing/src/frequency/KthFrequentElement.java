package frequency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KthFrequentElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {1,1,1,0,0,3,3,4,5};
		int res= KthFrequentElement(nums,2);
		System.out.print(res);
		

	}

	public static int KthFrequentElement(int[] nums, int k) {
		List<Integer>[] bucket = new List[nums.length + 1];

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}

		for (int e : map.keySet()) {
			int frequency = map.get(e);

			if (bucket[frequency] == null) {
				bucket[frequency] = new ArrayList<>();
				bucket[frequency].add(e);
			} else {
				bucket[frequency].add(e);
			}
		}

		int count = 0;
		int kthL = Integer.MIN_VALUE;
		boolean kth = false;

		for (int i = bucket.length - 1; i >= 0 && kth == false; i--) {
			if (bucket[i] != null) {
				for (int e : bucket[i]) {
					count++;

					if (count == k) {
						kthL = e;
						kth = true;
					}
				}
			}
		}

		return kthL;
	}
}
