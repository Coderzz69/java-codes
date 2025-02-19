import java.util.ArrayList;
import java.util.List;

public class Book {
    String bookName;
    String author;
    private final List<Page> pages;

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
        this.pages = new ArrayList<>();
    }

    public void addPage(Page page) {
        pages.add(page);
    }

    public int countKeywordOccurrences(String keyword) {
        int totalCount = 0;
        for (Page page : pages) {
            totalCount += page.countKeywordOccurrences(keyword);
        }
        return totalCount;
    }

    public void deletePage(int pageIndex) {
        if (pageIndex >= 0 && pageIndex < pages.size()) {
            pages.remove(pageIndex);
        }
    }

    public void deleteAllPages() {
        pages.clear();
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pages.size();
    }
}

