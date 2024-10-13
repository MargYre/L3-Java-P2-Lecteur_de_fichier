public class FileReader {
    public static void main(String[] args) {
        TextFileReader lecteurTxt = new TextFileReader();
        
        System.out.println("Lecture du fichier texte :");
        lecteurTxt.readFile("files/plop.txt");
        
        System.out.println("Contenu du fichier à l'endroit:");
        lecteurTxt.displayFile();

        System.out.println("\nContenu du fichier à l'envers:");
        lecteurTxt.displayFileInReverse();

        System.out.println("\nContenu du fichier en mode palindromique:");
        lecteurTxt.displayFilePalindromic();

        CsvFileReader lecteurCsv = new CsvFileReader();

        System.out.println("\nLecture du fichier CSV :");
        lecteurCsv.readFile("files/fichier.csv");

        System.out.println("Contenu du fichier CSV :");
        lecteurCsv.displayFile();

        TextFileReader lecteurTxt2 = new TextFileReader();
        lecteurTxt2.readFile("monFichier2.txt");
        
        System.out.println("\nComparaison des fichiers texte :");
        boolean sontIdentiques = lecteurTxt.compareFiles(lecteurTxt2);
        if (sontIdentiques) {
            System.out.println("Les fichiers sont identiques.");
        } else {
            System.out.println("Les fichiers sont différents.");
        }
    }
}