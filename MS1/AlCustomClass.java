package MS1;

import java.util.ArrayList;

class Data {
	int roll;
	String name;
	int marks;
	long phone;
	Data(int roll, String name, int marks, long phone)
	{
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.phone = phone;
	}
}
public class AlCustomClass {
	int n = 4;
	public void addValues(int roll[], String name[],
						int marks[], long phone[])
	{
		ArrayList<Data> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Data d1=new Data(roll[i],name[i],marks[i],phone[i]);
			list.add(d1);
			/*list.add(new Data(roll[i], name[i], marks[i],
							phone[i]));*/
		}
		printValues(list);
	}
	public void printValues(ArrayList<Data> list)
	{
		for (int i = 0; i < n; i++) {
			Data data = list.get(i);
			System.out.println(data.roll + " " + data.name
							+ " " + data.marks + " "
							+ data.phone);
		}
	}
	public static void main(String args[])
	{
		int roll[] = { 1, 2, 3, 4 };
		String name[]
			= { "Shubham", "Atul", "Ayush", "Rupesh" };
		int marks[] = { 100, 99, 93, 94 };
		long phone[] = { 8762357381L, 8762357382L,
						8762357383L, 8762357384L };
		AlCustomClass custom = new AlCustomClass();
		custom.addValues(roll, name, marks, phone);
	}
}
