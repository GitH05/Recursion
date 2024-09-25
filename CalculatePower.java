//calculate power x^n upto stack height = n:
public class CalculatePower
{
public static int power(int x, int n)
{
if(x==0 || n==0)
{
return 1;}
int power1 = x * power(x,n-1);
return power1;
}
public static void main(String[] args)
{
System.out.print(power(2,5));
}
}