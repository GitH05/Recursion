public class Fibonacci
{

public static void Fibonacci(int a, int b, int c)
{
/*
a = 2nd last term
b = last term
*/

if(c==0)
{
return;
}
int d = a + b;	//next term
System.out.print(d+",");
Fibonacci(b, d, c-1);
}

public static void main(String[] args)
{
int a = 0, b = 1;
int c = 5;
Fibonacci(a, b, c );
}
}