
public class DisplayFilePalindrome extends FileReaderTxt {

	DisplayFilePalindrome(String filePath) {
		super(filePath);
	}

	@Override
	public void displayFile() {
		for (String line : fileContainer) {
			System.out.println(line); }
		for (int i = fileContainer.size()-1; i>=0; i--) {
			StringBuilder palindromString = new StringBuilder();
			palindromString.append(fileContainer.get(i));
			palindromString.reverse();
			System.out.println(palindromString);
		//StringBuilder permet de créer des chaines de caractères 
		}	
	}
}
