
public class Assignment3_11 {

	public static void main(String[] args) {
		int num=12321;
		int temp=0;
		int a=num;
		while(num!=0) {
			temp=temp*10;
			temp=temp+(num%10);
			num=num/10;			
		}
		if(a==temp) {
			
			System.out.println("Given number is palindrome " +temp);
		}else {
			System.out.println("Given number is not palindrome "+ temp);
		}		
		System.out.println();
		
	}
	
}
