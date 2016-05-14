
public class users implements tweet,emotion {

     String handle;
     String f1,f2,f3;
     String tweet;
     String emotion;
     
     public void naming(String hname)
     {
    	 handle=hname;
     }
     public String returnName()
     {
    	 return handle;
     }
     
    void followers(String a, String b, String c)
    {
    	f1 = a;
    	f2 = b;
    	f3 = c;
    }
    
    
   @Override
    public void tweeting(String stuff1)
    {
    	tweet = stuff1;    	
    }
   
    @Override
    public void emo(String mood)
    {
    	emotion = mood;
    }
    
    void notify()
    {
    	System.out.println("Hey! "+f1+ "," +f2+ "and " +f3+ ".  "+handle+" just tweeted this:");
    	System.out.println("          "+tweet);
    	System.out.print("  and he's "+emotion);	
    }
  
}   


