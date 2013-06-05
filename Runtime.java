import java.util.*;

public class Runtime{

	private SongList songs;
	private Contestant player;
	private SetupScreen startup;
	private Buttonswithreturns main;
	private int answer;
	private AdvancedMP3 musicPlayer;
	private FinalFrame end;

	public Runtime(){
		songs = new SongList("./Songs");
		player = new Contestant();
		answer = 0;
		startup = new SetupScreen(this);
		main = new Buttonswithreturns(this);
		end = new FinalFrame(this);
		startup.run();
	}

	public void newSong(){
		ArrayList<String> songList= songs.get4RandomSongs();
		main.setButtons(songList);
		int song = (int)(Math.random() * 4);
		answer = song;
		musicPlayer = new AdvancedMP3(songs.getSongPath(songList.get(song)));
		musicPlayer.play(380);
	}

	public void runMainFrame(String name, int rounds){
		player.changeName(name);
		player.setNumRounds(rounds);
		main.run();
		newSong();
	}

	public void round(int guess){
		musicPlayer.close();
		if (guess == answer)
			player.addScore();
		player.setNumRounds(player.getNumRounds() - 1);
		if (player.getNumRounds() > 0)
			newSong();
		else{
			main.setVisible(false);
			end.run(player.getScore() + "");
		}
	}

	public static void main(String[] args) {
		new Runtime();
	}

}