import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class FileReaderTxt implements Filereader {
	//une classe est abstraite si elle contient des méthodes abstraites 
	private String filePath;
	protected ArrayList<String> fileContainer;
	
	FileReaderTxt(String filePath) {
		this.filePath = filePath;
		this.fileContainer = new ArrayList<String>();
	}

	@Override
	public void readerFile() throws IOException {
		try {
			FileReader fileReaderTxt = new FileReader(filePath);
			BufferedReader reader = new BufferedReader(fileReaderTxt);
			String line;
			// la méthode readline renvoie null quand toutes les lignes on été lues 
			while ((line = reader.readLine()) !=null) {
				fileContainer.add(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public abstract void displayFile();
}
