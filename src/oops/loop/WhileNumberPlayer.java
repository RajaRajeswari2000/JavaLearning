package oops.loop;

public class WhileNumberPlayer {
 private int n;
 WhileNumberPlayer(int n){
	 this.n=n;
 }
 public void playerSquareUptoLimit() {
	 int i=1;
	 while((i*i)<n) {
		System.out.print(i*i + " ");
		i++;
	 //for(int i=1;i<=n;++i) {
		// if((n-i)>limit) {
		  //limit=i*i;
		 //System.out.println(limit);
		 }
	 System.out.println();
	 }
    
 public void playerCubeUptoLimit() {
	 int i=1;
	 while((i*i*i)<n) {
		System.out.print(i*i*i + " ");
		i++;
	 }
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileNumberPlayer player=new WhileNumberPlayer(30);
		player.playerSquareUptoLimit();
		player.playerCubeUptoLimit();
	}

}
