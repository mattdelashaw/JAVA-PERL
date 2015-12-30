package hangman;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

class Input {

        private String path;

        public Input(String file_path) {

                path = file_path;

        }

        public ArrayList<String> loadFile() throws FileNotFoundException {

                Scanner inFile = new Scanner(new File(path));
                ArrayList<String> allTheWords = new ArrayList<String>();

                while (inFile.hasNext()) {

                        allTheWords.add(inFile.next());

                }

                inFile.close();
                return allTheWords;

        }

}
