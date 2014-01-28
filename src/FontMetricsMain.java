/*FIG 15.16 FontMetrics*/

import javax.swing.JFrame;
public class FontMetricsMain {
  public static void main(String[] args){
     JFrame frame = new JFrame("Demonstrating FontMetrics");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     FontMetrics  metricsJPanel = new FontMetrics();
     frame.add(metricsJPanel);
     frame.setSize(510, 240);
     frame.setVisible(true);
    }  
}
