package com.learnswagger.handler;

import com.learnswagger.BookNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpHeaders;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<Object> handleBookNotFoundException(
            BookNotFoundException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Book not found");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }

    /**
     * NOTE: returning a string does not work!
     * Will work if add annotation @ResponseBody.
     */
//    @ExceptionHandler(BookNotFoundException.class)
//    public String handleBookNotFoundException(
//            Exception ex, WebRequest request) {
//
//
//
//        return "The exceptionL:" + ex.getMessage();
//    }

//    @ExceptionHandler(BookNotFoundException.class)
//    public  ResponseEntity<Object> handle404(Exception e) {
//
//        Map<String, Object> body = new LinkedHashMap<>();
//        body.put("timestamp", LocalDateTime.now());
//        body.put("message", "Book not found");
//
//        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
//
//    }


//
//    @ExceptionHandler
//    public  String handlerBNF(BookNotFoundException e) {
//
//        return "Boom not foudn!";
//
//    }

}
