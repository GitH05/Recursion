/*
Recursion: a function that call itself.
---call itself till a condition || base case.
--prerequisites:
	-iteration/loop
	-function

-always the logic or task are written in function.




*/

//print a number from 5 to 1 using recursion.
public class Recursion
{

//print function:
public static void printNumber(int n)
{

//base case
if(n==0)
{
return;
}

System.out.print(n+" ");

//recursion
printNumber(n-1);
}

//main method
public static void main(String[] args)
{
int n = 5;
System.out.println("Recusrsion");
printNumber(5);

}
}