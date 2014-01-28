/*FIG 15.12*/

import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;
public class FontJPanelMain {
  public static void main(String[] args){
      JFrame frame = new JFrame("Using fonts");
      //frame.setDefaultCloseOperation(JFrame("Using fonts"));
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      FontJPanel fontJPanel = new FontJPanel();
      frame.setUndecorated(true);
      frame.add(fontJPanel);
      //frame.setShape(420, 150);  replaced by:
      frame.setShape(new RoundRectangle2D.Float(0,0,500,500,10,10));
      
//      public RoundRectangle2D.Float(float x,
//                      float y,
//                      float w,
//                      float h,
//                      float arcw,
//                      float arch)
      frame.setVisible(true);
  }  

  
}
