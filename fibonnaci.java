
public class B {

	public static void main(String[] args) {
		int a=1,b=2,sum=2;
		int s=0;
		System.out.println(a+"\n"+b);
		for(int i=0;;i++)
		{
			s=a+b;
			a=b;
			b=s;
			if(s>4000000)
				break;
			System.out.println(s);
			
			if(s%2==0)
				sum+=s;
		}
		System.out.println(sum);
		
		
	
	}
}

