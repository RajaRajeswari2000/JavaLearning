package oops.loop;

public class MyNumber {
int n;
MyNumber(int n){
	this.n=n;
}


public String isPrime() {
	if(n<2) {
		return "not prime";
	}
	
	for (int i=2;i<=n-1;++i) {
		int	prime=n%i;
	if(prime==0) {
		return "not prime";
}
	
	}
	return "prime";
}
	

	}
	

	
	

