import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class AbstractFileReader implements FileReaderInterface {
    protected StringBuilder contenu;

    public AbstractFileReader() {
        contenu = new StringBuilder();
    }
    @Override
    public void readFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                contenu.append(ligne).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }

    public boolean compareFiles(AbstractFileReader autreFichier) {
        return this.contenu.toString().equals(autreFichier.contenu.toString());
    }

    public abstract void displayFile();
    public abstract void displayFileInReverse();
    public abstract void displayFilePalindromic();
}
