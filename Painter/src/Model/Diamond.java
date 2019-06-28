package Model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Diamond extends Shape{
	int[] xPoints = new int[4];
	int[] yPoints = new int[4];

    public Diamond(Color currentColor,int thick) {
        super(currentColor,thick);
        		
    }
    
	public void draw(Graphics g) {
		setPoint();
		
		Graphics2D g2 = (Graphics2D)g;
		AffineTransform transform = g2.getTransform();
		
		if(this.isRotated()) {
			g2.rotate(angle,(startP.x+endP.x)/2, (startP.y+endP.y)/2);	//rotate
		}
		
		if(this.isFill()) {
			g.setColor(fillColor);
			g.fillPolygon(xPoints, yPoints, xPoints.length);
		}
		
		if(endP!=null) {
			xPoints[0] = (startP.x + endP.x) / 2; 
			xPoints[1] = startP.x; 
			xPoints[2] = (startP.x + endP.x) / 2;
			xPoints[3] = endP.x;
			
	        yPoints[0] = startP.y; 
	        yPoints[1] = (startP.y + endP.y) / 2; 
	        yPoints[2] = endP.y;
	        yPoints[3] = (startP.y + endP.y) / 2;
			
			g2.setStroke(new BasicStroke(thick));
			g.setColor(strokeColor);
			g.drawPolygon(xPoints, yPoints, xPoints.length);
		}
		g2.setTransform(transform);
		handleBox(g);
	}
}
