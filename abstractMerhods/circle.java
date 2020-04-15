package abstractMerhods;

public class circle implements figure {
	
	private int radius;
	
	
	

	public circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		double area;
		System.out.println("The area of the circle is: " + (area = Math.PI * (2 * radius)));
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		// dist represents distance to the center 
		// This code is from GeeksForGeeks
		
	    double dist; 
	  
	    // for horizontal movement 
	    System.out.println("\n");
	    for (int i = 0; i <= 2 * radius; i++) { 
	  
	    // for vertical movement 
	    for (int j = 0; j <= 2 * radius; j++) { 
	        dist = Math.sqrt((i - radius) * (i - radius) + 
	                         (j - radius) * (j - radius)); 
	  
	        // dist should be in the range (radius - 0.5) 
	        // and (radius + 0.5) to print stars(*) 
	        if (dist > radius - 0.5 && dist < radius + 0.5) 
	        System.out.print("*"); 
	        else
	        System.out.print(" "); 
	    } 
	  
	    System.out.print("\n"); 
	    } 
	}
	

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "circle [radius=" + radius + "]";
	}
	
	

}
