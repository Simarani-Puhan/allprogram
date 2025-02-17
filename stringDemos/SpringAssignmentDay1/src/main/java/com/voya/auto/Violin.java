package com.voya.auto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("violin")
public class Violin implements IInstrument{

	@Override
	public void play(String song) {
		System.out.println("Play song by violin :"+song);
	}

}
