package Day4a2;

public class Ex7 {
	
	public static void main(String[] args)
    {
        final ChildClass objChildClass = new ChildClass(); 
      
        ChildClass.UserId = 789;
        //objChildClass = new ChildClass();
        System.out.println(" "+ChildClass.UserId);
    }
}

class ChildClass
{
    public static int  UserId = 154;  
        
}


