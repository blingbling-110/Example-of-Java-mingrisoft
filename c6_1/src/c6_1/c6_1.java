package c6_1;

import java.util.Arrays;

public class c6_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		//sort����Ͷ�������
		int arr[] = {4, 25, 10};
		Arrays.sort(arr);
		System.out.print("arr�����");
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
		int res = Arrays.binarySearch(arr, 0, 1, 8);		//Ϊʲô����-2��
		//��Ϊ�����������Ǵ�1��ʼ�ģ����ҷ��ص���������Χ�ڵĲ����
		System.out.println("\n�����������أ�" + res);
		
		//��֤
		int arr1[] = {4, 25, 8, 10};
		Arrays.sort(arr1);
		System.out.print("arr1�����");
		for(int ele: arr1) {
			System.out.print(ele + " ");
		}
		int res1 = Arrays.binarySearch(arr1, 0, 2, 8);
		System.out.println("\n�����������أ�" + res1);
		
	}

}
