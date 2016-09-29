class Time {
	int hour, minute;
	double second;

	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0.0;
	}

	public Time(int hour, int minute, double second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public static boolean isAfter(Time time1, Time time2) {
		if (time1.hour > time2.hour) return true;
		if (time1.hour < time2.hour) return false;

		if (time1.minute > time2.minute) return true;
		if (time1.minute < time2.minute) return false;

		if(time1.second > time2.second) return true;
		return false;
	}

	public static void printTime(Time t) {
		System.out.println(t.hour + ":" + t.minute + ":" + (int) t.second);
	}

	public static Time addTime(Time t1, Time t2) {
		Time sum = new Time();
		sum.hour = t1.hour + t2.hour;
		sum.minute = t1.minute + t2.minute;
		sum.second = t1.second + t2.second;
		return sum;
	}

	public static void addTimeFill(Time t1, Time t2, Time sum) {
		sum.hour = t1.hour + t2.hour;
		sum.minute = t1.minute + t2.minute;
		sum.second = t1.second + t2.second;

		if (sum.second >=60.0) {
			sum.second -=60.0;
			sum.minute += 1;
		}

		if (sum.minute >=60) {
			sum.second -=60;
			sum.hour += 1;
		} 
	}

	public static double convertToSeconds(Time t) { // method to convert times to doubles
		int minutes = t.hour *60 + t.minute;
		double seconds = minutes * 60 + t.second;
		return seconds;
	}

	// convert from a double to a Time object.  Write as a third constructor

	public Time(double secs) {
		this.hour =(int)(secs / 3600.0);
		secs -= this.hour * 3600.0;
		this.minute = (int)(secs / 60.0);
		secs -= this.minute * 60;
		this.second = secs;	
	}


	public static void main(String[] args) {
		Time currentTime = new Time(9, 14, 30.0);
		Time breadTime   = new Time(3, 35, 0.0);
		Time doneTime    = addTime(currentTime, breadTime);
		printTime(doneTime);
	}
}