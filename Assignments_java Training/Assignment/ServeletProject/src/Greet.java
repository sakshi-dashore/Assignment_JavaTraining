/**
 * 
 */

/**
 * @author hp
 *
 */
public class Greet {
String name;


//public String getName() {
//		return name;
//	}

	public void init()
	//public void setName(String name) 
	{
		this.name = name;
	}


//public void sayHello()  
public void doGet(httpServeletRequest r, response res)
{
	System.out.println("welcome!"+name);
	
}

}
