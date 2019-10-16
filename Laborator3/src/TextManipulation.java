import java.util.*;

    public class TextManipulation {

        public int numOfWords(String text) {
            String[] words = text.split("([^A-z| \\s]+)");
            return words.length;
        }

        public int numOfSentences(String text) {
            String[] sentences = text.split("[!?.:]+");
            return sentences.length;
        }

        public int numOfLetters(String text) {
            String letters = text.replaceAll("[^A-z]", "");
            return letters.length();
        }

        public void numOfVowelsAndConsonants(String text) {
            text = text.toLowerCase();
            int vowels = 0, consonants = 0;
            for (int i = 0; i < text.length(); ++i) {
                char ch = text.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    ++vowels;
                } else if ((ch >= 'a' && ch <= 'z')) {
                    ++consonants;
                }
            }
            System.out.println("Number of vowels:" + vowels + "\n" + "Number of consonants:" + consonants);
        }

        public void numOfOftenWords(String text) {
            int num;
            int maxNum = 0;
            String word;
            ArrayList<String> words = new ArrayList<>();
            String[] newText = text.toLowerCase().split("[,.!?;|[0-9]\\s]+");
            for (String s : newText) {
                words.add(s);
            }
            for (int i = 0; i < words.size(); i++) {
                num = 1;
                for (int j = i + 1; j < words.size(); j++) {
                    if (words.get(i).equals(words.get(j))) {
                        num++;
                    }
                }
                if (num > maxNum) {
                    maxNum = num;
                    word = words.get(i);
                    System.out.println("Often word: "+word);
                }
            }
        }

        public static void longestWord(String text) {
            String[] LongWord = text.split("([,.!?;|0-9\\s]+)");
            Arrays.toString(LongWord);
            String longWord = " ";
            for (int i = 0; i < LongWord.length; i++) {
                if (LongWord[i].length() >= longWord.length()) {
                    longWord = LongWord[i];
                }
            }
            System.out.println("'"+longWord + "' is the longest word with " + longWord.length() + " characters");
        }
        public static void top5Words(String text) {
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            ArrayList<String> arrayList = new ArrayList(Arrays.asList(text.toLowerCase().split("[,.!?;[0-9]\\s]+")));
            for (int i = 1; i <= 5; i++) {

                int maxValue = 0;

                for (String word : arrayList) {
                    Integer number = map.get(word);
                    if (number == null) number = 1;
                    else number = ++number;
                    map.put(word, number);
                }

                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    int value = entry.getValue();
                    if (value > maxValue) {
                        maxValue = value;
                    }
                }
                String key = getKeyFromValue(map, maxValue);
                System.out.println(" Top " + i + " word = " + key);
                map.remove(key);
                arrayList.removeAll(Collections.singleton(key));
            }
        }

        public static String getKeyFromValue (Map < String, Integer > hashMap, Integer value){
            for (String word : hashMap.keySet()) {
                if (hashMap.get(word).equals(value)) {
                    return word;
                }
            }
            return null;
        }
    }