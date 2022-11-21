package controller;

import entities.Card;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class cardController {

    @PostMapping("/card/setCard")
    public ResponseEntity<Card> setCard(@RequestBody Card card){
        System.out.println(card);
        return new ResponseEntity<>(card, HttpStatus.OK);
    }
}
