// Bag.java
public class Bag {
    private final Book[] books;
    private int size;
    
    public Bag() {
        books = new Book[10];
        size = 0;
    }
    
    public boolean insertBook(Book book) {
        if (size < 10) {
            books[size++] = book;
            return true;
        }
        return false;
    }
    
    public Book[] searchByKeyword(String keyword) {
        Book[] result = new Book[size];
        int resultSize = 0;
        
        for (int i = 0; i < size; i++) {
            if (books[i].countKeywordOccurrences(keyword) > 0) {
                result[resultSize++] = books[i];
            }
        }
        
        Book[] trimmedResult = new Book[resultSize];
        System.arraycopy(result, 0, trimmedResult, 0, resultSize);
        return trimmedResult;
    }
    
    public Book searchBookWithMostOccurrences(String keyword) {
        if (size == 0) return null;
        
        Book maxBook = books[0];
        int maxCount = books[0].countKeywordOccurrences(keyword);
        
        for (int i = 1; i < size; i++) {
            int currentCount = books[i].countKeywordOccurrences(keyword);
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxBook = books[i];
            }
        }
        
        return maxBook;
    }
    
    public int getSize() {
        return size;
    }
}