import java.io.File;
import java.util.ArrayList;
import java.util.*;

public class SongList{

	private ArrayList<File> listOfSongs;


	//Constructs given a folder containing MP3 files
	public SongList(String path){
		File dir = new File(path);
		listOfSongs = new ArrayList<File>();
		for (File child : dir.listFiles()) {
			int len = child.getName().length();
			if (!child.isHidden() && child.getName().substring(len-4, len).equals(".mp3"))
				listOfSongs.add(child);
		}
	}

	public ArrayList<File> getListOfSongs(){
		return listOfSongs;
	}

	public File getRandomSong(){
		return listOfSongs.get((new Random()).nextInt(listOfSongs.size()));
	}

	public static void main(String[] args) {
		SongList test = new SongList("/Users/Sweyn/FinalProject");
		AdvancedMP3 player = new AdvancedMP3(test.getRandomSong().getPath());
		player.play();
	}
}