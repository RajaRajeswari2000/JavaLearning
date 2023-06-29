package oops.array;

public class Student {
	private String name;
	private int[] mark;
	
	

	public Student(String name, int ... mark) {
		// TODO Auto-generated constructor stub
		this.mark=mark;
		this.name=name;
		
		
	}

	public int getNumOfMarks() {
		return mark.length;
	}

	public int getSumOfMarks() {
		int sum=0;
		for(int i=0;i< mark.length;++i) {
			sum +=mark[i];
		}
		return sum;
	}

	public int getMaxMarks() {
		int maximum=0;
		for(int i=0;i<mark.length;++i) {
			if(mark[i]>maximum) {
				maximum=mark[i];
				}}
		return maximum;
	}


	public int getMinMarks(int max) {
		int minimum=max;
		for(int i=0;i<mark.length;++i) {
			if(mark[i]<minimum) {
				minimum=mark[i];
				}
	}
		return minimum ;
}
}
