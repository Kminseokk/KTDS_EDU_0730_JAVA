package java07_4week;

public class Mydate21 {

	private int year;
	private int month;
	private int day;
	
	public void Mydate2(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public int getYear() {
		return year;
	}

	
	public void setYear(int year) {
		if(year <1 || year >10000) {
			System.out.println("연도에 포함되지 않습니다.");
			
		}else {
			this.year = year;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		if(month <1 || month > 13) {
			System.out.println("12개월에 포함되지 않습니다.");
		}else {
			this.month = month;
		}
	}
	
	public int getDay() {
		return day;
	}
	
	// 31일 = 1월,3월,5월,7월,8월,10월,12월
	// 30일 = 4월,6월,9월,11월
	// 28일 = 2월
	
	public void setDay(int day) {
		// 31일까지 #########################
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day <1 || day > 31) {
				System.out.println("해당 월에는 없는 일입니다");
			} else {
				this.day = day;
			}		
		}
		// 30일까지 #########################
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			if (day <1 || day > 30) {
				System.out.println("해당 월에는 없는 일입니다");
			} else {
				this.day = day;
			}		
		}
		// 28일까지 #########################
		if(month == 2) {
			if (day <1 || day > 28) {
				System.out.println("해당 월에는 없는 일입니다");
			} else {
				this.day = day;
			}		
		}
		
	} // setDay 종료 #############################

}
