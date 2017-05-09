package org.foobarspam.furnaceDIP.hardware;

import org.foobarspam.furnaceDIP.interfaces.Thermometer;
import org.foobarspam.furnaceDIP.types.RoomTemperature;

import com.google.inject.Singleton;

@Singleton
public class RemoteCommandSensor implements Thermometer {
	
	public double read(RoomTemperature temperature){
		return temperature.getTemperature();
	}

}
