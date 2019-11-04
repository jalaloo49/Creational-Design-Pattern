package prototypepattern;
abstract class Color implements Cloneable {
	
	abstract void draw();
	
	private String name;
	
	private String color;
	
	
	public void SetName(String name) {
		this.name=name;
	}
	public void SetColor(String color) {
		this.color=color;
	}
	
	public Object clone() 
    { 
        Object clone = null; 
        try 
        { 
            clone = super.clone(); 
        }  
        catch (CloneNotSupportedException e)  
        { 
            e.printStackTrace(); 
        } 
        return clone; 
    } 
	
}

