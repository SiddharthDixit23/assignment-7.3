import java.util.*;

class One
{
	String st,substr;
	int flag;
	int count=0;
	Scanner obj = new Scanner(System.in);
	
	void find()
	{
		System.out.println("Enter String 1: ");
		st = obj.next();
		System.out.println("Enter String 2: ");
		substr = obj.next();
		int len=st.length();
	for(int i=0;i<len;i++)
    {
        for(int j=0;j<substr.length();j++)
        {
            if(st.charAt(i)==substr.charAt(j))
            {
                if(j!=substr.length()-1 && i!=st.length()-1)
                {
                    if(st.charAt(i+1)==substr.charAt(j+1))
                    {
                        
                        flag=1;
                        count++;
                    }
                }
            }
        }
    }
    if(flag==1)
    {
        System.out.println("String found.");
    }
    else
    {
        System.out.println("String not found.");
    }
	}
}




class StringContainWithoutClass
{
	public static void main(String[] args)
	{
		
		One o = new One();
		o.find();
   
}
}