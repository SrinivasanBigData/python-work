package com.srini.basic.AmazingJava;

import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;

public class ConvertArrayToMap {
	public static void main(String[] args) {
		String[][] countries = { { "United States", "New York" },
				{ "United Kingdom", "London" }, { "Netherland", "Amsterdam" },
				{ "Japan", "Tokyo" }, { "France", "Paris" } };
		Map<?, ?> map = ArrayUtils.toMap(countries);
		System.out.println("Capital of Japan is " + map.get("Japan"));

	}

}
