package exerciseprogram.Common;

public class Books {
private int noOfCopies;
    Books(int noOfCopies){
	this.noOfCopies=noOfCopies;
    }

	void setnoOfCopies(int noOfCopies) {//300.....400.....-50
		if(noOfCopies>0) {
		this.noOfCopies=noOfCopies;//300...400
		//System.out.println(noOfCopies);
		//System.out.println(this.noOfCopies);
		}
	}
	public void increasenoOfCopies(int howmany) {//100
		setnoOfCopies(this.noOfCopies+howmany);//300+100=400
		//this.noOfCopies=this.noOfCopies+howmany;//300+100=400
		
	}
	public void decreasenoOfCopies(int howmany) {//450
		setnoOfCopies(this.noOfCopies-howmany);//400-450=-50
		//if(howmany<this.noOfCopies)
		//this.noOfCopies=this.noOfCopies-howmany;
		
	}
	int getnoOfCopies() {
		return this.noOfCopies;
	


}}
