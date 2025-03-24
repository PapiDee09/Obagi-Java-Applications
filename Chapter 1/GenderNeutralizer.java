import java.util.HashMap;
import java.util.Scanner;

public class GenderNeutralizer {
    public static void main(String[] args) {
        // Step 1: Define the replacement mappings
        HashMap<String, String> replacements = new HashMap<>();
        replacements.put("wife", "spouse");
        replacements.put("man", "person");
        replacements.put("woman", "person");
        replacements.put("husband", "spouse");
        replacements.put("daughter", "child");
        replacements.put("son", "child");
        replacements.put("his", "their"); // Adjust possessive pronouns
        replacements.put("her", "their");

        // Step 2: Get input paragraph from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a paragraph to make gender-neutral:");
        String paragraph = scanner.nextLine();

        // Step 3: Replace gender-specific words
        String neutralParagraph = makeGenderNeutral(paragraph, replacements);

        // Step 4: Display the result
        System.out.println("\nOriginal Paragraph:");
        System.out.println(paragraph);
        System.out.println("\nGender-Neutral Paragraph:");
        System.out.println(neutralParagraph);

        scanner.close();
    }

    public static String makeGenderNeutral(String paragraph, HashMap<String, String> replacements) {
        // Split the paragraph into words, preserving spaces and punctuation
        String[] words = paragraph.split("(?<=\\b|[^\\w])"); // Split on word boundaries

        // Process each word
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String wordLower = word.toLowerCase(); // Case-insensitive comparison

            // Check if the word (without punctuation) matches a key in the replacements
            String wordClean = wordLower.replaceAll("[^a-zA-Z]", ""); // Remove punctuation for matching
            if (replacements.containsKey(wordClean)) {
                // Preserve the original case of the word
                String replacement = replacements.get(wordClean);
                if (Character.isUpperCase(word.charAt(0))) {
                    // Capitalize the first letter of the replacement
                    replacement = replacement.substring(0, 1).toUpperCase() + replacement.substring(1);
                }
                // Replace the word, keeping any punctuation
                words[i] = word.replaceFirst("(?i)" + wordClean, replacement);
            }
        }

        // Reconstruct the paragraph
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word);
        }
        return result.toString();
    }
}