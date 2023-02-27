public class MainForCollections {
    public static void main(String[] args) {

        System.out.println("-----Repeating words----");

        String source = "I cannot stop this sickness taking over " +
                "It takes control and drags me into nowhere " +
                "I need your help, I can't fight this forever " +
                "I know you're watching, I can feel you out there " +
                "Take me high and I'll sing " +
                "Oh, you make everything okay, okay, okay (okay, okay, okay) " +
                "We are one and the same" +
                "Oh, you take all of the pain away, away, away (away, away, away)" +
                "Save me if I become my demons";

        Duplicate.getDuplicatesWithCount(source);

        System.out.println();
        System.out.println("-----Dictionary----");



        Dictionary dictionary = new Dictionary();
        dictionary.addWordAndTranslation("gehen", "go");
        dictionary.addWordAndTranslation("gehen", "walk");
        dictionary.addWordAndTranslation("gehen", "leave");
        dictionary.addWordAndTranslation("gehen", "move");
        System.out.println(dictionary.getTranslationOf("gehen"));

        dictionary.addWordAndTranslation("Klass", "Class");
        dictionary.addWordAndTranslation("Klasse", "Category");
        dictionary.addWordAndTranslation("Klass", "Grade");
        dictionary.addWordAndTranslation("Klass", "Form");
        System.out.println(dictionary.getTranslationOf("Klass"));
        System.out.println(dictionary.getTranslationOf("Klasse"));
        System.out.println(dictionary.getTranslationOf("test"));

        System.out.println();
        dictionary.showAll();

    }

}
