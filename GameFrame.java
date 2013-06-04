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


        public static void main(String[] args){
        run1();
        }
        }
