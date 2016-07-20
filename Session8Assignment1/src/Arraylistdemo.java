import java.util.*;

public class Arraylistdemo {
	public static void main (String args[])
	{
		ArrayList<Integer> array=new ArrayList<Integer>();
		/*array.add(10);
		array.add(8);
		array.add(1);
		array.add(7);
		array.add(6);*/
		for(int i=0;i<10;i++)
		{
			array.add(i*5+2);
		}
		
		Iterator<Integer> iterate=array.iterator();
		System.out.println("size of the array is  " +array.size());
	while(iterate.hasNext())
	{
		System.out.println(iterate.next());
	}
	}

}
