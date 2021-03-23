package string;

import java.util.EnumSet;

public enum Day{
	Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;

}
public class Days{
	public static void main(String[]args) {
		EnumSet<Day> set= EnumSet.allOf(Day.class);
		System.out.println(set);
	}
}

