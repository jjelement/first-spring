package th.in.gamer.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class UserController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Index";
    }
}
