package com.malgo.pocchallenge;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackController {

    @GetMapping("/api/data")
    public ResponseEntity<SomeData> someData() {
        return ResponseEntity.ok(new SomeData());
    }

}
