import java.util.*;

public class reaction {

	int choice;String reacttw;String reactem;
	Scanner in = new Scanner(System.in);
    int[] reactTweet = new int[10];
	int[] reactEmo = new int[10];
	String[] userlist = {"@sachin","@kohli","@dhoni","@dravid","@gayle","@lee","@lara","@devillers","@muralidharan"};
   
	public void initialize()
	{
		for(int i=0;i<10;i++)
		{
			reactTweet[i]=0;reactEmo[i]=0;
		}
	}
	public void reactT()
	{
		System.out.println("Select celebrity");
		System.out.println("1.@sachin\n2.@kohli\n3.@dhoni\n4.@dravid\n5.@gayle\n6.@lee\n7.@lara\n8.@pandey\n9.@devillers\n10.@muralidharan");
		choice = in.nextInt();
		reactTweet[choice-1]++;
		System.out.println("Type your reaction");
		reacttw = in.next();
	}
	public void reactE()
	{
		System.out.println("Select celebrity");
		System.out.println("1.@sachin\n2.@kohli\n3.@dhoni\n4.@dravid\n5.@gayle\n6.@lee\n7.@lara\n8.@pandey\n9.@devillers\n10.@muralidharan");
		choice = in.nextInt();
		reactEmo[choice-1]++;
		System.out.println("Type your reaction");
		reactem = in.next();
	}
	public void calculate()
	{
		int max1=0;int max2=0;
		for(int j=0;j<10;j++)
		{
		   if(reactTweet[j]>reactTweet[max1])
			   max1=j;
		   if(reactEmo[j]>reactEmo[max2])
			   max2=j;
		}
		System.out.println(userlist[max1]+" has the highest number of reactions to his tweet");
		System.out.println(userlist[max2]+" has the highest number of reactions to his emotion");
	}
}
