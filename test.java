import java.io.File;

public class test{

	public static void main(String[] args) {
		File dir = new File("/Users/Sweyn/FinalProject");
		File test = null;
		for (File child : dir.listFiles()) {
			int len = child.getName().length();
			if (!child.isHidden() && child.getName().substring(len-4, len).equals(".mp3"))
				test = child;
		}
		AdvancedMP3 mp3 = new AdvancedMP3(test.getPath());
		mp3.play();
	}

}