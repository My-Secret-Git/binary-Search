package search;

public class binarySearchRecursion {
	
	public static void main(String[] args) {
		int[] arrays = new int[] {4,5,7,9,12,15,18,20,22,34,56,67,78,79,88,90,100};
		System.out.println(BinarySearchRecursion(arrays, 34, 0, arrays.length-1));
		System.out.println(BinarySearchRecursion(arrays, 44, 0, arrays.length-1));
	}
	
	
	/**
	 * 使用递归实现的二分搜索算法
	 * @param arrays 带搜索序列的数组
	 * @param target
	 * @param start
	 * @param end
	 * @return 如果目标元素在搜索序列中，则返回目标元素在搜索序列中的下标，否则返回-1
	 */
	public static int BinarySearchRecursion(int[] arrays,int target,int start,int end) {
		
		//如果发现起点下标大于终点下标，说明目标元素在搜索序列中不存在，返回-1
		if(start > end) {
			return -1;//递归出口2,当搜索范围起点大于终点时，返回-1表示目标元素不存在
		}
		
		//[1]通过搜索序列的起点下标和终点下标，计算中间下标
		int middle = (start + end)/2;//向下取整
		
		//[2]将中间下标元素与目标元素进行比较，并根据比较结果确定是继续搜索还是返回目标元素下标
		if(target < arrays[middle]) {
			//递归调用1，在左半个序列区间进行搜索
			return BinarySearchRecursion(arrays, target, start, middle-1);
		}else if(target > arrays[middle]) {
			//递归调用2，在又半个序列区间进行搜索
			return BinarySearchRecursion(arrays, target, middle+1, end);
		}else {//等价于target==arrays[middle]的情况
			return middle;//递归出口1，当在搜索序列中查找到目标元素，直接返回目标元素在搜索序列中的下标。
		}
	}
}
