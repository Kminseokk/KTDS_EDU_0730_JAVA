package java07_4week;
import java.util.Scanner;
public class MyDateTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Mydate21 date = new Mydate21();
		
		int userinput;
		String KeepOrExit = "go";
		
		for( ;; ) {
			
			if (KeepOrExit.equalsIgnoreCase("go")) { //�̰� ���ϸ� System.out.println("�Է��� �߸��߾�� : " +KeepOrExit ); �� �����
				System.out.println("��� �Ͻ÷��� \"keep\"�� �ߴ��Ͻ÷��� \"quit\"�� �Է����ּ���.");
				KeepOrExit = sc.nextLine();
				//System.out.println(KeepOrExit); //KeepOrExit�� ������ �Ǵ��� Ȯ���ϴ� �뵵
			}
			
			else if (KeepOrExit.equalsIgnoreCase("quit")) {
				break;
			}
			else if (KeepOrExit.equalsIgnoreCase("keep")) {
				System.out.println("������ �Է��ϼ���.");
				userinput = sc.nextInt();	
				
				date.setYear(userinput);
//				if (date.getYear() == 0) {
//					System.out.println(date.getYear());
//					
//					KeepOrExit = "";
//				}
//				
				
				System.out.println("���� �Է��ϼ���.");
				userinput = sc.nextInt();
				date.setMonth(userinput);
				
				System.out.println("���� �Է��ϼ���.");
				userinput = sc.nextInt();
				date.setDay(userinput);
				
				System.out.println(date.getYear()+" �� "+date.getMonth()+" �� "+date.getDay()+" �� �Է��ϼ̽��ϴ�.");
				//System.out.println(date.getMonth());
				//System.out.println(date.getDay());
				KeepOrExit = "go";
				
			}	
			else if (!KeepOrExit.equalsIgnoreCase("keep")&&!(KeepOrExit.equalsIgnoreCase("quit")
					&&!(KeepOrExit.equalsIgnoreCase("go")))) {
				System.out.println("�Է��� �߸��߾�� : " +KeepOrExit );
				KeepOrExit = "go";
			}
		
				
		}
		
		
	}

}