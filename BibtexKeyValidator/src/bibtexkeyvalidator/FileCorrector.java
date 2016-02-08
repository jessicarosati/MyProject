/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibtexkeyvalidator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jessica
 */
public class FileCorrector {

    BufferedReader br;
    BufferedWriter Correct_file;
    String contentOfFile="";

    FileCorrector(File fileInput, HashSet<String> invalid_characters, String[] invalidDefault, Boolean overwrite) {
        if (!overwrite) {
            /* 
             OPTION 1
             This option corrects the file and write its content in a new file.
             It reads the file line by line and identifies the lines with bibtex keys.
             The bibtex key then is corrected, taking into account the set of invalid characters.
             The content of the input file (with the corrected keys) is written in a .bib file whose name is the name of the input file 
             concatenated with "_Correct".
             The output file is in the same position of the input file.
             */
            try {
                for (int i = 0; i < invalidDefault.length; i++) {
                    invalid_characters.add(invalidDefault[i]);
                }
                System.out.println("filecorrector" + invalid_characters);
                try {
                    br = new BufferedReader(new FileReader(fileInput.toString()));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(CorrectBibtex.class.getName()).log(Level.SEVERE, "Input file not found", ex);
                }
                try {
                    Correct_file = new BufferedWriter(new FileWriter(fileInput.toString().replace(".bib", "") + "_Correct.bib"));
                } catch (IOException ex) {
                    Logger.getLogger(CorrectBibtex.class.getName()).log(Level.SEVERE, "IOexception BufferedWriter", ex);
                }
                String line;
                while ((line = br.readLine()) != null) {
                    // I read the file line by line and consider lines starting with @ and ending with ","
                    if (line.startsWith("@") && line.endsWith(",")) {
                        String head = line.substring(0, line.lastIndexOf("{"));
                        // I extract the bibtexKey which is between the last index of "{" and the last index of ","
                        String bibtexKey = line.substring(line.lastIndexOf("{"), line.lastIndexOf(","));
                        for (Iterator<String> iterator = invalid_characters.iterator(); iterator.hasNext();) {
                            String character = iterator.next();
                            bibtexKey = bibtexKey.replace(character, "");// I cancel the invalid_character
                        }
                        String tail = line.substring(line.lastIndexOf(","), line.length());
                        // I rebuild the line with the corrected bibtexKey
                        line = head + bibtexKey + tail;
                        Correct_file.write(line);
                        Correct_file.write("\n");
                    } else {
                        Correct_file.write(line);
                        Correct_file.write("\n");
                    }
                }// I print out the path for the output file
                JOptionPane.showMessageDialog(null, "Everything fine! Look at " + fileInput.toString().replace(".bib", "") + "_Correct.bib");
                // BufferedReader and BufferedWriter closure
                br.close();
                Correct_file.close();
            } catch (IOException ex) {
                Logger.getLogger(CorrectBibtex.class.getName()).log(Level.SEVERE, "IOException", ex);
            }
        } else {
            //OPTION 2
            //This option OVERWRITE the file.
            //It reads the file line by line and identifies the lines with bibtex keys.
            //The bibtex key then is corrected, taking into account the set of invalid characters.
            //This option is slower than the previous one
            try {
                for (int i = 0; i < invalidDefault.length; i++) {
                    invalid_characters.add(invalidDefault[i]);
                }
                System.out.println("filecorrector" + invalid_characters);
                try {
                    br = new BufferedReader(new FileReader(fileInput.toString()));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(CorrectBibtex.class.getName()).log(Level.SEVERE, "Input file not found", ex);
                }
                String line;
                while ((line = br.readLine()) != null) {
                    // I read the file line by line and consider lines starting with @ and ending with ","
                    if (line.startsWith("@") && line.endsWith(",")) {
                        String head = line.substring(0, line.lastIndexOf("{"));
                        // I extract the bibtexKey which is between the last index of "{" and the last index of ","
                        String bibtexKey = line.substring(line.lastIndexOf("{"), line.lastIndexOf(","));
                        for (Iterator<String> iterator = invalid_characters.iterator(); iterator.hasNext();) {
                            String character = iterator.next();
                            bibtexKey = bibtexKey.replace(character, "");// I cancel the invalid_character
                        }
                        String tail = line.substring(line.lastIndexOf(","), line.length());
                        // I rebuild the line with the corrected bibtexKey
                        line = head + bibtexKey + tail;
                        contentOfFile = contentOfFile + line + "\n";
                    } else {
                        contentOfFile = contentOfFile + line + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, "Everything fine!");
                br.close();
                Correct_file = new BufferedWriter(new FileWriter(fileInput.toString()));
                Correct_file.write(contentOfFile);
                Correct_file.close();
            } catch (IOException ex) {
                Logger.getLogger(FileCorrector.class.getName()).log(Level.SEVERE, "IOException", ex);
            }
        }
    }
}
