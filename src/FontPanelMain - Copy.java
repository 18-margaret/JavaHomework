/*FIG 15.12*/
package chapt15graphics;
import javax.swing.JFrame;
public class FontPanelMain {
  public static void main(String[] args){
      JFrame frame = new JFrame("Using fonts");
      frame.setDefaultCloseOperation(JFrame("Using fonts"));
      FontJPanel fontJPanel = new FontJPanel();
      frame.add(fontJPanel);
      frame.setShape(420, 150);
      frame.setVisible(true);
  }  
}
