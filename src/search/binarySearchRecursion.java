package search;

public class binarySearchRecursion {
	
	public static void main(String[] args) {
		int[] arrays = new int[] {4,5,7,9,12,15,18,20,22,34,56,67,78,79,88,90,100};
		System.out.println(BinarySearchRecursion(arrays, 34, 0, arrays.length-1));
		System.out.println(BinarySearchRecursion(arrays, 44, 0, arrays.length-1));
	}
	
	
	/**
	 * ʹ�õݹ�ʵ�ֵĶ��������㷨
	 * @param arrays ���������е�����
	 * @param target
	 * @param start
	 * @param end
	 * @return ���Ŀ��Ԫ�������������У��򷵻�Ŀ��Ԫ�������������е��±꣬���򷵻�-1
	 */
	public static int BinarySearchRecursion(int[] arrays,int target,int start,int end) {
		
		//�����������±�����յ��±꣬˵��Ŀ��Ԫ�������������в����ڣ�����-1
		if(start > end) {
			return -1;//�ݹ����2,��������Χ�������յ�ʱ������-1��ʾĿ��Ԫ�ز�����
		}
		
		//[1]ͨ���������е�����±���յ��±꣬�����м��±�
		int middle = (start + end)/2;//����ȡ��
		
		//[2]���м��±�Ԫ����Ŀ��Ԫ�ؽ��бȽϣ������ݱȽϽ��ȷ���Ǽ����������Ƿ���Ŀ��Ԫ���±�
		if(target < arrays[middle]) {
			//�ݹ����1�����������������������
			return BinarySearchRecursion(arrays, target, start, middle-1);
		}else if(target > arrays[middle]) {
			//�ݹ����2�����ְ�����������������
			return BinarySearchRecursion(arrays, target, middle+1, end);
		}else {//�ȼ���target==arrays[middle]�����
			return middle;//�ݹ����1���������������в��ҵ�Ŀ��Ԫ�أ�ֱ�ӷ���Ŀ��Ԫ�������������е��±ꡣ
		}
	}
}
