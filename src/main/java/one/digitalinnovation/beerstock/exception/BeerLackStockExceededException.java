package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerLackStockExceededException extends Exception {

    public BeerLackStockExceededException(Long id) {
        super(String.format("Beers with %s ID to decrement informed exceeds the capacity of beers", id));
    }
}
