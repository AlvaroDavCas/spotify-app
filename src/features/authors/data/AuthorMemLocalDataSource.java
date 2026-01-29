package features.authors.data;

import features.authors.domain.Authors;

import java.util.ArrayList;

public class AuthorMemLocalDataSource {

    public ArrayList<Author> authorsMemStorage;

    public ArrayList<Author> findAll(){
        Author author1 = new Author();
        authorsMemStorage.add(author1);
        Author author2 = new Author();
        authorsMemStorage.add(author2);

        return authorsMemStorage;
    }
}
