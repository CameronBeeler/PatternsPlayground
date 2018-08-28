package SRP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Persist {
    public void saveToFile(Journal journal, String filename, boolean overwrite)
    {
        if (overwrite || new File(filename).exists())
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            } catch (FileNotFoundException f){
                f.addSuppressed(f);
            }
    }

}
