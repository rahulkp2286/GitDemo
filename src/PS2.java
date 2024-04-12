import org.testng.annotations.Test;


//extends is used as inheritance 
// inshort child is trying to inherit properties of parent class in this ex is class PS1
public class PS2  extends PS1 // PS1 is parent to PS2
{

	@Test
	public void testRun() {
		//PS1 ps1 = new PS1(); // if no inheritance is present then use object of that class and call the method
		//ps1.doThis();
	
		PS3 ps3 = new PS3(3); // Parameterized constructor 
		int a = 3;
		doThis(); // method is present in Parent class PS1 
		//System.out.println(ps3.increment(3));
		//System.out.println(ps3.decrement(3));
		System.out.println(ps3.increment());
		System.out.println(ps3.decrement());
		System.out.println("gitstuff changes 5th NA");
		System.out.println("gitdemo changes d");
		System.out.println("gitdemo  changes d");
		
		
		//PS4 ps4 = new PS4(3);
		System.out.println(ps3.multiplyofTwo());		
		System.out.println(ps3.multiplyofThree());	
		System.out.println(ps4.multiplyofThree());	
	}

}
