package projeto.actions.teste_pipeline.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        log.info("Hello endpoint called!");
        return ResponseEntity.ok("Hello World!");
    }
}
