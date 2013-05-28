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

	public String getRandomSongPath(){
		return listOfSongs.get((new Random()).nextInt(listOfSongs.size())).getPath();
	}

	public String getSongPath(String name){
		String ans = "";
		name = name + ".mp3";
		for (File child : listOfSongs){
			if (child.getName().equals(name)){
				ans = child.getPath();
				break;
			}
		}
		return ans;

	}

	public ArrayList<String> get4RandomSongs(){
		ArrayList<String> ans = new ArrayList<String>();
		for (int i = 0; i < 4; i++){
			Random makeRand = new Random();
			int random = makeRand.nextInt(listOfSongs.size());
			while (ans.contains(listOfSongs.get(random)))
				random = makeRand.nextInt(listOfSongs.size());
			String song = listOfSongs.get(random).getName();
			ans.add(song.substring(0, song.length() - 4));
		}
		return ans;
	}	

	public static void main(String[] args) {
		SongList test = new SongList("/Users/Sweyn/Downloads/VW/");
		AdvancedMP3 player = new AdvancedMP3(test.getRandomSongPath());
		ArrayList<String> songs = test.get4RandomSongs();
		System.out.println(songs);
		System.out.println(test.getSongPath(songs.get(0)));
		player.play();
	}
}