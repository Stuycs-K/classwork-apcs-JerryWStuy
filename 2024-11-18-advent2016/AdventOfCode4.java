import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AdventOfCode4 {
    public static void main(String[] args) {
        System.out.println("Sum of sector IDs: " + calculateSectorIDSum("Advent4.txt"));
    }

    public static int calculateSectorIDSum(String filename) {
        int sumSectorIDs = 0;
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                String[] parts = line.split("-");
                String sectorAndChecksum = parts[parts.length - 1];
                int sectorID = Integer.parseInt(sectorAndChecksum.substring(0,3));
                String checksum = sectorAndChecksum.substring(4,9);
                
                String encryptedName = "";
                    for (int i = 0; i < parts.length - 1; i++) {
                        encryptedName += parts[i];  
                }
                if (isRealRoom(encryptedName, checksum)) {
                    sumSectorIDs += sectorID;  
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
        return sumSectorIDs;
    }

    public static boolean isRealRoom(String encryptedName, String checksum) {
        int[] frequency = new int[26];  
        for (int i = 0; i < encryptedName.length(); i++) {
            char c = encryptedName.charAt(i);
            frequency[c - 'a']++;
        }
    
        char[] letters = new char[26];
        int[] counts = new int[26];
        for (int i = 0; i < 26; i++) {
            letters[i] = (char) ('a' + i);  
            counts[i] = frequency[i];  
        }
    
        for (int i = 0; i < 25; i++) {  
            for (int j = i + 1; j < 26; j++) {
                if (counts[i] < counts[j] || (counts[i] == counts[j] && letters[i] > letters[j])) {
                    int tempCount = counts[i];
                    counts[i] = counts[j];
                    counts[j] = tempCount;
                    char tempChar = letters[i];
                    letters[i] = letters[j];
                    letters[j] = tempChar;
                }
            }
        }
        String calculatedChecksum = "";
        for (int i = 0; i < 5; i++) {
            calculatedChecksum += letters[i];  
        }
        return calculatedChecksum.equals(checksum);
    }
}
