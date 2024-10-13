public class CsvFileReader extends AbstractFileReader {

    public CsvFileReader() {
        super();
    }

    @Override
    public void displayFile() {
        String[] lignes = contenu.toString().split("\n");
        for (String ligne : lignes) {
            String[] colonnes = ligne.split(",");
            for (String colonne : colonnes) {
                System.out.print(colonne + "\t");
            }
            System.out.println();
        }
    }
    @Override
    public void displayFileInReverse() {
        String[] lignes = contenu.toString().split("\n");
        for (int i = lignes.length - 1; i >= 0; i--) {
            String[] colonnes = lignes[i].split(",");
            for (String colonne : colonnes) {
                System.out.print(colonne + "\t");
            }
            System.out.println();
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
