import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PhishingDetector {
    public static void main(String[] args) {
        String filename = "Nuevo Documento de texto.txt"; // Ruta al archivo de texto
        try {
            FileReader leer = new FileReader(filename);
            BufferedReader buf = new BufferedReader(leer);
            int totalScore = analyzeFile(buf);
            System.out.println("Puntaje total de phishing para el archivo: " + totalScore);
            buf.close(); // Cerrar el BufferedReader
        } catch (Exception e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }

    private static int analyzeFile(BufferedReader buf) throws IOException {
        KeywordAnalyzer analyzer = new KeywordAnalyzer();
        String line;
        while ((line = buf.readLine()) != null) {
            analyzer.analyzeLine(line);
        }
        return analyzer.getTotalScore();
    }
}
