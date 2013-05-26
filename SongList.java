import java.io.File;
import java.util.ArrayList;

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


}