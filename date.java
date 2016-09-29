class date {
	public static void main(String[] args) {
		String month;
		String day;
		int date;
		int year;

		month = "September";
		day   = "Wednesday";
		date  = 7;
		year  = 2016;

		System.out.println("American format:");
		System.out.println(day + ", " + month + " " + date + ", " + year);
		System.out.println("European format:");
		System.out.println(day + " " + date + " " + month + ", " + year);
	}
}