package draw;
/*
 * 画图类
 * */
public class Drawing {
   public static void drawRectangle(Point point,Rectangle r){
	   System.out.println("在坐标为("+point.x+","+point.y+")处画一个长为"+r.len+",宽为"+r.width+"的矩形...");
   }
}
