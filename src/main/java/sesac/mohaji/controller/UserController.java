package sesac.mohaji.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sesac.mohaji.domain.User;
import sesac.mohaji.dto.UserDTO;
import sesac.mohaji.service.UserService;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("user")
@CrossOrigin
public class UserController {

    private final UserService userService;

    @PostMapping("/idCheck")
    @ResponseBody
    public Class idcheck(@RequestBody UserDTO userDTO) {

        Map<String, Boolean> result = new HashMap<>();

        String id = userDTO.getId();
        System.out.println("id" + id);
        Optional result = userService.idcheck(id);
        System.out.println(result);
        return result;
    }

    @PostMapping("/signup")
    @ResponseBody
    public String signup(@RequestBody UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setPassword(userDTO.getPassword());
        user.setEmail(userDTO.getEmail());

        userService.signup(user);
        return "true";
    }
}
