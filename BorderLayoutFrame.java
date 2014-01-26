/*Fig14.41 BorderLayoout layout manager is default for JFrame
 arranges components north, south, east, west and center
 can only have five compnenets */
package simplegui;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
public class BorderLayoutFrame extends JFrame implements ActionListener{
    private JButton[]buttons;
    private  static final String[]names =
    {"Hide North", "HIde South", "Hide East", "Hide West", "Hide Center"};
    private BorderLayoutFrame(){
        super ("Border Layout Demo");
        layout = new BorderLayout(5,5);//set 5 pixel gap
        setLayout(layout);
        buttons = new JButton[names.length];
        for (int count =0; count< names.length; count++){
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this);
        }//end for
        add(buttons[0], BorderLayout.NORTH);
        add(buttons[1], BorderLayout.SOUTH);
        add(buttons[2], BorderLayout.EAST);
        add(buttons[3], BorderLayout.WEST);
        add(buttons[4], BorderLayout.CENTER);
    }//emd BorderlayoutFrame construcotr
    //handle button events
    public void actionPerformer(ActionEvent event){
    //check event source and lay out content pane correspondingly
     for (JButton button : buttons){   
        if(event.getSource()==button)
         button.setVisible(false);
        else button.setVisible(true);
      }//end for
    layout.layoutContainer(getContentPane());
    
    }//end method actionPerformed
}