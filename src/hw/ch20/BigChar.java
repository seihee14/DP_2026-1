package hw.ch20;

import java.io.*;

public class BigChar {
    private char charname;
    private String fontdata;
    private static final String RESET = "\u001B[0m";

    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(
                new FileReader("big" + charname + ".txt")
            );
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
            reader.close();
            this.fontdata = sb.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    public void print() {
        System.out.print(fontdata);
    }

    public void print(String colorCode) {
        System.out.print(colorCode + fontdata + RESET);
    }
}