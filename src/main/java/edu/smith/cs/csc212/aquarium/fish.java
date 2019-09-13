package edu.smith.cs.csc212.aquarium;
import java.awt.Color;
import java.awt.Graphics2D;

public class fish {
	//every fish has a color that is a Color
	Color color;
	//every fish has a position (x,y) that are integers
	int x;
	int y;
	boolean isLittle;
	boolean isfacingLeft;
	
	public fish(Color c, int startx, int starty, boolean isLittle, boolean isfacingLeft) {
		this.color=c;
		this.x=startx;
		this.y=starty;
		this.isLittle=isLittle;
		this.isfacingLeft=isfacingLeft;
	}
	public void draw(Graphics2D g) {
		if (this.isLittle && this.isfacingLeft){
			DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
		}else if(this.isfacingLeft) {
			DrawFish.facingLeft(g, this.color, this.x, this.y);
		}else if(this.isLittle) {
			DrawFish.smallFacingRight(g, this.color, this.x, this.y);
		}else {
			DrawFish.facingRight(g, this.color, this.x, this.y);
		}
		
			
	}
	public void swim() {
		this.x+=1;
		this.y+=1;
	}
}
