import java.util.Scanner;
public class Homework15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int month = 0;
		
		while(true) {
			System.out.println("������͂��Ă�������");
			month = Integer.parseInt(scanner.next());
			if ( month >= 1 && month <= 12)
				break;
			System.out.println("�G���[�ł��B1�`12�̔��p��������͂��Ă�������");
		}
		
		switch (month) {
		    case 1:
		    case 3:
		    case 5:
		    case 7:
		    case 8:
		    case 10:
		    case 12:
		    	System.out.println("31��");
		    	break;
		    case 2:
		    	System.out.println("29��");
		    	break;
		    case 4:
		    case 6:
		    case 9:
		    case 11:
		    	System.out.println("30��");
		    	break;
		    	
		}

	}

}
