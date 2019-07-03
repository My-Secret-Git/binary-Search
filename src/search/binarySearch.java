package search;

public class binarySearch {
	
	public static void main(String[] args) {
		int[] arrays = new int[] {4,5,7,9,12,15,18,20,22,34,56,67,78,79,88,90,100};
		System.out.println(BinarySearch(arrays, 34));
		System.out.println(BinarySearch(arrays, 44));
	}

	/**非递归版本的二分搜索算法
	 * @param array 被搜索序列数组
	 * @param target 查找的目标元素
	 * @return 如果被搜索序列中存在目标元素，则返回目标元素在数组中的下；否则返回-1表示被搜索序列中不包含该目标元素
	 * @author Coll-Chen
	 *
	 */	
	public static  int BinarySearch(int[] arrays,int target) {
		
		//[1]定义被搜索序列的起点下标，终点下标和中间下标
		int start = 0;//起点下标
		int end = arrays.length-1;//终点下标
		int middle = (start + end)/2;//中间下标（向下取整，即取小于且最接近该值的整数）
		
		//[2]使用do-while循环实现一个二分搜索算法。为什么使用do-while循环呢？
		do {
			//只要还能运行到这个位置，说明又进行了一次二分搜索算法，此需要被搜索序列的起点和终点下标已经发生变化，需要重新计算
			middle=(start + end)/2;
			
			//[3]通过比较arrays[middle]的取值和target之间的大小关系，来确定是否进行下一次搜索，以及下一次搜索的起点和终点下标
			//[3.1]如果target<arrays[middle],表明目标元素有可能存在于中间下标元素的左边，下一次搜索范围[start,middle-1]
			if(target < arrays[middle]) {
				end = middle-1;
			}
			
			//[3.2]如果target>arrays[middle],表明目标元素有可能存在于中间下标元素的右边，下一次搜索范围[middle+1,end]
			if(target > arrays[middle]) {
				start = middle+1;
			}
			
			//[3.3]如果target=arrays[middle],表明目标元素在搜索序列中已经被找到，直接返回目标元素在数组中的下标即可
			if(target == arrays[middle]) {
				return  middle;
			}
			
		}while(start <= end);
		
		//[5]如果上述循环不能正常结束，则说明没有运行到do-while循环中的return语句，也就是说没有在被搜索序列中找到目标元素，此时返回-1,表示序列中不存在目标元素
		return -1;
	}
}
