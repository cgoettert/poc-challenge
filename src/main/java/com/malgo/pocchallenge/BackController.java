package com.malgo.pocchallenge;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackController {

    @PostMapping("/api/data")
    public ResponseEntity<SomeData> someData() {
        return ResponseEntity.ok(new SomeData());
    }

}
