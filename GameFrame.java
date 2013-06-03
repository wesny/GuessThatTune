        import java.awt.event.ActionEvent;
        import static cs1.Keyboard.*;
        import java.awt.BorderLayout;

        import javax.swing.ButtonGroup;
        import java.util.*;
        import javax.swing.AbstractButton;
        import javax.swing.JButton;
        import javax.swing.JPanel;
        import javax.swing.JFrame;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.awt.event.KeyEvent;

        public class GameFrame extends javax.swing.JFrame implements ActionListener{

                private SongList songs;
                private Contestant player;
                private SetupScreen setup;
                private javax.swing.JButton choice1;
                private javax.swing.JButton choice2;
                private javax.swing.JButton choice3;
                private javax.swing.JButton choice4;

          public GameFrame(){
              /*
                        setup = new SetupScreen();
                        setup.run();
                        //put path as whatever we decide on	
                        songs = new SongList(readString());
                        player = new Contestant(setupscreen.getContestantName());
                        */
                       super("GameFrame");

                choice1 = new JButton("song1");
                choice2 = new JButton("song2");
                choice3 = new JButton("song3");
                choice4 = new JButton("song4");


              setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


              choice1.addActionListener(this);





            }
              public void actionPerformed(ActionEvent e) 
            {
                    System.out.println("hi");

            }

            public static void run1(){
                try {
                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (ClassNotFoundException ex) {
                    java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
        java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new GameFrame().setVisible(true);
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




        public static void main(String[] args){
        run1();
        }
        }
