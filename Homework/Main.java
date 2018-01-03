package test1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		   int i=sr.nextInt();
		   int j=sr.nextInt();
		   int k=sr.nextInt();
		    BeijingTime bei=new BeijingTime(i,j,k);
		    bei.showTime();;
		}

	}
	class BeijingTime
	{
	      private int hour;
	      private int minute;
	      private int second;
		public BeijingTime(int hour, int minute, int second) {
			super();
			this.hour = hour;
			this.minute = minute;
			this.second = second;
			if(hour>24)this.hour=0;
			if(minute>60||minute<0)this.minute=0;
			if(second>60||second<0)this.second=0;
		}
		public int getHour() {
			return hour;
		}
		public void setHour(int hour) {
			this.hour = hour;
		}
		public int getMinute() {
			return minute;
		}
		public void setMinute(int minute) {
			this.minute = minute;
		}
		public int getSecond() {
			return second;
		}
		public void setSecond(int second) {
			this.second = second;
		}
		public void showTime() {
			System.out.println("now BeijingTime is "+hour+":"+minute+":"+second);
		}
	     
	}

