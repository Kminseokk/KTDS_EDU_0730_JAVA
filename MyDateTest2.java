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
			
			if (KeepOrExit.equalsIgnoreCase("go")) { //이걸 안하면 System.out.println("입력을 잘못했어요 : " +KeepOrExit ); 가 실행됨
				System.out.println("계속 하시려면 \"keep\"을 중단하시려면 \"quit\"를 입력해주세요.");
				KeepOrExit = sc.nextLine();
				//System.out.println(KeepOrExit); //KeepOrExit에 저장이 되는지 확인하는 용도
			}
			
			else if (KeepOrExit.equalsIgnoreCase("quit")) {
				break;
			}
			else if (KeepOrExit.equalsIgnoreCase("keep")) {
				System.out.println("연도를 입력하세요.");
				userinput = sc.nextInt();	
				
				date.setYear(userinput);
//				if (date.getYear() == 0) {
//					System.out.println(date.getYear());
//					
//					KeepOrExit = "";
//				}
//				
				
				System.out.println("월을 입력하세요.");
				userinput = sc.nextInt();
				date.setMonth(userinput);
				
				System.out.println("일을 입력하세요.");
				userinput = sc.nextInt();
				date.setDay(userinput);
				
				System.out.println(date.getYear()+" 년 "+date.getMonth()+" 월 "+date.getDay()+" 을 입력하셨습니다.");
				//System.out.println(date.getMonth());
				//System.out.println(date.getDay());
				KeepOrExit = "go";
				
			}	
			else if (!KeepOrExit.equalsIgnoreCase("keep")&&!(KeepOrExit.equalsIgnoreCase("quit")
					&&!(KeepOrExit.equalsIgnoreCase("go")))) {
				System.out.println("입력을 잘못했어요 : " +KeepOrExit );
				KeepOrExit = "go";
			}
		
				
		}
		
		
	}

}