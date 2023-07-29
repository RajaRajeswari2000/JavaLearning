package exerciseprogram.conditionalAndLoop;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        int[] result =new int[2];
      for(int i=0;i<nums.length;++i){
          for(int j=1;j<nums.length;++j){
              if(target==nums[i]+nums[j]){
                 result[0]=i;
                 result[1]=j;
                 return result;
              }
          }
      } 
      System.out.println(result);
        return new int[0];
    }

	public static void main(String[] args) {
		TwoSum sumOfTwo=new TwoSum();
		int[]nums= {3,1,2};
		int target=5;
		int[] sumOf=sumOfTwo.twoSum(nums, target);
        System.out.println(sumOf);
	}

}
