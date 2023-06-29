package oops.BigDecimal;
//IMPORT THE PACKAGE OF BIGDECIMAL
import java.math.BigDecimal;

public class SimpleInterestCalculator {
	BigDecimal principal;
	BigDecimal interest;
	public SimpleInterestCalculator(String principal, String interest) {
	
		this.principal=new BigDecimal(principal);
		this.interest=new BigDecimal(interest);
	}
	public BigDecimal calculateTotalValue(int noOfYear) {
		//total value = principal+principal*interest*year
		//The method multiply(BigDecimal) in the type BigDecimal is not applicable for the arguments(int)-we have to use new BigDecimal(int/string)
		BigDecimal value=principal.add(principal.multiply(interest.multiply(new BigDecimal(noOfYear))));
		return value;
		//we couldn't use operator(+*%/)in BD
	}

}

//