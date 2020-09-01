package com.ashsoft.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("petrol")
//@Primary
public class PetrolEngine implements Engine {

	@Override
	public int startEngine() {
		System.out.println("Petrol Engine Started");
		return 0;
	}

}
