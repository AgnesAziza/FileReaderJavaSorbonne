
public class DisplayFileReaderWithoutChange extends FileReaderTxt {

	DisplayFileReaderWithoutChange(String filePath) {
		// ne pas oublier super quand on est extend sinon appel à vide et on ne pourra pas utiliser filePath
		super(filePath);
		}
	
	@Override
	public void displayFile() {
		// boucle for Java 
		// java parcours l'ArrayList FileContainer et met l'élément dans la variable line 
		// A chaque tour de boucle on en met 1 
		// boucle pratique quand pas besoin de i
		for (String line : fileContainer) {
			System.out.println(line);
		}
	}

}




