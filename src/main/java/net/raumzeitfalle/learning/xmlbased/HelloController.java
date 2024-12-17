package net.raumzeitfalle.learning.xmlbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Greeting greeting;

    /*
     * This produces JSON.
     */
    @GetMapping("/")
    public ResponseEntity<Greeting> index() {
        greeting.setRecipient("TheMatrix");
        return ResponseEntity.ok(greeting);
    }
    
    @GetMapping("/{username}")
    public String index(@PathVariable String username) {
        if (null == username || "".equalsIgnoreCase(username)) {
            greeting.setRecipient("<undefined>");
        } else {
            greeting.setRecipient(username);
        }
        return greeting.getMessage() + " "+greeting.getRecipient();
    }
}
