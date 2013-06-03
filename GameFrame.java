import java.awt.event.ActionEvent;
import static cs1.Keyboard.*;
import javax.swing.ButtonGroup;
import java.util.*;


public class GameFrame extends javax.swing.JFrame{
	
	private SongList songs;
	private Contestant player;
	private SetupScreen

  public GameFrame(){
		//put path as whatever we decide on
		
		songs = new SongList(readString());
		player = new Contestant();
		initComponents();
	}
	
private void initComponents(){
	
	
	choice1 = new javax.swing.JRadioButton();
	choice2 = new javax.swing.JRadioButton();
	choice3 = new javax.swing.JRadioButton();
	choice4 = new javax.swing.JRadioButton();
	
	choice1.setText("song1");
	choice2.setText("song2");
	choice3.setText("song3");
	choice4.setText("song4");
	
	choice1.setActionCommand("song1");
	choice2.setActionCommand("song2");
	choice3.setActionCommand("song3");
	choice4.setActionCommand("song4");

	
	ButtonGroup group = new ButtonGroup();
	
	group.add(choice1);
	group.add(choice2);
	group.add(choice3);
	group.add(choice4);

	choice1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            choice1.ActionPerformed(evt);
        }});
	
	
}
	  
public void actionPerformed(ActionEvent e) 
{
	e.getActionCommand();
	
}
	private javax.swing.JRadioButton choice1;
	private javax.swing.JRadioButton choice2;
	private javax.swing.JRadioButton choice3;
	private javax.swing.JRadioButton choice4;
	
	
}
