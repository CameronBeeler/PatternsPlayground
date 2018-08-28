package SRP;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private final List<String> entries = new ArrayList<>();
    private static int entryCount = 0;

//    requires adding journal entries
//    requires joining journal entries with system line separators
//    requires removal of journal entries
//

    public void addJournalEntry(String s) {
        if (s != null) {
            entries.add("" + (++entryCount) + ": " + s);

        }
    }

    public void removeJournalEntry(int index) {
        if (index >= 0) {
            entries.remove(index);

        }

    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

}




