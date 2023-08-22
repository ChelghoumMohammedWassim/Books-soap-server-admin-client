import service.BookItem;
import service.BooksReader;
import service.BooksService;

import java.util.List;

public class Client {
    public static void main(String[] args) {

        System.out.println("====================================================================");
        BooksReader STUB=new BooksService().getBooksReaderPort();
        List<BookItem> bookList=STUB.readBooks();
        System.out.println(bookList);
        System.out.println("====================================================================");
        BookItem result=STUB.getBookById(1);
        System.out.println(result);
        System.out.println("====================================================================");
        List<BookItem> dispoList=STUB.getDispoBook();
        System.out.println(dispoList);

//        STUB.addBook(new BookItem(7,"tzst","22222",1,1));
//        bookList=STUB.readBooks();
     System.out.println(bookList);

     new Frame().setVisible(true);

    }
}
