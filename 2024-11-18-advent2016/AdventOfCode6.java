import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AdventOfCode6{

    public static void main(String[] args) {
        String filename = "Advent6.txt";  
        System.out.println("Error-corrected message: " + decodeMessage(filename));
    }

    public static String decodeMessage(String filename) {
        StringBuilder decodedMessage = new StringBuilder();
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            return "";
        }
        int numColumns = lines.get(0).length();
        for (int col = 0; col < numColumns; col++) {
            Map<Character, Integer> frequencyMap = new HashMap<>();
            for (String line : lines) {
                char c = line.charAt(col);
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
            char mostFrequentChar = findMostFrequentCharacter(frequencyMap);
            decodedMessage.append(mostFrequentChar);
        }
        return decodedMessage.toString();
    }
    public static char findMostFrequentCharacter(Map<Character, Integer> frequencyMap) {
        char mostFrequentChar = '\0';
        int maxFrequency = -1;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char c = entry.getKey();
            int frequency = entry.getValue();
            if (frequency > maxFrequency || (frequency == maxFrequency && c < mostFrequentChar)) {
                mostFrequentChar = c;
                maxFrequency = frequency;
            }
        }
        return mostFrequentChar;
    }
}