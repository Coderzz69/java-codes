public class Book {
    String bookName;
    String author;
    Page[] pages;
    private int pageCount;
    
    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
        this.pages = new Page[100]; // Reasonable default size
        this.pageCount = 0;
    }
    
    public void addPage(Page page) {
        if (pageCount < pages.length) {
            pages[pageCount++] = page;
        }
    }
    
    public int countKeywordOccurrences(String keyword) {
        int totalCount = 0;
        for (int i = 0; i < pageCount; i++) {
            totalCount += pages[i].countKeywordOccurrences(keyword);
        }
        return totalCount;
    }
    
    public String getBookName() {
        return bookName;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getPageCount() {
        return pageCount;
    }
}

