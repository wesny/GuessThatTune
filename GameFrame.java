import java.awt.event.ActionEvent;
import static cs1.Keyboard.*;
import javax.swing.ButtonGroup;
import java.util.*;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class GameFrame extends javax.swing.JFrame{
	
	private SongList songs;
	private Contestant player;
	private SetupScreen setup;
	private javax.swing.JButton choice1;
	private javax.swing.JButton choice2;
	private javax.swing.JButton choice3;
	private javax.swing.JButton choice4;

  public GameFrame(){
  		setup = new SetupScreen();
  		setup.run();
		//put path as whatever we decide on	
		songs = new SongList(readString());
		player = new Contestant(setupscreen.getContestantName());
		initComponents();
	}
	
private void initComponents(){
	
	
	choice1 = new javax.swing.JButton();
	choice2 = new javax.swing.JButton();
	choice3 = new javax.swing.JButton();
	choice4 = new javax.swing.JButton();
	
	choice1.setText("song1");
	choice2.setText("song2");
	choice3.setText("song3");
	choice4.setText("song4");
	
	choice1.addActionListener(new java.awt.event.ActionListener() {
	return 0;
        }
        
        choice2.addActionListener(new java.awt.event.ActionListener() {
       return 1;
        }
	choice3.addActionListener(new java.awt.event.ActionListener() {
   	return 2;
        }
        
	choice4.addActionListener(new java.awt.event.ActionListener() {
        return 3;
        }
    });	


}

public void run(){
	for (int i = 0; i < player.getNumRounds(); i++){
		System.out.println("Ready for the song?");
		ArrayList<String> songList= songs.get4RandomSongs();
		int song = (int)(Math.random() * 4);
		AdvancedMP3 musicPlayer = new AdvancedMP3(songs.getSongPath(songList.get(song)));	
		musicPlayer.play(380);
		
		choice1.setText("" + songList.get(0));
		choice2.setText("" + songList.get(1));
		choice3.setText("" + songList.get(2));
		choice4.setText("" + songList.get(3));
		
		System.out.println();
		System.out.print("Please enter the corresponding number to your guess:");
		musicPlayer.close();
		int guess = readInt();
		if (guess == song){
			System.out.println("Correct!");
			player.addScore();
		}
		else
			System.out.println("I'm sorry, the correct answer was " + songList.get(song));
		System.out.println("-------------------");
	}	  
	System.out.println("Congratulations, you've completed " + player.getNumRounds() + " rounds and got " + Math.round(player.getScore() * 1.0 / player.getNumRounds() * 100) + " percent correct!");
}
	  
public void actionPerformed(ActionEvent e) 
{
	e.getActionCommand();
	
}
	
	


public static void main(String[] args){

GameFrame a = new GameFrame();
a.run();
}
}
