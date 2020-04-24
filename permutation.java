package com.demo.code;

import java.util.HashSet;
import java.util.Set;

public class permutation {

	public boolean missingNumber(int[] nums) {
		Set<Integer> numSet = new HashSet<Integer>();
		for (int num : nums)
			numSet.add(num);

		int expectedNumCount = nums.length + 1;
		for (int number = 0; number < expectedNumCount; number++) {
			if (!numSet.contains(number)) {
				return false;
			}
		}
		return true;
	}
}
