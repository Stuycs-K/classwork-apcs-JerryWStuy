import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AdventOfCode4 {
    public static void main(String[] args) {
        System.out.println(SectorIDSum("Advent4.txt"));
    }

    public static int SectorIDSum(String filename) {
        int sum = 0;
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                String[] parts = line.split("-");
                String sectorCheck = parts[parts.length - 1];
                int sectorID = Integer.parseInt(sectorCheck.substring(0,3));
                String checksum = sectorCheck.substring(4,9);
                
                String name = "";
                    for (int i = 0; i < parts.length - 1; i++) {
                        name += parts[i];  
                }
                if (isRealRoom(name, checksum)) {
                    if (decryptRoomName(name, sectorID).contains("north")){
                        System.out.println(decryptRoomName(name, sectorID) + " " + sectorID);
                    }
                    sum += sectorID;  
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return sum;
    }

    public static boolean isRealRoom(String name, String checksum) {
        int[] frequency = new int[26];  
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
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
        String calculatedSum = "";
        for (int i = 0; i < 5; i++) {
            calculatedSum += letters[i];  
        }
        return calculatedSum.equals(checksum);
    }

    public static String decryptRoomName(String name, int sectorID) {
        String finalName = "";
        for (char c : name.toCharArray()) {
            char shiftedChar = (char) ((c - 'a' + sectorID) % 26 + 'a');
            finalName += shiftedChar;
        }
        return finalName;
    }
}
