import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		DisplayFileReaderWithoutChange fileReader = new DisplayFileReaderWithoutChange("/Users/agnes/eclipse-workspace/FileProject/src/texte.txt");
		fileReader.readerFile();
		fileReader.displayFile();
		
		DisplayReaderReverse fileReaderReverse = new DisplayReaderReverse("/Users/agnes/eclipse-workspace/FileProject/src/texte.txt");
		fileReaderReverse.readerFile();
		fileReaderReverse.displayFile();
		
		DisplayFilePalindrome fileReaderPalindrome = new DisplayFilePalindrome("/Users/agnes/eclipse-workspace/FileProject/src/texte.txt");
		fileReaderPalindrome.readerFile();
		fileReaderPalindrome.displayFile();
		
	}

}
