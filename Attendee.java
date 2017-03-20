
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Attendee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
		
		String temp=scanner.nextLine();
		temp=temp.replaceAll("\\{", "");
		temp=temp.replaceAll("\\}", "").replaceAll(" ", "");
		String [] tempToInt=temp.split(",");
		int n=Integer.parseInt(tempToInt[0]);
		int k=Integer.parseInt(tempToInt[1]);
		
		int [] y=new int[tempToInt.length/2-1];
		int [] x=new int[tempToInt.length/2-1];
		boolean [] ncheck=new boolean[n];
		List<Integer> xx=new ArrayList<Integer>();
		List<Integer> yy=new ArrayList<Integer>();
		for(int i=2;i<tempToInt.length;i++)
		{
			if(i<tempToInt.length/2+1)
			{
				x[i-2]=Integer.parseInt(tempToInt[i]);
				xx.add(Integer.parseInt(tempToInt[i]));
			}
			else
			{  
			   y[i-tempToInt.length/2-1]=Integer.parseInt(tempToInt[i]);
			   yy.add(Integer.parseInt(tempToInt[i]));
			}
		}
		List<Integer> goup=new ArrayList<Integer>();
		List<Set<Integer>> goup2=new ArrayList<Set<Integer>>();
		
		
		for(int ii=0;ii<x.length;ii++)
		{
			boolean flag=false;
			ncheck[x[ii]]=true;
			ncheck[y[ii]]=true;
			for(Set<Integer> si:goup2)
			{
				if(si.contains(new Integer(x[ii]))||si.contains(new Integer(y[ii])))
				{
					si.add(x[ii]);
					si.add(y[ii]);
					flag=true;
				}
				
			}
			
			if(!flag)
			{
				Set<Integer> tempset=new HashSet<Integer>();
				tempset.add(x[ii]);
				tempset.add(y[ii]);
				goup2.add(tempset);
			}

    	}
		
		
		
		
		for(int i=0;i<n;i++)
		{
			if(!ncheck[i])
			{
				goup.add(1);
			}else 
			{
				int checknum=0;
				int firstindex=0;
				for(int j=0;j<goup2.size();j++)
				{
					Set<Integer> si=goup2.get(j);
					if(si.contains(new Integer(i)))
					{
							
						if(checknum==0)
							firstindex=j;
						else
						{
							goup2.get(firstindex).addAll(si);
							goup2.remove(j);
						}
						checknum++;
					}
				}
			}
		}
		
		for(Set<Integer> si:goup2)
		{
			goup.add(si.size());
		}
		
		
//		System.out.println(goup);
//		System.out.println(k);
//		System.out.println("----------result-----------------");
		if(caculate(goup , k))
			System.out.println("Possible");
		else 
			System.out.println("Impossible");
		
		}
	}
	
	public static boolean caculate(List<Integer> goup ,int k)
	{
		if(goup.contains(new Integer(k))||k==0)
		{
			return true;
		}
		else
		{
			for(int i=1;i<k/2+1;i++)
			{
				if(goup.contains(new Integer(i)))
				{
					List<Integer> newgoup=new ArrayList<Integer>(goup);
					newgoup.remove(new Integer(i));
					if(caculate(newgoup, k-i))
						return true;
				}
			}
			return false;
		}
	}
}
