import java.util.Scanner;
class DoWhileLoop
{
	public static void main(String[] args)
	{
		int table=5;
		int count=1;
		int multi;
		System.out.println("Multiplication table by "+table);
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a limit of the table : ");
        int a=sc.nextInt();
		do
		{
			multi=count*table;
			System.out.println("The multiplication of "+count+" * "+table+" is equal to "+multi);
			count++;
		}
		while(count<=a);
	}
}