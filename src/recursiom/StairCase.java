package recursiom;

public class StairCase {
public static void main(String[] args) {
	System.out.println(calculate(4));
}
static int calculate(int n)
{
	if(n==0)
		return 1;
	if(n<0)
		return 0;
	int os=calculate(n-1);
	int ts=calculate(n-2);
	int ths=calculate(n-3);
	return os+ts+ths;
}
}
