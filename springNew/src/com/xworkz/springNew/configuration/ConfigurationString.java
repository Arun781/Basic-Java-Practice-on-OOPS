package com.xworkz.springNew.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springNew")
public class ConfigurationString {
	
	public ConfigurationString() {
		System.out.println("Regestering ConfigurationString");
	}

	@Bean("id")
	public String id() {
		System.out.println("Regestering Id");
		return "123XYZ123";
	}

	@Bean("lang")
	public String lang() {
		System.out.println("Regestering lang");
		return "Kannada";
	}

	@Bean
	public String name() {
		return "VijayaVani";
	}

	@Bean
	public String ownerName() {
		return "VijayaSankeswar";
	}

	@Bean
	public Double price() {
		return 5D;
	}
	
	@Bean
	public String nameOfSanke() {
		return "KingKobra";
	}
	@Bean
	public String colur() {
		return "Black";
	}
	@Bean
	public float length() {
		return 5.5f;
	}
	@Bean
	public String type() {
		return "venum";
	}
	@Bean
	public boolean poisionous() {
		return true;
	}
	@Bean
	public String nameOfEngine() {
		return "CarEngine";
	}
	@Bean
	public String typeOfEngine() {
		return "Petrol Engine";
	}
	@Bean
	public String companyName() {
		return "Tata";
	}
	@Bean
	public String strokes() {
		return"4Stroke";
	}
	@Bean
	public float version() {
		return 2.2f;
	}
	@Bean
	public Double number() {
		return 3525D;
	}
	@Bean("nameGhost")
	public String nameGhost() {
		return "Nayaaanaaa";
	}
	@Bean("friendName")
	public String friendName() {
		return "Nishetha";
	}
	@Bean("freindCrush")
	public String freindCrush() {
		return "ChiShow";
	}
	@Bean("brotherName")
	public String brotherName() {
		return "Hithesh";
	}
	@Bean("sisterName")
	public String sisterName() {
		return "nayanaaaaaa2.0";
	}
	@Bean("villageName")
	public String villageName() {
		return "Honnali";
	}
	@Bean("talukName")
	public String talukName() {
		return "Honnali";
	}
	@Bean("distName")
	public String distName() {
		return "Davangeri";
	}
	@Bean("stateName")
	public String stateName() {
		return "Karanataka";
	}
	@Bean("countryName")
	public String countryName() {
		return "India";
	}
	@Bean("wifeName")
	public String wifeName() {
		return "Sppooo";
	}
	@Bean("exBfName")
	public String exBfName() {
		return "SatyaHariChandra";
	}
	@Bean("num")
	public long num() {
		return 96525454l;
	}
	@Bean("height")
	public float height() {
		return 5.5f;
	}
	@Bean("weight")
	public float weight() {
		return 50.5f;
	}
	@Bean("alive")
	public boolean alive() {
		return true;
	}
	@Bean("leg")
	public boolean leg() {
		return true;
	}
	@Bean("hand")
	public boolean hand() {
		return true;
	}
	@Bean("head")
	public boolean head() {
		return true;
	}
	@Bean("eyes")
	public boolean eyes() {
		return true;
	}
	@Bean("hairs")
	public boolean hairs() {
		return true;
	}
}
