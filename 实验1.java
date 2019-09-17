package shiyan1;
import java.util.*;
public class shiyan1 {
	public static void main(String[] args)
	{
		
		double max = 0,min = 0,heg;
		int x;
		Scanner in = new Scanner(System.in);
		System.out.println("qing shu ru xue sheng ti zhong :");
		heg = in.nextDouble();
		max = min = heg;
		for(x = 1;heg>=0;x++)
		{
			heg = in.nextDouble();
			if(heg<0)
				break;
			if(heg <min)
				min = heg;
			if(heg>max)
				max = heg;
			

		}
		System.out.println("max = "+max+"  min = "+min+"  ren shu wei:"+x);
	}

}

