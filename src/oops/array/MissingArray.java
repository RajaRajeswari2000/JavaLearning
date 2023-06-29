package oops.array;

public class MissingArray {
	public void missingArray(int[] number,int n) {
		int missingnumber=0;
		int[] n1= {1,2,3,4,5};
		for(int i=0;i<=number.length-1;++i) {
			for(int j=i;j<=n1.length-1;++i) {
			if(number[i]==n1[j]) {
				missingnumber=0;
			}else {
				missingnumber=n1[j];
				
			}}
		}
		System.out.println(missingnumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
int[] numbers= {1,2,3,5};
MissingArray array=new MissingArray();
array.missingArray(numbers,n);
	}

}
