package mapping.com.xworkz.boot;

import java.util.Map;
import java.util.TreeMap;

public class CricketRuns {
public static void main(String[] args) {
	Map<String, Integer> runs = new TreeMap<String, Integer>((run1, run2) -> run2.compareTo(run1));
	runs.put("Virat Kohli", 50000);
	runs.put("Rohit Sharma", 45000);
	runs.put("Sachin Tendulkar", 30000);
	runs.put("K L Rahul", 25000);
	runs.put("M S Dhoni", 9000);
	System.out.println("____________________________________________________________");
	System.out.println("Sorting in descending order");
	runs.forEach((k, v) -> System.out.println("Player :" + k + ":: Runs :" + v));
	System.out.println("____________________________________________________________");
	System.out.println(System.lineSeparator());
	System.out.println("Removing an entry if runs is lesser than 10000");
	System.out.println("____________________________________________________________");
	runs.forEach((key, values) -> {
		if (values < 10000) {
			runs.remove(key, values);
			System.out.println("Player:" + key + ":: Runs :" + values);
		}
	});
}
}
