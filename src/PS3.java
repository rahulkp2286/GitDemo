
public class PS3 extends PS4 //PS4 is parent pf PS3
{
	
	int a; //class variable 

	public PS3(int a) // here "int a" is instance variable it is coming from test  //constructor created // Note : constructor name will always be the class name 
	{
		// TODO Auto-generated constructor stub
		super(a); //parent class constructor is invoked 
		this.a=a;  //this refers to within class variable int a
	}

	
	//default constructor 
	public int increment() {
		 a=a+1; //Referring to class variable 
		 return a;
		
	}
	public int increments() {
		 a=a+1; //Referring to class variable 
		 return a;
		
	}

	public int decrement () {
		 a=a-1; //Referring to class variable 
		 return a;
		
	}
}
