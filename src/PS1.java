import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


	//Methods, Variable of parent class 
public class PS1 {

	@BeforeMethod
	public void bfRun() {

		System.out.println("Run this first");
		
	}
	
	
	public void doThis(){
		System.out.println("I am here");
		
	}
	
	@AfterMethod
	public void afRun() {

		System.out.println("Run this last");
		
	}

}
