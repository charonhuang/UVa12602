import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int BASE = 26;
		
		Scanner sc = new Scanner(System.in);

		int nLines = sc.nextInt();
		
		for(int i = 0; i < nLines; i++)
		{
			String inLine = sc.next();
			
			String AlphaPart = inLine.substring(0, 3);
			String DigitPart = inLine.substring(4, inLine.length());
			
			int alphaSum = 0, digitSum = 0;
			for(int j = 0; j < AlphaPart.length(); j++)
			{
				alphaSum *= BASE;
				alphaSum += (AlphaPart.charAt(j)-'A');
			}
			
			digitSum = Integer.parseInt(DigitPart);
			
			if(alphaSum-digitSum <=100 && alphaSum-digitSum >= -100)
			{
				System.out.println("nice");
			}
			else
			{
				System.out.println("not nice");
			}
		}
		
		sc.close();
	}

}
