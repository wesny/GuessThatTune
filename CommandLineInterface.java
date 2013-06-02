import static cs1.Keyboard.*;
public class CommandLineInterface{

	private SongList songs;
	private Contestant player;

	public CommandLineInterface(){
		player = new Contestant();
		songs = null;
	}

	public void play(){
		System.out.println("Welcome to GuessThatTune!");
		System.out.print("Please input your name:");
		player.changeName(readString());
		System.out.print("How many rounds would you like to play?:");
		player.setNumRounds(readInt());
		System.out.print("Where should we get the songs from?:");
		songs = new SongList(readString());
		System.out.println("Perfect! Let's get started!");
	}

	public static void main(String[] args) {
		CommandLineInterface game =  new CommandLineInterface();
		game.play();
	}
}