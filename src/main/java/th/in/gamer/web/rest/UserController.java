package th.in.gamer.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.in.gamer.domain.UserEntity;
import th.in.gamer.service.UserService;
import th.in.gamer.web.dto.UserDTO;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/users")
    public List<UserDTO> indexAction() {
        return userService.findAll();
    }

    @RequestMapping(
            value = "/users/{id}"
    )
    public UserDTO showAction(@PathVariable("id") int id) {
        return userService.findById(id);
    }

    @RequestMapping(
            value = "/users",
            method = RequestMethod.POST
    )
    public UserDTO createAction(@RequestParam UserDTO user) {
        boolean isSaved = userService.saveUser(user);

        return null;
    }

    @RequestMapping(
            value = "/users/{id}",
            method = RequestMethod.PUT
    )
    public UserDTO updateAction(@RequestParam UserDTO user) {
        return userService.updateUser(user);
    }

    @RequestMapping(
            value = "/users/{id}",
            method = RequestMethod.DELETE
    )
    public UserDTO deleteAction(@PathVariable("id") int id) {
        boolean isUpdated = userService.deleteById(id);
        return null;
    }
}