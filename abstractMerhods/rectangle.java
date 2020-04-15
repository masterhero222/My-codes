package abstractMerhods;

public class rectangle implements figure {

	private int lenght;
	private int width;
	private int area;
	
	public rectangle(int lenght, int width) {
		super();
		this.lenght = lenght;
		this.width = width;
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		int area;
		System.out.println("The area is: " + (area = (lenght * width)));
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
		
		int lenght = 0;
		int width = 0;
		
		lenght = getLenght();
		width = getWidth();
		

		for (int i = 0; i < lenght; i++) {
			System.out.println();
			for (int j = 0; j < width; j++) {
				// Print * if this is first
				// row or last row. Or this
				// column is first or last.
				if (i == 0 || i == lenght - 1 || j == 0 || j == width - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		}
	}
	
	//Its important to understand how those get and set method works

	public int getArea() {
		return area;
	}
	
	public void setArea(int area) {
		this.area = area;
	}


	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "rectangle [lenght=" + lenght + ", width=" + width + "]";
	}

}
