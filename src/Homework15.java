import java.util.Scanner;
public class Homework15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int month = 0;
		
		while(true) {
			System.out.println("月を入力してください");
			month = Integer.parseInt(scanner.next());
			if ( month >= 1 && month <= 12)
				break;
			System.out.println("エラーです。1〜12の半角数字を入力してください");
		}
		
		switch (month) {
		    case 1:
		    case 3:
		    case 5:
		    case 7:
		    case 8:
		    case 10:
		    case 12:
		    	System.out.println("31日");
		    	break;
		    case 2:
		    	System.out.println("29日");
		    	break;
		    case 4:
		    case 6:
		    case 9:
		    case 11:
		    	System.out.println("30日");
		    	break;
		    	
		}

	}

}
