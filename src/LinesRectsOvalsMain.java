/*FIG 15.19*/

import java.awt.Color;
//this was missing from Dietel     import java.awt.Color;
import javax.swing.JFrame;
public class LinesRectsOvalsMain {
  public static void main(String[] args){
     JFrame frame = new JFrame("Drawing lines, rectangles and"
             + "ovals");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     LinesRectsOvalsJPanel linesRectsOvals = new
             LinesRectsOvalsJPanel();
     linesRectsOvals.setBackground(Color.WHITE);
     frame.add(linesRectsOvals);
     frame.setSize(400, 210);
     frame.setVisible(true);
  }  
}
