package com.voya.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Performer {
	@Autowired
	@Qualifier("guitar")
 IInstrument instrument;
	
	@Autowired
	@Qualifier("violin")
 IInstrument instrument1;
	
	@Autowired
	@Qualifier("keyboard")
 IInstrument instrument2;

	
   void playMusic(String choice,String song) {
	   if(choice.equals("g"))
		   instrument.play(song);
	   if(choice.equals("v"))
	       instrument1.play(song);
	   if(choice.equals("k"))
		   instrument2.play(song);
   }
	
	

}
