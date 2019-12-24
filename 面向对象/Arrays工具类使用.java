package 数组2;

import java.util.Arrays;

/**
 * 测试    java.util.Arrays工具类使用
 * @author lhy
 *
 */
public class TestArray {
	public static void main(String[] args) {
		int[] a = {100,20,30,158,81,300};
		System.out.println(a);  //打印数组引用的值  哈希码？
		//打印数组元素的值
		System.out.println(Arrays.toString(a));   //此处toString 为静态方法  与之前继承的不一样
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, 81));//二分查找  找到返回索引  未找到饭就-1
		System.out.println(Arrays.binarySearch(a, -81));
	}

}
