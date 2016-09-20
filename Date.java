package lab;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
		this.day = 1;
		this.month = 1;
		this.year = 1000;
	}


	public Date(int x, int y, int z) {
		this.day = z;
		this.month = y;
		this.year = x;
	}

	public void setDate(int x, int y, int z) {
		if (x % 4 == 0 && y != 2) {
			setDay(z);
			setMonth(y);
			setYear(x);
		}
		else if (x % 4 == 0 && y == 2 && (z >= 1 && z <= 29)){
			this.day = z;
			this.month = y;
			this.year = x;
		}
		else if (x % 4 != 0) {
			setDay(z);
			setMonth(y);
			setYear(x);
		}
		else {
			throw new IllegalArgumentException("Invalid day input.");
		}
		
	}

	public String toString() {
		return String.format("%02d/%02d/%02d", day, month, year);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 && (day >= 1 && day <= 31)) {
			this.day = day;
		}
		else if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11 && (day >= 1 && day <= 30)){
			this.day = day;
		}
		else {
			throw new IllegalArgumentException("Invalid day input.");
		}
	}
	

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12) {
			this.month = month;
		}
		else {
			throw new IllegalArgumentException("Invalid month input.");
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year >= 1000 && year <= 9999) {
			this.year = year;
		}
		else {
			throw new IllegalArgumentException("Invalid year input.");
		}
	}
}
