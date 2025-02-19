// Page.java
public class Page {
    String text;
    
    public Page(String text) {
        this.text = text;
    }
    
    public String getText() {
        return text;
    }
    
    public int countKeywordOccurrences(String keyword) {
        int count = 0;
        String[] words = text.toLowerCase().split("\\s+");
        keyword = keyword.toLowerCase();
        
        for (String word : words) {
            if (word.equals(keyword)) {
                count++;
            }
        }
        return count;
    }
}

