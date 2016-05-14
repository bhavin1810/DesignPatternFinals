//main class
import java.util.*;

public class twitteruser {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String tweets;String emos;
		reaction r = new reaction();
		r.initialize();
		int choice;int choicepage;

		
		users u1 = new users();
		u1.naming("@sachin");
		
		users u2 = new users();
		u2.naming("@kohli");
		
		users u3 = new users();
		u3.naming("@dhoni");
		
		users u4 = new users();
		u4.naming("@dravid");
		
		users u5 = new users();
		u5.naming("@gayle");
		
		users u6 = new users();
		u6.naming("@lee");
		
		users u7 = new users();
		u7.naming("@lara");
		
		users u8 = new users();
		u8.naming("@pandey");
		
		users u9 = new users();
		u9.naming("@devillers");
		
		users u10 = new users();
		u10.naming("@muralidharan");
		
		u1.followers("@kohli","@dhoni","@dravid");
		u2.followers("@muralidharan","@devillers","@pandey");
		u3.followers("@lara","@lee","@gayle");
		u4.followers("@dhoni","@kohli","@pandey");
		u5.followers("@lara","@lee","@sachin");
		u6.followers("@sachin","@dhoni","@kohli");
		u7.followers("@muralidharan","@devillers","@gayle");
		u8.followers("@kohli","@lee","@gayle");
		u9.followers("@pandey","@dravid","@gayle");
		u10.followers("@dravid","@dhoni","@sachin");
		
		System.out.println("WELCOME TO TWITTER");
		System.out.println("1.login\n2.react to someone's tweet or emotion");
		choicepage = in.nextInt();
		while(choicepage == 1)
		{	
		System.out.println("Enter your username to login");
		String username = in.next();
		
		switch(username)
		{
		case "sachin":
		              {
		            	System.out.println("Enter your tweet "+u1.returnName()+" :");
		          	    tweets = in.next();
		          	    System.out.println("How do you feel about this?");
		          	    emos = in.next();
		          		u1.tweeting(tweets);
		          		u1.emo(emos);
		          		u1.notifier();
		          	/*	System.out.println(" React to someone's 1.tweet or 2.emotion?");
		          		choice = in.nextInt();
		          		if(choice == 1)
		          			r.reactT();
		          		else
		          			r.reactE();*/    
		          		break;
		              }
		case "kohli":
						{
						  System.out.println("Enter your tweet "+u2.returnName()+" :");
						  tweets = in.next();
						  System.out.println("How do you feel about this?");
			          	  emos = in.next();
						  u2.tweeting(tweets);
						  u2.emo(emos);
						  u2.notifier();
						/*  System.out.println("React to someone's 1.tweet or 2.emotion?");
			          		choice = in.nextInt();
			          		if(choice == 1)
			          			r.reactT();
			          		else
			          			r.reactE();  */
			          		break;
						}            
		case "dhoni":
						{
							System.out.println("Enter your tweet "+u3.returnName()+" :");
							tweets = in.next();
							System.out.println("How do you feel about this?");
				          	emos = in.next();
							u3.tweeting(tweets);
							u3.emo(emos);
							u3.notifier();
						/*	System.out.println("React to someone's 1.tweet or 2.emotion?");
			          		choice = in.nextInt();
			          		if(choice == 1)
			          			r.reactT();
			          		else
			          			r.reactE();  */
			          		break;
						}
		case "dravid":
						{
							System.out.println("Enter your tweet "+u4.returnName()+" :");
							tweets = in.next();
							System.out.println("How do you feel about this?");
				          	emos = in.next();
							u4.tweeting(tweets);
							u4.emo(emos);
							u4.notifier();
						/*	System.out.println("React to someone's 1.tweet or 2.emotion?");
			          		choice = in.nextInt();
			          		if(choice == 1)
			          			r.reactT();
			          		else
			          			r.reactE();  */
			          		break;
						}
		case "gayle":
						{
							System.out.println("Enter your tweet "+u5.returnName()+" :");
							tweets = in.next();
							System.out.println("How do you feel about this?");
				          	emos = in.next();
							u5.tweeting(tweets);
							u5.emo(emos);
							u5.notifier();
						/*	System.out.println("React to someone's 1.tweet or 2.emotion?");
			          		choice = in.nextInt();
			          		if(choice == 1)
			          			r.reactT();
			          		else
			          			r.reactE(); */
			          		break;
						}
		case "lara":
        				{
        					System.out.println("Enter your tweet "+u7.returnName()+" :");
        					tweets = in.next();
        					System.out.println("How do you feel about this?");
				          	emos = in.next();
							u7.tweeting(tweets);
							u7.emo(emos);
							u7.notifier();
						/*	System.out.println("React to someone's 1.tweet or 2.emotion?");
			          		choice = in.nextInt();
			          		if(choice == 1)
			          			r.reactT();
			          		else
			          			r.reactE();  */
			          		break;
        				}
		case "lee":
        				{
        					System.out.println("Enter your tweet "+u6.returnName()+" :");
        					tweets = in.next();
        					System.out.println("How do you feel about this?");
				          	emos = in.next();
							u6.tweeting(tweets);
							u6.emo(emos);
							u6.notifier();
						/*	System.out.println("React to someone's 1.tweet or 2.emotion?");
			          		choice = in.nextInt();
			          		if(choice == 1)
			          			r.reactT();
			          		else
			          			r.reactE();  */
			          		break;
        				}	
		case "pandey":
        				{
        					System.out.println("Enter your tweet "+u8.returnName()+" :");
        					tweets = in.next();
        					System.out.println("How do you feel about this?");
				          	emos = in.next();System.out.println("React to someone's 1.tweet or 2.emotion?");
							u8.tweeting(tweets);
							u8.emo(emos);
							u8.notifier();
					/*		System.out.println("React to someone's 1.tweet or 2.emotion?");
			          		choice = in.nextInt();
			          		if(choice == 1)
			          			r.reactT();
			          		else
			          			r.reactE();  */
			          		break;
        				}
		case "devillers":
        				{
        					System.out.println("Enter your tweet "+u9.returnName()+" :");
        					tweets = in.next();
        					System.out.println("How do you feel about this?");
				          	emos = in.next();
							u9.tweeting(tweets);
							u9.emo(emos);
							u9.notifier();
					/*		System.out.println("React to someone's 1.tweet or 2.emotion?");
			          		choice = in.nextInt();
			          		if(choice == 1)
			          			r.reactT();
			          		else
			          			r.reactE();  */
			          		break;
        				}
		case "muralidharan":
        				{
        					System.out.println("Enter your tweet "+u10.returnName()+" :");
        					tweets = in.next();
        					System.out.println("How do you feel about this?");
				          	emos = in.next();
							u10.tweeting(tweets);
							u10.emo(emos);
							u10.notifier();
					/*		System.out.println("React to someone's 1.tweet or 2.emotion?");
			          		choice = in.nextInt();
			          		if(choice == 1)
			          			r.reactT();
			          		else
			          			r.reactE();  */
			          		break;
        				}		
        default:
        					System.out.println("You are not in our database");break;
		
	    }   //switch case closed
		                   System.out.println("Press 1 to continue to twitter\n2.react to someone's tweet or emotion");
		                   choicepage=in.nextInt();
		                   if(choicepage==2)
		                	   break;
		}  //while loop closed
		
