package co.ga.bookstore;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Book entity to represent books in our data model. A book has a title.
 * We'll be able to search for books by title in {@link BookRepository}.
 *
 * <p>
 * My milkshake brings all the boys to the yard
 * And they're like, it's better than yours
 * Damn right it's better than yours
 * I can teach you, but I have to charge
 * My milkshake brings all the boys to the yard
 * And they're like, it's better than yours
 * Damn right it's better than yours
 * I can teach you, but I have to charge
 * </p>
 * @author trebek
 */
@Api
@Entity
public class Book {
/**
 *
 * @param  id the number according to not Dewey Decimal himself
 * @param  title Description of the text text text.          (3)
 * @return it's a book.  a book object.
 *
 *
 **/
 @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;
		/**
		 * Constructor that's empty.  Required for Hibernate
		 */
    public Book() {
    }
    /**
     * Constructor with title as an argument
     * @param title the title for this book
     */
    public Book(String title) {
        this.title = title;
    }
    /**
     * Id of type Long
     */
    public Long getId() {
        return id;
    }

    /**
     * Id of type Long
		 * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Title of type String
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title of a book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Produces String format of book properties
     */
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
