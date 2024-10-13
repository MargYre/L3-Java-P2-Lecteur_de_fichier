import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;


public class TextFileReader implements FileReaderInterface {
    private StringBuilder contenu;
    public TextFileReader() {
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