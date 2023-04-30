package secondSem;

public class Divisible_11 {

	public static void main(String[] args) {
	
			System.out.println(divisib(1331));
			}
			static int divisib(int n)
			{
				if(n==0)
					return 0;
				if(Math.floor(Math.log10(n)+1)%2==0)
				{
					return (divisib(n/10)+n%10);
				}
				else 
				{
					return (divisib(n/10)-n%10);
			}
				
			}
		}