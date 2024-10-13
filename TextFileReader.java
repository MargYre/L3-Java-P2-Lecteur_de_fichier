
public class TextFileReader extends AbstractFileReader {
    public TextFileReader() {
        super();
    }

    @Override
    public void displayFile() {
        System.out.println(contenu.toString());
    }
    @Override
    public void displayFileInReverse() {
        String[] lignes = contenu.toString().split("\n");
        for (int i = lignes.length - 1; i >= 0; i--) {
            System.out.println(lignes[i]);
        }
    }
    @Override
    public void displayFilePalindromic() {
        for (int i = 0; i < contenu.length(); i++) {
            System.out.print(contenu.charAt(contenu.length() - 1 - i));
        }
        System.out.println();
    }
}