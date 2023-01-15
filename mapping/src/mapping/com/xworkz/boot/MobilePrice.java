package mapping.com.xworkz.boot;

import java.util.Map;
import java.util.TreeMap;

public class MobilePrice {

	public static void main(String[] args) {
		Map<String, Double> mobilePrice = new TreeMap<String, Double>((key, value) -> value.compareTo(key));
		mobilePrice.put("Redmi", 150000D);
		mobilePrice.put("SamSung", 25000D);
		mobilePrice.put("Iphone", 350000D);
		mobilePrice.put("BlackBerry", 55000D);
		mobilePrice.put("Nokia", 15500D);
		mobilePrice.put("Oneplus", 55000D);
		mobilePrice.put("Pixel", 45000D);
		mobilePrice.put("moto", 30000D);
		mobilePrice.put("Vivo", 19000D);
		mobilePrice.put("Oppo", 25000D);
		mobilePrice.put("POCO", 32000D);

		System.out.println("Printing all key values in capital letters");
		mobilePrice.forEach((k, v) -> System.out.println("Mobile :" + k.toUpperCase() + " Price :" + v));
		System.out.println("____________________________________________________________");
		System.out.println(System.lineSeparator());
		System.out.println("Printing all entries if price is greater than 50000");
		mobilePrice.forEach((k, v) -> {
			if (v > 50000d) {
				System.out.println("Mobile :" + k + " Price :" + v);
			}
		});

		System.out.println(System.lineSeparator());
		System.out.println("Printing all entries k is less than 5 characters");
		mobilePrice.forEach((k, v) -> {
			if (k.length() < 5) {
				System.out.println("Mobile :" + k + " Price :" + v);
			}
		});
		System.out.println(System.lineSeparator());

		System.out.println("Printing all entries in descending order");
		mobilePrice.forEach((k, v) -> System.out.println("Mobile :" + k + " Price :" + v));
	}

}
