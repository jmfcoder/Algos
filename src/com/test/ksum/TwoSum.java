package com.test.ksum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class TwoSum {

	public static int[] compute(int[] inputArr, int targetNumber) {
		Map<Integer,Integer> pmap = new HashMap<>();
		for (int i = 0; i < inputArr.length; i++) {
			int b = targetNumber - inputArr[i];
			if(pmap.get(b)!=null) {
				return new int[] {pmap.get(b),i+1};
			}else pmap.put(inputArr[i], i+1);
		}
		return null;
	}
	
	public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(target - numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
               if (map.get(numbers[i]) != i) {
                    return new int[]{i + 1, map.get(numbers[i]) + 1};
                }
            }
        }
        return new int[2];
    }

	public static void main(String[] args) {
		int[] op = compute(new int[] { 10, 11, 22, 33, 44, 66 }, 77);
		System.out.println(" RESULT = "+ Arrays.toString(op));
		int[] op1 = twoSum(new int[] { 10, 11, 22, 33, 44, 66 }, 77);
		System.out.println(" RESULT = "+ Arrays.toString(op1));
		int[] op2 = newCompute(new int[] { 10, 11, 22, 33, 44, 66 }, 77);
		System.out.println(" RESULT = "+ Arrays.toString(op2));
	}
	
	public static int[] newCompute(int[] data, int finalInt) {
		Map<Integer,Integer> computed = new HashMap();
		
		Stream<Object> length = Arrays.asList(data).stream().map( row ->  {
			Map computed1 = new HashMap();
			computed1.put(row.toString(), row.toString());
		return computed1;
		}
		);length.findAny();
		length.sequential().toString();
		
		for (int i = 0; i < data.length; i++) {
			int temp = finalInt - data[i];
			if(computed.get(temp)!=null) {
				return new int[] {computed.get(temp),i+1};
			}
			computed.put(data[i], i+1);
		}
		return null;
	}

}
