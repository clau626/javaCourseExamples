import java.awt.Color;

public abstract class Figura
{
	private int x; 
	private int y;
	private boolean relleno;
	private Color color;

	/** 
		Inicializa todos los atributos del objeto 
		@param x Posición x de la ventana en pixels
		@param y Posición x de la ventana en pixels
		@param relleno Lo pinta transparente u opaco
		@param color Color de la figura
		
	*/
	public Figura(int x, int y, boolean relleno, Color color)
	{
		this.setX(x);
		this.setY(y);
		this.relleno = relleno;
		this.color = color;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public void setX(int x)
	{
		if(x>0 && x<800)
			this.x = x;
	}

	public void setY(int y)
	{
		if(y>0 && y<600)
			this.y = y;
	}


	public void setRelleno(boolean relleno)
	{
		this.relleno = relleno;
	}

	public boolean getRelleno()
	{
		return relleno;
	}

	public void setColor(Color color)
	{
		this.color = color;
	}

	public Color getColor()
	{
		return color;
	}	

	public void pintar(java.awt.Graphics g)
	{
		g.setColor(color);
	}
}