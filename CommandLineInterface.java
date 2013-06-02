import static cs1.Keyboard.*;
import java.util.*;
public class CommandLineInterface{

	private SongList songs;
	private Contestant player;

	public CommandLineInterface(){
		player = new Contestant();
		songs = null;
	}

	public static void waiting (int n){  
        long t0, t1;
        t0 =  System.currentTimeMillis();
        do{
            t1 = System.currentTimeMillis();
        }
        while ((t1 - t0) < (n * 1000));
    }

	public void play(){
		System.out.println("Welcome to GuessThatTune!");
		System.out.print("Please input your name:");
		player.changeName(readString());
		System.out.print("How many rounds would you like to play?:");
		player.setNumRounds(readInt());
		System.out.print("Where should we get the songs from?:");
		songs = new SongList(readString());
		System.out.println("Perfect! Let's get started! You'll hear 10 seconds of a song and you can then guess which song it was.");
		for (int i = 0; i < player.getNumRounds(); i++){
			System.out.println("Ready for the song?");
			ArrayList<String> songList= songs.get4RandomSongs();
			int song = (int)(Math.random() * 4);
			AdvancedMP3 musicPlayer = new AdvancedMP3(songs.getSongPath(songList.get(song)));
			musicPlayer.play();
			for (int j = 0; j < 4; j++){
				System.out.println(j + ": " + songList.get(j));
			}
			System.out.print("You'll be able to make your guess after the song finishes");
			waiting(10);
			musicPlayer.forceClose();
			System.out.println();
			System.out.print("Please enter the corresponding number to your guess:");
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

	public static void main(String[] args) {
		CommandLineInterface game =  new CommandLineInterface();
		game.play();

	}
}