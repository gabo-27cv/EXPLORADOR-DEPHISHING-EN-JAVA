import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;

public class KeywordAnalyzer {
    private final Map<String, Long> wordCountMap = new HashMap<>();

    public void analyzeLine(String line) {
        KeywordStore.getPhishingKeywords().forEach((key, value) -> {
            long count = countOccurrences(line, key);
            if (count > 0) {
                wordCountMap.merge(key, count, Long::sum);
            }
        });
    }

    public int getTotalScore() {
        int totalScore = 0;
        for (Map.Entry<String, Long> entry : wordCountMap.entrySet()) {
            int score = KeywordStore.getPhishingKeywords().get(entry.getKey()) * Math.toIntExact(entry.getValue());
            totalScore += score;
            System.out.println("Encontrado: " + entry.getKey() + " - Ocurrencias: " + entry.getValue() + " - Puntos: " + score);
        }
        return totalScore;
    }

    private long countOccurrences(String line, String word) {
        return Stream.of(line.split("\\s+"))
                     .filter(word::equals)
                     .count();
    }
}
