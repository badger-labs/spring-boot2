package eu.badgerlabs.springboot2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String greeting(@RequestParam(required = false, defaultValue = "") String name)
    {
        return "".equals(name) ? "Hey!" : "Hey " + name + "!";
    }
}
