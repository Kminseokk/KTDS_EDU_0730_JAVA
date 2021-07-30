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
			System.out.println("������ ���Ե��� �ʽ��ϴ�.");
			
		}else {
			this.year = year;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		if(month <1 || month > 13) {
			System.out.println("12������ ���Ե��� �ʽ��ϴ�.");
		}else {
			this.month = month;
		}
	}
	
	public int getDay() {
		return day;
	}
	
	// 31�� = 1��,3��,5��,7��,8��,10��,12��
	// 30�� = 4��,6��,9��,11��
	// 28�� = 2��
	
	public void setDay(int day) {
		// 31�ϱ��� #########################
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day <1 || day > 31) {
				System.out.println("�ش� ������ ���� ���Դϴ�");
			} else {
				this.day = day;
			}		
		}
		// 30�ϱ��� #########################
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			if (day <1 || day > 30) {
				System.out.println("�ش� ������ ���� ���Դϴ�");
			} else {
				this.day = day;
			}		
		}
		// 28�ϱ��� #########################
		if(month == 2) {
			if (day <1 || day > 28) {
				System.out.println("�ش� ������ ���� ���Դϴ�");
			} else {
				this.day = day;
			}		
		}
		
	} // setDay ���� #############################

}
