import java.util.Scanner;

public class Armstrong {

	/**
	 * This class is written to find a number is Armstrong or not
	 * @param args
	 */
	public static void main(String[] args) {
		int num;
		int tempNo;
		int rem;
		int sum=0;

		System.out.println("Enter a no");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		tempNo=num;
		while(tempNo!=0){
			rem=tempNo%10;
			tempNo=tempNo/10;
			sum=sum + (rem*rem*rem);


		}
		if(sum==num){
			System.out.println("The number is a Armstrong number");
		}

		else{
			System.out.println("The number is not a Armstrong number");
		}
	}

}
