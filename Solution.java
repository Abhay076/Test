package abc;

public class Solution {
//	Q.1 Create a function that takes a number as an input and returns the
//	number in words( without using third-party packages).
//	Range 1-1000(both number inclcusive)
//	For example
//	Input -555 Output - FIve hundred and fifty five
//	Input -560 Output - FIve hundred and sixty
	
	
	public static String numbersWord(long n) {
		long limit =1000000000000L;
		long current  =0;
		long t=0;
		if(n==0) {
			return ("Zero");
		}
		String multiplier[] = {
				"", "Trillion", "Billion", "Million", "Thousand"
		};
		String twenty[] = {
				"", "one", "Two", "three", "Four",
				"Five","Six", "Seven", "Eight", 
				"Nine", "Ten", "Eleven", "Twelve",
				"Thirteen", "Fourteen", "Fifteen", "Sixteen",
				"Seventeen", "Eighteen", "Nineteen",
		};
		String tens[] = {
				"", "Twenty", "Thirty", "Forty",
				"Fifty", "Sixty", "Seventy",
				"Eighty", "Ninety"
		};
		if(n<20L)
			return (twenty[(int)n]);
		String ans ="";
		for(long i=n;i>0;i%=limit, limit/=1000) {
			current = i/limit;
			while(current==0) {
				i%=limit;
				limit/=1000;
				current=i/limit;
				++t;
			}
		   if(current>99) 
			   ans+=(twenty[(int)current/100]+" hundred "
					   +"and ");
		   current = current % 100;
		   if(current>0 && current <20)
			   ans+=(twenty[(int)current]+" ");
		   else if(current%10==0 && current!=0)
			   ans+=(tens[(int)current/10-1]+" ");
		   else if(current>20 && current<100) 
			   ans+=(tens[(int)current/10-1]+" "
				    + twenty[(int)current%10]
					   +" ");
			 if(t<4)
				 ans+=(multiplier[(int)++t]+" ");
		   }
		
		return (ans);
		}
//	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1000;
//		Scanner sc = new Scanner(System.in);
		String ans= numbersWord(n);
		System.out.println(ans);

	}

}
