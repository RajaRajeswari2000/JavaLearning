package exerciseprogram.conditionalAndLoop;

public class IndexOfArray {

	public int findIndexOfArray(int[] numbers,int target) {
		int result=0;
		for(int i=0;i<numbers.length;++i) {
			if(target==numbers[i]) {
				result=i;
			}
		}
		
		return result;
		
	}
	
	
	
	public static void main(String[] args) {
		IndexOfArray indexOfArray =new IndexOfArray();
		int[] numbers= {9,6,4,3,1,5, 4};
		int result=indexOfArray.findIndexOfArray(numbers, 4);
		System.out.println(result);
	}

}
