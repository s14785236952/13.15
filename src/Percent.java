//u10116024 ���t�w
import javax.swing.* ;
import javax.swing.JFrame ;
import javax.swing.JPanel ;
import java.awt.* ;
import java.awt.Graphics ;

public class Percent extends JFrame
{//define the string to represent the pie chart
	private String m1 = "Projects -- 20%" ;
	private String m2 = "Quizzes -- 10%" ;
	private String m3 = "Midterms -- 30%" ;
	private String m4 = "Final -- 40%" ;
	
	//constructor
	public Percent()
	{
		setTitle("13_15") ;
		add(new ArcsPanel()) ;
	}
	
	public static void main(String[] args)
	{
		Percent P = new Percent() ;
		P.setSize(500, 500) ;
		P.setLocationRelativeTo(null) ;
		P.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		P.setVisible(true) ;
	}
	
}

class ArcsPanel extends JPanel
{
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g) ;
		
		int xCenter = getWidth() / 2 ;
		int yCenter = getWidth() / 2 ;
		int radius = (int)(Math.min(getWidth() , getHeight()) * 0.4) ;
		
		int x = xCenter - radius ;
		int y = yCenter - radius ;
		
		//set project's color to red
		g.setColor(Color.RED) ;
		g.fillArc(x, y, 2*radius , 2*radius ,0 , 72) ;
		//set the word black
		g.setColor(Color.BLACK) ;
		g.drawString("Projects -- 20%" , xCenter + 150, yCenter - radius + 75) ;
		//set Quizzes's color to blue
		g.setColor(Color.BLUE) ;
		g.fillArc(x, y, 2*radius , 2*radius ,72 , 36) ;
		//set the word black
		g.setColor(Color.BLACK) ;
		g.drawString("Quizzes -- 10%" , xCenter , yCenter - radius ) ;
		//set Midterms's color to green
		g.setColor(Color.GREEN) ;
		g.fillArc(x, y, 2*radius , 2*radius ,108 , 108) ;
		//set the word black
		g.setColor(Color.BLACK) ;
		g.drawString("Midterms -- 30%" , xCenter - 200 , yCenter - radius + 100) ;
		//set Final's color to orange
		g.setColor(Color.ORANGE) ;
		g.fillArc(x, y, 2*radius , 2*radius ,216 , 144) ;
		//set the word black
		g.setColor(Color.BLACK) ;
		g.drawString("Final -- 40%" , xCenter + 50 , yCenter - radius + 350) ;
		
	}
}