package c6_1;

import java.util.Arrays;

public class c6_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		//sort排序和二分搜索
		int arr[] = {4, 25, 10};
		Arrays.sort(arr);
		System.out.print("arr排序后：");
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
		int res = Arrays.binarySearch(arr, 0, 1, 8);		//为什么返回-2？
		//因为插入点的索引是从1开始的！而且返回的是搜索范围内的插入点
		System.out.println("\n二分搜索返回：" + res);
		
		//验证
		int arr1[] = {4, 25, 8, 10};
		Arrays.sort(arr1);
		System.out.print("arr1排序后：");
		for(int ele: arr1) {
			System.out.print(ele + " ");
		}
		int res1 = Arrays.binarySearch(arr1, 0, 2, 8);
		System.out.println("\n二分搜索返回：" + res1);
		
	}

}
