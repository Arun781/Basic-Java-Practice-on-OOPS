package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DamsRunner {

	public static void main(String[] args) {
		Collection<String> damsInKarntaka = new ArrayList();
		damsInKarntaka.add("Krishna Raja Sagara");
		damsInKarntaka.add("Tungabhadra Dam");
		damsInKarntaka.add("Bhadra Dam");
		damsInKarntaka.add("Linganamakki dam");
		damsInKarntaka.add("Malaprabha dam");
		damsInKarntaka.add("Raja Lakhamagouda dam");
		damsInKarntaka.add("Hemavathy Dam");
		damsInKarntaka.add("Kali river");
		damsInKarntaka.add("Lakya Dam");
		//damsInKarntaka.add("GADAG");  ex for to check palindrome
		damsInKarntaka.add("Almatti Dam");
		System.out.println("The Num of Dam in Karnataka:-" + damsInKarntaka.size() + "_" + damsInKarntaka);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");
		Collection<String> damsInRajasthan = new ArrayList();
		damsInRajasthan.add("RanapratapSagar Dam");
		damsInRajasthan.add("Mahi Bajaj Sagar Dam");
		damsInRajasthan.add("Bisalpur Dam ");
		damsInRajasthan.add("Abhaypura Dam");
		damsInRajasthan.add("Aklera Sagar Dam");
		damsInRajasthan.add("Alnia ");
		damsInRajasthan.add("Amli Kheda");
		damsInRajasthan.add("Angore ");
		damsInRajasthan.add("Anwasa ");
		damsInRajasthan.add("Basundni ");
		damsInRajasthan.add("Barkheri ");
		damsInRajasthan.add("Bari Mansarowar Dam");
		System.out.println("The Num of Dam in Rajasatan:-" + damsInRajasthan.size() + "_" + damsInRajasthan);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");
		Collection<String> damsInAndhraPradesh = new ArrayList();
		damsInAndhraPradesh.add("Srisailam Dam");
		damsInAndhraPradesh.add("Somasila Dam");
		damsInAndhraPradesh.add("Prakasam Barrage");
		damsInAndhraPradesh.add("Tatipudi Reservoir");
		damsInAndhraPradesh.add("Gandipalem Reservoir");
		damsInAndhraPradesh.add("Ramagundam dam");
		damsInAndhraPradesh.add("Dummaguden Dam");
		System.out
				.println("The Num of Dam in AndhraPradesh:-" + damsInAndhraPradesh.size() + "_" + damsInAndhraPradesh);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInTelangana = new ArrayList();
		damsInTelangana.add("Nagarjuna Sagar Dam");
		damsInTelangana.add("Sri Ram Sagar");
		damsInTelangana.add("Nizam Sagar Dam");
		damsInTelangana.add("Dindi Reservoir");
		damsInTelangana.add("Lower Manair Dam");
		damsInTelangana.add("Singur Dam");
		System.out.println("The Num of Dam in Telangana:-" + damsInTelangana.size() + "_" + damsInTelangana);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInArunachalPradesh = new ArrayList();
		damsInArunachalPradesh.add("Ranganadi Dam");
		damsInArunachalPradesh.add("Dibang");
		damsInArunachalPradesh.add("Subansiri Lower HE (Nhpc) Dam");
		damsInArunachalPradesh.add("Ranganadi Dam");

		System.out.println(
				"The Num of Dam in ArunachalPradesh:-" + damsInArunachalPradesh.size() + "_" + damsInArunachalPradesh);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInBihar = new ArrayList();
		damsInBihar.add("Kohira Dam");
		damsInBihar.add("Nagi Dam");
		System.out.println("The Num of Dam in Bihar:-" + damsInBihar.size() + "_" + damsInBihar);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInChhattisgarh = new ArrayList();
		damsInChhattisgarh.add("HasdeoBango Dam");
		damsInChhattisgarh.add("Adpather ");
		damsInChhattisgarh.add("Agariya Dam	");
		damsInChhattisgarh.add("Ajabnagar Dam	");
		damsInChhattisgarh.add("Amabeda Dam	");
		damsInChhattisgarh.add("Amachuwa Dam	");
		damsInChhattisgarh.add("Amakhokhra Dam");
		damsInChhattisgarh.add("Amakoni Dam	");
		damsInChhattisgarh.add("Amgaon Dam	");
		damsInChhattisgarh.add("Amhar Dam	");
		damsInChhattisgarh.add("Auramimunda Dam");
		damsInChhattisgarh.add("Ayabhandha Dam");
		damsInChhattisgarh.add("Badauli ");
		damsInChhattisgarh.add("Badesathi Dam");
		damsInChhattisgarh.add("Badra Dam");
		damsInChhattisgarh.add("Badrika Ashram Dam");
		damsInChhattisgarh.add("Ballar Dam");
		damsInChhattisgarh.add("Banjaridand Dam");
		damsInChhattisgarh.add("Banki Dam");
		damsInChhattisgarh.add("Barat Sagar Dam");

		System.out.println("The Num of Dam in Chhattisgarh:-" + damsInChhattisgarh.size() + "_" + damsInChhattisgarh);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInGujarat = new ArrayList();
		damsInGujarat.add("SardarSarovar Dam");
		damsInGujarat.add("Ukai Dam");
		damsInGujarat.add("Kadana Dam");
		damsInGujarat.add("Karjan Reservoir");
		System.out.println("The Num of Dam in Gujarat:-" + damsInGujarat.size() + "_" + damsInGujarat);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInHimachalPradesh = new ArrayList();
		damsInHimachalPradesh.add("Bhakra Dam");
		damsInHimachalPradesh.add("The Pong Dam");
		damsInHimachalPradesh.add("The Chamera Dam");
		System.out.println(
				"The Num of Dam in HimachalPradesh :-" + damsInHimachalPradesh.size() + "_" + damsInHimachalPradesh);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInJandK = new ArrayList();
		damsInJandK.add("Salal Dam");
		damsInJandK.add("Baglihar Dam");
		System.out.println("The Num of Dam in Jammu And Kashmir:-" + damsInJandK.size() + "_" + damsInJandK);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInJharkhand = new ArrayList();
		damsInJharkhand.add("The Maithon Dam");
		damsInJharkhand.add("Panchet Dam");
		damsInJharkhand.add("Tenughat Dam ");
		System.out.println("The Num of Dam in Jarkhand:-" + damsInJharkhand.size() + "_" + damsInJharkhand);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInKerala = new ArrayList();
		damsInKerala.add("Kakki Reservoir");
		damsInKerala.add("The Idukki Dam");
		damsInKerala.add("Cheruthoni Dam");
		damsInKerala.add("Kulamavu Dam");
		damsInKerala.add("Idamalayar Dam");
		System.out.println("The Num of Dam in Kerala:-" + damsInKerala.size() + "_" + damsInKerala);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInMadhyaPradesh = new ArrayList();
		damsInMadhyaPradesh.add("Gandhi Sagar Dam");
		damsInMadhyaPradesh.add("Tawa Reservoir");
		damsInMadhyaPradesh.add("Indira Sagar Dam");
		System.out.println("The Num of Dam in MP:-" + damsInMadhyaPradesh.size() + "_" + damsInMadhyaPradesh);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInMaharashtra = new ArrayList();
		damsInMaharashtra.add("Koyna Dam");
		damsInMaharashtra.add("Jayakwadi Dam");
		damsInMaharashtra.add("Isapur Dam");
		damsInMaharashtra.add("Totladoh dam");
		damsInMaharashtra.add("Warna Dam");
		damsInMaharashtra.add("Bhatsa Dam");
		System.out.println("The Num of Dam in MH:-" + damsInMaharashtra.size() + "_" + damsInMaharashtra);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInOdisha = new ArrayList();
		damsInOdisha.add("Hirakud Dam");
		damsInOdisha.add("Rengali Dam");
		damsInOdisha.add("Indravati Dam");
		damsInOdisha.add("The Jalaput Dam");
		damsInOdisha.add("Mandira dam");
		System.out.println("The Num of Dam in Odisha:-" + damsInOdisha.size() + "_" + damsInOdisha);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInPunjab = new ArrayList();
		damsInPunjab.add("The Ranjit Sagar Dam");
		damsInPunjab.add("Chohal Dam");
		damsInPunjab.add("Damsal Dam");
		damsInPunjab.add("Dholbaha Dam");
		damsInPunjab.add("Jainti Dam");
		damsInPunjab.add("Janauri Dam");
		damsInPunjab.add("Maili Dam");
		damsInPunjab.add("Saleran Dam");
		damsInPunjab.add("Shahpur Kandi Dam");

		System.out.println("The Num of Dam in Punjab:-" + damsInPunjab.size() + "_" + damsInPunjab);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInTamilNadu = new ArrayList();
		damsInTamilNadu.add("Mettur Dam");
		damsInTamilNadu.add("Solaiyar Dam");
		damsInTamilNadu.add("Bhavanisagar Dam");
		System.out.println("The Num of Dam in TamilNadu:-" + damsInTamilNadu.size() + "_" + damsInTamilNadu);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInUttarakhand = new ArrayList();
		damsInUttarakhand.add("Ramganga Dam");
		damsInUttarakhand.add("Jamrani Dam");
		damsInUttarakhand.add("The Tehri Dam");
		System.out.println("The Num of Dam in UttarKhand:-" + damsInUttarakhand.size() + "_" + damsInUttarakhand);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInUttarPradesh = new ArrayList();
		damsInUttarPradesh.add("Rihand Dam or GovindBallabh Pant Sagar");
		damsInUttarPradesh.add("Matatila Dam");
		damsInUttarPradesh.add("The Rajghat Dam");
		System.out.println("The Num of Dam in UP:-" + damsInUttarPradesh.size() + "_" + damsInUttarPradesh);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInWestBengal = new ArrayList();
		damsInWestBengal.add("Durgapur Barrage");
		damsInWestBengal.add("Farakka Barrage");
		damsInWestBengal.add("Panchet Dam");
		damsInWestBengal.add("Maithon Dam");
		damsInWestBengal.add("Mukutmanipur Dam");
		damsInWestBengal.add("Teesta Barrage");
		System.out.println("The Num of Dam in West Bengal:-" + damsInWestBengal.size() + "_" + damsInWestBengal);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInGoa = new ArrayList();
		damsInGoa.add("Amthane");
		damsInGoa.add("Anjunem");
		damsInGoa.add("	Moisal");
		damsInGoa.add("Chapoli Dam");
		damsInGoa.add("Salaulim");
		System.out.println("The Num of Dam in Goa:-" + damsInGoa.size() + "_" + damsInGoa);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInManipur = new ArrayList();
		damsInManipur.add("Khuga dam");
		damsInManipur.add("Tipaimukh Dam");
		System.out.println("The Num of Dam in Manipur:-" + damsInManipur.size() + "_" + damsInManipur);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInMizoram = new ArrayList();
		damsInMizoram.add("Serlui B Dam");
		damsInMizoram.add("	Tuirial Dam");
		System.out.println("The Num of Dam in Mizoram:-" + damsInMizoram.size() + "_" + damsInMizoram);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInSikkim = new ArrayList();
		damsInSikkim.add("Rangit Dam");
		System.out.println("The Num of Dam in Sikkim:-" + damsInSikkim.size() + "_" + damsInSikkim);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInTripura = new ArrayList();
		damsInTripura.add("Gumti Hydro Dam");
		System.out.println("The Num of Dam in Tripura:-" + damsInTripura.size() + "_" + damsInTripura);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInDelhi = new ArrayList();
		damsInDelhi.add("Delhi Dam");
		damsInDelhi.add("Hartwick Dam");
		System.out.println("The Num of Dam in Delhi:-" + damsInDelhi.size() + "_" + damsInDelhi);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInNagaLand = new ArrayList();
		damsInNagaLand.add("Doyang Dam");
		System.out.println("The Num of Dam in Nagaland:-" + damsInNagaLand.size() + "_" + damsInNagaLand);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInAssum = new ArrayList();
		damsInAssum.add("Pagladia");
		damsInAssum.add("Khandong");
		damsInAssum.add("Umrong");
		damsInAssum.add("Subansiri Lower Dam");
		damsInAssum.add("Karbi Langpi Dam");
		System.out.println("The Num of Dam in Assum:-" + damsInAssum.size() + "_" + damsInAssum);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInMeghalaya = new ArrayList();
		damsInMeghalaya.add("Khandong Dam");
		damsInMeghalaya.add("Kyrdemkulai (Umiam st-III) Dam");
		damsInMeghalaya.add("Mawphlang Dam");
		damsInMeghalaya.add("Myntdu-Leshka Dam");
		damsInMeghalaya.add("Nongkhyllem Dam");
		damsInMeghalaya.add("Umiam Dam");
		damsInMeghalaya.add("Umtru Dam");
		System.out.println("The Num of Dam in Meghalaya:-" + damsInMeghalaya.size() + "_" + damsInMeghalaya);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Collection<String> damsInIndia = new ArrayList();
		damsInIndia.addAll(damsInMeghalaya);
		damsInIndia.addAll(damsInAssum);
		damsInIndia.addAll(damsInTripura);
		damsInIndia.addAll(damsInNagaLand);
		damsInIndia.addAll(damsInDelhi);
		damsInIndia.addAll(damsInKarntaka);
		damsInIndia.addAll(damsInRajasthan);
		damsInIndia.addAll(damsInAndhraPradesh);
		damsInIndia.addAll(damsInTelangana);
		damsInIndia.addAll(damsInArunachalPradesh);
		damsInIndia.addAll(damsInBihar);
		damsInIndia.addAll(damsInChhattisgarh);
		damsInIndia.addAll(damsInGujarat);
		damsInIndia.addAll(damsInHimachalPradesh);
		damsInIndia.addAll(damsInJandK);
		damsInIndia.addAll(damsInJharkhand);
		damsInIndia.addAll(damsInKerala);
		damsInIndia.addAll(damsInMadhyaPradesh);
		damsInIndia.addAll(damsInMaharashtra);
		damsInIndia.addAll(damsInOdisha);
		damsInIndia.addAll(damsInPunjab);
		damsInIndia.addAll(damsInTamilNadu);
		damsInIndia.addAll(damsInUttarakhand);
		damsInIndia.addAll(damsInUttarPradesh);
		damsInIndia.addAll(damsInWestBengal);
		damsInIndia.addAll(damsInGoa);
		damsInIndia.addAll(damsInManipur);
		damsInIndia.addAll(damsInMizoram);
		damsInIndia.addAll(damsInSikkim);
		System.out.println("Total num of Dams in India:-" + damsInIndia.size() + damsInIndia);
		System.err.println(
				"______________________________________________________________________________________________________________________________________");

		Iterator<String> dams = damsInIndia.iterator();
		// ============================for starting
		// words====================================
		while (dams.hasNext()) {
			String ref = dams.next();
			if (ref.startsWith("T")) {
				System.out.println("============Start With========================");
				System.out.println("The Dam names with start with T:-" + ref);
			}
		}
		// ============================for ending
		// words====================================
		Iterator<String> endDams = damsInIndia.iterator();
		while (endDams.hasNext()) {
			String ref1 = endDams.next();
			if (ref1.endsWith("am")) {
				System.err.println("_____________________________________________________________");
				System.out.println("============EndsWith===============");
				System.out.println("The Dam names ends with a:-" + ref1);

			}
		}
		// ==================================length is over 15
		// Char================================
		System.err.println("_____________________________________________________________");
		System.out.println("==========================the Dam Length Sxceed 15 Char============================");
		Iterator<String> lengthOvers = damsInIndia.iterator();
		while (lengthOvers.hasNext()) {
			String over = lengthOvers.next();
			if (over != null && over.length() >= 15) {
				System.out.println("The dams length is greter 15 char:-" + over);
			}
		}
		// ==================================Print all the Dams
		// UpperCase================================
		System.err.println("_____________________________________________________________");
		System.out.println("==========================Print all the Dams Upper Case============================");
		Iterator<String> upperCase = damsInIndia.iterator();
		while (upperCase.hasNext()) {
			String cas = upperCase.next();
			{
				System.out.println("Converting all Dam Names to uppercase:-" + cas.toUpperCase());
			}
		}
		// ==================================Print all the Dams
		// toLowerCase================================
		System.err.println("_____________________________________________________________________________________");
		System.out.println("==========================Print all the Dams toLowerCase ============================");
		Iterator<String> lowerCase = damsInIndia.iterator();
		while (lowerCase.hasNext()) {
			String lcas = lowerCase.next();
			{
				System.out.println("Converting all Dam Names to toLowerCase:-" + lcas.toLowerCase());
			}
		}
		// =====================remove all the Dam If it containd
		// P===============================================
		System.err.println("_______________________________________________________________________________________");
		System.out.println("==============================remove all the Dam If it containd P========================");
		Iterator<String> remove = damsInIndia.iterator();
		while (remove.hasNext()) {
			String dlt = remove.next();
			if (dlt.contains("P")) {
				System.out.println("removing all the Dam if it containd P:-" + dlt);
				remove.remove();
			}

		}
		System.err.println("_____________________________________________________________________________________");
		System.out.println("==========================Check if any Dam is Palindrome ============================");
		Iterator<String> palindromes = damsInIndia.iterator();
		while (palindromes.hasNext()) {
			String drome = palindromes.next();
			StringBuffer buffer = new StringBuffer(drome);
			buffer.reverse();
			String reverse = buffer.toString();
			if (drome.equalsIgnoreCase(reverse)) {
				System.err.println("Palindrome " + reverse);
			}
			else {
				System.out.println("No palindromes are present in indian dams");
			}

		}
	}
}
