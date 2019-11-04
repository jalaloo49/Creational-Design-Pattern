package prototypepattern;

import java.util.HashMap;

public class ShapeFactory {
	
	
	
	
	public static final HashMap hs=new HashMap();

	
	
	static void Cache() {
		
	hs.put("Circle",new  Circle() );
	
	hs.put("Rectangle",new  Rectangle() );
		
	}
	
	
	public static Color getShape(String color) {
		
		
		
		return (Color).get(color).clone();
	}
}
