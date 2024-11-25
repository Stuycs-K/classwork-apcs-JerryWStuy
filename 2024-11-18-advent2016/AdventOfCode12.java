import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AdventOfCode12{
    public static void main(String[] args) {
        System.out.println(valueInA("Advent12.txt"));
      }

    public static int valueInA(String filename){
      try {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        ArrayList<String> instructions = new ArrayList<String>();
        while (scanner.hasNextLine()) {
          instructions.add(scanner.nextLine());
        }
        scanner.close();
        return executeAssembunny(instructions);
      }
      catch (FileNotFoundException e) {
        System.out.println("File not found");
        return 0;
      }
    }
    public static int executeAssembunny(ArrayList<String> instructions) {
        int[] registers = new int[4];
        registers[2] = 1;
        int i = 0;
        while (i < instructions.size()) {
            String[] parts = instructions.get(i).split(" ");
            String action = parts[0];
        
            if (action.equals("cpy")) {
                int value = getValue(parts[1], registers);
                int index = getRegisterIndex(parts[2]);
                registers[index] = value;
                i++;
            } else if (action.equals("inc")) {
                int index = getRegisterIndex(parts[1]);
                registers[index]++;
                i++;    
            } else if (action.equals("dec")) {
                int index = getRegisterIndex(parts[1]);
                registers[index]--;
                i++;
            } else if (action.equals("jnz")) {
                int value = getValue(parts[1], registers);
                int jump = Integer.parseInt(parts[2]);
                if (value != 0) {
                    i += jump;
                } else {
                    i++;
                }
            }
        }
        return registers[0]; 
    }

    public static int getValue(String s, int[] registers) {
        if (s.equals("a") || s.equals("b") || s.equals("c") || s.equals("d")) {
            return registers[getRegisterIndex(s)];
        } else {
            return Integer.parseInt(s);
        }
    }

    public static int getRegisterIndex(String s) {
        if (s.equals("a")) {
            return 0;
        } else if (s.equals("b")) {
            return 1;
        } else if (s.equals("c")) {
            return 2;
        } else 
            return 3; 
    }
}