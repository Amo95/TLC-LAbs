public class Greeting
{
	private String greeting = "";
	private String target = "";

	//public (access modifier) - visibility >> who can call method
	public void setGreeting( String greeting)
	{
		this.greeting = greeting;
	}

	public void setTarget(String target) // String target >> No. and types of arguments
	{
		this.target = target;
	}

	public String greet()
	{
		this.target = target;
	}

	public String greet() // String here is the return type
	{
		return greeting + " " + target; // value to return; type must much return type
	}
}
