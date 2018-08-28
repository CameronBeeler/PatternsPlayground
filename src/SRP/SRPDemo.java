package SRP;

public class SRPDemo {
    public static void main(String[] args) {
        Journal j = new Journal();
        j.addJournalEntry("I'm so excited about this new Patterns class (Monday)");
        j.addJournalEntry("I'm making such great progress - I'm pumped! (Tuesday)");
        j.addJournalEntry("I'm so blessed today!(Wednesday---)");

        System.out.println(j);

        Persist p = new Persist();
        String filename = "/Users/cam/DEV/PatternsPlayground/src/journal.txt";
        p.saveToFile(j, filename, true);

    }
}
