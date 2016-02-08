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
    FileCorrector(File fileInput, HashSet<String> invalid_characters, BufferedReader br, BufferedWriter Correct_file, String[] invalidDefault){     
        try {
            for (int i = 0; i < invalidDefault.length; i++) {
                invalid_characters.add(invalidDefault[i]);
            }
            try {
                br = new BufferedReader(new FileReader(fileInput.toString()));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CorrectBibtex.class.getName()).log(Level.SEVERE, "Input file not found", ex);
            }
            try {
                Correct_file = new BufferedWriter(new FileWriter(fileInput+"_Correct.bib") );
            } catch (IOException ex) {
                Logger.getLogger(CorrectBibtex.class.getName()).log(Level.SEVERE, null, ex);
            }
            String line;
            while ((line = br.readLine()) != null) {
                // I read the file line by line and consider lines starting with @ and ending with ","
                if (line.startsWith("@")&&line.startsWith(",")) {
                    String head= line.substring(0, line.lastIndexOf("{"));
                    // I extract the bibtexKey
                    String bibtexKey = line.substring(line.lastIndexOf("{"), line.lastIndexOf(","));
                    for (Iterator<String> iterator = invalid_characters.iterator(); iterator.hasNext();) {
                        String character = iterator.next();
                        System.out.println(character);
                        bibtexKey= bibtexKey.replace(character,"");
                    }
                    String tail= line.substring(line.lastIndexOf(","), line.length());
                    // I rebuild the line with the corrected bibtexKey
                    line=head+bibtexKey+tail;
                    System.out.println(line);
                    Correct_file.write(line);
                    Correct_file.write("\n");
                }else{
                    Correct_file.write(line);
                    Correct_file.write("\n");
                }
            }
            JOptionPane.showMessageDialog(null,"Everything fine");
        } catch (IOException ex) {
            Logger.getLogger(CorrectBibtex.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Correct_file.close();
        } catch (IOException ex) {
            Logger.getLogger(CorrectBibtex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
       
    }

