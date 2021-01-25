package ru.aratmay.springboot.webapp.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.aratmay.springboot.webapp.model.Author;
import ru.aratmay.springboot.webapp.model.Book;

import javax.validation.Valid;
import java.util.Random;

/**
 * REST controller for connected requests.
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */

@RestController
@RequestMapping("/api/v1/test-utils/")
public class BookRestControllerV1 {

    @GetMapping(value = "books/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Book> getBook(@PathVariable("id") Long bookId) {
        if (bookId == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Book book = new Book("Random Book", new Random().nextInt(8), new Author("Random Author"));

        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @RequestMapping(value = "books/update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Response> updateBook(@RequestBody @Valid Book book) {
        if (book == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(new Response("OK!"), HttpStatus.OK);
    }
}
