import java.util.*;
public class AddingOfNumber {

	public static void main(String[] args) {
		// 1111=4 1243=10;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number :");
			int num=sc.nextInt();
			int sum=0;
			while(num>0) {
				sum=sum+num%10;
				num=num/10;
			}
		
		
		System.out.println("The sum is :"+sum);
		

	}

}
