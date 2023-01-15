package mapping.com.xworkz.boot;

import java.util.Map;
import java.util.TreeMap;

public class PresidentCountryAndNames {
public static void main(String[] args) {
	Map<String, String> map = new TreeMap<String, String>();
	map.put("Sheikh Khalifa bin Zayed Al Nahyan", "United Arab Emirates");
	map.put("Gotabaya Rajapaksa", "Sri Lanka");
	map.put("Halimah Yacob", "Singapore"); 
	map.put("Ibrahim Mohamed Solih", "Maldives");
	map.put("Volodymyr Zelensky", "Ukraine");
	map.put("King Charles III", "United Kingdom");
	map.put("Recep Tayyip Erdogan", "Turkey");
	map.put("Mohammad Hassan Akhund", "Afghanistan");
	map.put("Maha Vajiralongkorn", "Thailand");
	map.put("Naruhito", "Japan");
	map.put("Abdul Hamid", "Bangladesh");
	map.put("Bidhya Devi Bhandari", "Nepal");
	map.put("Marcelo Rebelo de Sousa", "Portugal");
	map.put("Joe Biden", "United States");
	map.put("Droupadi Murmu", "India");
	map.put("Kassym jomart kemeluly tokayev", "Kazakhstan");
	map.put("Salman", "Saudi Arabia");
	map.put("Xi Jinping", "China");
	map.put("Khaltmaagiin Battulga", "Mongolia");
	map.put("Joko Widodo", "Indonesia");
	System.out.println("____________________________________________________________");
	System.out.println("=========Sorting the map ascending order=========");   
	map.forEach((k, v) -> System.out.println("President :" + k + ":: Country :" + v));

	System.out.println(System.lineSeparator());
	System.out.println("Updating president name if country length is greater than ");
	System.out.println("___________________________________________________________");
	map.forEach((key, values) -> {
		System.out.println("President :" + key + ":: Country :" + values);
		if (key.length() > 20) {
			map.replace("Sheikh Khalifa bin Zayed Al Nahyan", "Pakistan");
		}
	});
}
}
