package com.augmentis.roman;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 * 
 */
public class ClockTime {
	String romanNum = "";
	int keepTime;
	int remain;

	public String printRomanNum(int i) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "I");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(9, "IX");
		map.put(10, "X");
		map.put(49, "IL");
		map.put(50, "L");
		
		if (i / 50 > 0) {
			keepTime = i / 50;
			for (int j = 0; j < keepTime; j++) {
				romanNum += map.get(50);
			}
		}
		
		remain = i % 50;
		
		if (remain == 49) {
			romanNum += map.get(49);
			return romanNum;
		}

		if (remain / 10 > 0) {
			keepTime = remain / 10;
			for (int j = 0; j < keepTime; j++) {
				romanNum += map.get(10);
			}
		}

		remain = remain % 10;

		if (remain == 9) {
			romanNum += map.get(9);
			return romanNum;
		}

		if (remain / 5 > 0) {
			keepTime = remain / 5;
			for (int j = 0; j < keepTime; j++) {
				romanNum += map.get(5);
			}
		}

		remain = remain % 5;

		if (remain == 4) {
			romanNum += map.get(4);
			return romanNum;
		}

		if (remain > 0) {
			for (int j = 0; j < remain; j++) {
				romanNum += map.get(1);
			}
		}

		// if (i < 4) {
		// for (int n = 0; n < i; n++) {
		// romanNum += map.get(1);
		// }
		// }
		// if (i >= 5 && i < 9) {
		// i -= 5;
		// romanNum += map.get(5);
		// for (int n = 0; n < i; n++) {
		// romanNum += map.get(1);
		// }
		// }
		// if (i >= 10) {
		// i -= 10;
		// romanNum += map.get(10);
		// for (int n = 0; n < i; n++) {
		// romanNum += map.get(1);
		// }
		// }
		// if (i == 9) {
		// romanNum += map.get(9);
		// }
		// if (i == 4) {
		// romanNum += map.get(4);
		// }

		return romanNum;
	}
}
