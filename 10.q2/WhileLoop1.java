import java.util.Scanner;

class WhileLoop1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int count = 0;
        int Num = num; 
        while (num != 0) 
        {
            int lastnum = num % 10; 
			System.out.println("Last Number is "+lastnum);
			System.out.println("Before increment count value is "+count);
            count++;
			System.out.println("digit :"+num);
            num = num / 10; 
			System.out.println("After cutting off last digit "+num);
			System.out.println("After increment count value is "+count);
			System.out.println("_________________________________________");
        }

        System.out.println("The number of digits in " + Num + " is: " + count);
    }
}