package java07_4week;
import java.util.Scanner;
public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Mydate21 date = new Mydate21();
		
		int userinput;
		
		userinput = sc.nextInt();		
		date.setYear(userinput);
		
		userinput = sc.nextInt();
		date.setMonth(userinput);
		
		userinput = sc.nextInt();
		date.setDay(userinput);
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDay());
	}

}