	    while(choicepage==2)
	    {  	
	    String username;
		System.out.println("Enter your username to login");
		username = in.next();
		switch(username)
		{
		case "sachin":
		{
			System.out.println("React to someone's 1.tweet or 2.emotion?");
			choice = in.nextInt();
			if(choice == 1)
      			r.reactT();
      		else
      			r.reactE();  
      		break;
			
		}
		case "kohli":
		{
			System.out.println("React to someone's 1.tweet or 2.emotion?");
			choice = in.nextInt();
			if(choice == 1)
      			r.reactT();
      		else
      			r.reactE();  
      		break;
			
		}
		case "dhoni":
		{
			System.out.println("React to someone's 1.tweet or 2.emotion?");
			choice = in.nextInt();
			if(choice == 1)
      			r.reactT();
      		else
      			r.reactE();  
      		break;
			
		}
		case "dravid":
		{
			System.out.println("React to someone's 1.tweet or 2.emotion?");
			choice = in.nextInt();
			if(choice == 1)
      			r.reactT();
      		else
      			r.reactE();  
      		break;
			
		}
		case "gayle":
		{
			System.out.println("React to someone's 1.tweet or 2.emotion?");
			choice = in.nextInt();
			if(choice == 1)
      			r.reactT();
      		else
      			r.reactE();  
      		break;
			
		}
		case "lee":
		{
			System.out.println("React to someone's 1.tweet or 2.emotion?");
			choice = in.nextInt();
			if(choice == 1)
      			r.reactT();
      		else
      			r.reactE();  
      		break;
			
		}
		case "lara":
		{
			System.out.println("React to someone's 1.tweet or 2.emotion?");
			choice = in.nextInt();
			if(choice == 1)
      			r.reactT();
      		else
      			r.reactE();  
      		break;
			
		}
		case "pandey":
		{
			System.out.println("React to someone's 1.tweet or 2.emotion?");
			choice = in.nextInt();
			if(choice == 1)
      			r.reactT();
      		else
      			r.reactE();  
      		break;
			
		}
		case "devillers":
		{
			System.out.println("React to someone's 1.tweet or 2.emotion?");
			choice = in.nextInt();
			if(choice == 1)
      			r.reactT();
      		else
      			r.reactE();  
      		break;
			
		}
		case "muralidharan":
		{
			System.out.println("React to someone's 1.tweet or 2.emotion?");
			choice = in.nextInt();
			if(choice == 1)
      			r.reactT();
      		else
      			r.reactE();  
      		break;
			
		}
		default:
			System.out.println("You are not in our database");break;
		
		}//switch2 closed
		 System.out.println("2.continue reacting to tweets and emotions/n3.view stats");
		 choicepage = in.nextInt();
		 if(choicepage==3)
			 break;
	    }//while2 closed	
		
		r.calculate();
	}   //main closed
		
	

	
}//class closed
