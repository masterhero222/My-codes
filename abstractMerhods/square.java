package abstractMerhods;

public class square implements figure {
	
	
	private int width;
	private int area;
	

	public square(int width) {
		super();
		
		this.width = width;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		int area;
		
		System.out.println("The area of the square is: " + (area = 2 * width));
		//We need to set the CLASS area to the method area
		setArea(area); 
		
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		// This code is from GeeksForGeeks
		
		int side, i, j;
		//we area using the settet Class area from our method area()
		side = area;
		System.out.println("\n");
		for(i = 1; i <= side; i++)
		{
			for(j = 1; j <= side; j++)
			{
				System.out.print("*"); 
			}
			System.out.print("\n"); 
		}	
	}
	

	

	public int getWidth() {
		return width;
	}
	
	public int getArea() {
		return this.area;
	}
	
	public void setArea(int area) {
		this.area = area;
	}
	
	
	
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "square [width=" + width + "]";
	}

	
	
	

}
