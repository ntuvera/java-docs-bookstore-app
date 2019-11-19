package co.ga.bookstore;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface BookRepository extends CrudRepository<Book, Long> {

    @RestResource(path = "byTitle")
    List<Book> findByTitleIgnoreCaseContaining( @ApiParam(value = "selects book with keyword in title", required = true) @Param("q") String q);

    @Override
    @ApiOperation(value = "Removes a pet from existence",
            notes = "Just pass the ID bro jared@pp.com",
            response = Book.class,
            responseContainer = "List")
    @RestResource
    void delete(Book book);


    @Override
    @RestResource(exported = false)
    Book save(Book book);
}

