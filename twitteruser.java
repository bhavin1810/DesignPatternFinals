import java.util.Scanner;
import java.util.*;

public class twitteruser {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String tweets;String emos;
		
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
		u4.followers("@dhoni","@dravid","@pandey");
		u5.followers("@lara","@lee","@sachin");
		u6.followers("@sachin","@dhoni","@kohli");
		u7.followers("@muralidharan","@devillers","@gayle");
		u8.followers("@kohli","@lee","@gayle");
		u9.followers("@devillers","@dravid","@gayle");
		u10.followers("@dravid","@dhoni","@sachin");
		
		System.out.println("WELCOME TO TWITTER");
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
		          		u1.notify();
		              }
		case "kohli":
						{
						  System.out.println("Enter your tweet "+u2.returnName()+" :");
						  tweets = in.next();
						  System.out.println("How do you feel about this?");
			          	  emos = in.next();
						  u2.tweeting(tweets);
						  u2.emo(emos);
						  u2.notify();
						}            
		case "dhoni":
						{
							System.out.println("Enter your tweet "+u3.returnName()+" :");
							tweets = in.next();
							System.out.println("How do you feel about this?");
				          	emos = in.next();
							u3.tweeting(tweets);
							u3.emo(emos);
							u3.notify();
						}
		case "dravid":
						{
							System.out.println("Enter your tweet "+u4.returnName()+" :");
							tweets = in.next();
							System.out.println("How do you feel about this?");
				          	emos = in.next();
							u4.tweeting(tweets);
							u4.emo(emos);
							u4.notify();
						}
		case "gayle":
						{
							System.out.println("Enter your tweet "+u5.returnName()+" :");
							tweets = in.next();
							System.out.println("How do you feel about this?");
				          	emos = in.next();
							u5.tweeting(tweets);
							u5.emo(emos);
							u5.notify();
						}
		case "lara":
        				{
        					System.out.println("Enter your tweet "+u7.returnName()+" :");
        					tweets = in.next();
        					System.out.println("How do you feel about this?");
				          	emos = in.next();
							u7.tweeting(tweets);
							u7.emo(emos);
							u7.notify();
        				}
		case "lee":
        				{
        					System.out.println("Enter your tweet "+u6.returnName()+" :");
        					tweets = in.next();
        					System.out.println("How do you feel about this?");
				          	emos = in.next();
							u6.tweeting(tweets);
							u6.emo(emos);
							u6.notify();
        				}	
		case "pandey":
        				{
        					System.out.println("Enter your tweet "+u8.returnName()+" :");
        					tweets = in.next();
        					System.out.println("How do you feel about this?");
				          	emos = in.next();
							u8.tweeting(tweets);
							u8.emo(emos);
							u8.notify();
        				}
		case "devillers":
        				{
        					System.out.println("Enter your tweet "+u9.returnName()+" :");
        					tweets = in.next();
        					System.out.println("How do you feel about this?");
				          	emos = in.next();
							u9.tweeting(tweets);
							u9.emo(emos);
							u9.notify();
        				}
		case "muralidharan":
        				{
        					System.out.println("Enter your tweet "+u10.returnName()+" :");
        					tweets = in.next();
        					System.out.println("How do you feel about this?");
				          	emos = in.next();
							u10.tweeting(tweets);
							u10.emo(emos);
							u10.notify();
        				}		
        default:
        					System.out.println("You are not in our database");
		}   //switch case closed
		
		
	}
	
	
}
