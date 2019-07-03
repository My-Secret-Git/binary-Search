package search;

public class binarySearch {
	
	public static void main(String[] args) {
		int[] arrays = new int[] {4,5,7,9,12,15,18,20,22,34,56,67,78,79,88,90,100};
		System.out.println(BinarySearch(arrays, 34));
		System.out.println(BinarySearch(arrays, 44));
	}

	/**�ǵݹ�汾�Ķ��������㷨
	 * @param array ��������������
	 * @param target ���ҵ�Ŀ��Ԫ��
	 * @return ��������������д���Ŀ��Ԫ�أ��򷵻�Ŀ��Ԫ���������е��£����򷵻�-1��ʾ�����������в�������Ŀ��Ԫ��
	 * @author Coll-Chen
	 *
	 */	
	public static  int BinarySearch(int[] arrays,int target) {
		
		//[1]���屻�������е�����±꣬�յ��±���м��±�
		int start = 0;//����±�
		int end = arrays.length-1;//�յ��±�
		int middle = (start + end)/2;//�м��±꣨����ȡ������ȡС������ӽ���ֵ��������
		
		//[2]ʹ��do-whileѭ��ʵ��һ�����������㷨��Ϊʲôʹ��do-whileѭ���أ�
		do {
			//ֻҪ�������е����λ�ã�˵���ֽ�����һ�ζ��������㷨������Ҫ���������е������յ��±��Ѿ������仯����Ҫ���¼���
			middle=(start + end)/2;
			
			//[3]ͨ���Ƚ�arrays[middle]��ȡֵ��target֮��Ĵ�С��ϵ����ȷ���Ƿ������һ���������Լ���һ�������������յ��±�
			//[3.1]���target<arrays[middle],����Ŀ��Ԫ���п��ܴ������м��±�Ԫ�ص���ߣ���һ��������Χ[start,middle-1]
			if(target < arrays[middle]) {
				end = middle-1;
			}
			
			//[3.2]���target>arrays[middle],����Ŀ��Ԫ���п��ܴ������м��±�Ԫ�ص��ұߣ���һ��������Χ[middle+1,end]
			if(target > arrays[middle]) {
				start = middle+1;
			}
			
			//[3.3]���target=arrays[middle],����Ŀ��Ԫ���������������Ѿ����ҵ���ֱ�ӷ���Ŀ��Ԫ���������е��±꼴��
			if(target == arrays[middle]) {
				return  middle;
			}
			
		}while(start <= end);
		
		//[5]�������ѭ������������������˵��û�����е�do-whileѭ���е�return��䣬Ҳ����˵û���ڱ������������ҵ�Ŀ��Ԫ�أ���ʱ����-1,��ʾ�����в�����Ŀ��Ԫ��
		return -1;
	}
}
