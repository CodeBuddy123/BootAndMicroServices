package com.ashsoft.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("diesel")
//@Primary
public class DieselEngine implements Engine {

	@Override
	public int startEngine() {
		System.out.println("Diesel Engine Started");
		return 0;
	}

}
