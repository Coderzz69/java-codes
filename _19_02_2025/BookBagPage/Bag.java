import java.util.ArrayList;
import java.util.List;

public class Bag {
    private final List<Book> books;

    public Bag() {
        books = new ArrayList<>();
    }

    public boolean insertBook(Book book) {
        if (books.size() < 10) {
            books.add(book);
            return true;
        }
        return false;
    }

    public Book[] searchByKeyword(String keyword) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.countKeywordOccurrences(keyword) > 0) {
                result.add(book);
            }
        }
        return result.toArray(new Book[0]);
    }

    public Book searchBookWithMostOccurrences(String keyword) {
        if (books.isEmpty()) return null;

        Book maxBook = books.get(0);
        int maxCount = maxBook.countKeywordOccurrences(keyword);

        for (Book book : books) {
            int currentCount = book.countKeywordOccurrences(keyword);
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxBook = book;
            }
        }

        return maxBook;
    }

    public int getSize() {
        return books.size();
    }

    public void deleteBag() {
        books.clear();
    }

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

    class Page {
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
}