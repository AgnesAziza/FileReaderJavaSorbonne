import java.util.Collections;

public class DisplayReaderReverse extends FileReaderTxt {

	DisplayReaderReverse(String filePath) {
		super(filePath);
	}

	@Override
	public void displayFile() {
		Collections.reverse(fileContainer);
		for (String line : fileContainer) {
			System.out.println(line);
		}		
	}
}
