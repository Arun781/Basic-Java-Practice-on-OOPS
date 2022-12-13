package com.xworkz.crud.repository;

import com.xworkz.crud.dto.War;

public interface WarRepositary{
	boolean creating(War war) throws ArrayisfullnowDontAddMore;

	default int total() {
		return 0;

	}

	default War tempwar(String tempWarName) {
		return null;

	}
}
