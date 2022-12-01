package sesac.mohaji.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sesac.mohaji.domain.User;
import sesac.mohaji.dto.UserDTO;
import sesac.mohaji.service.UserService;

@Controller
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    @PostMapping("/idCheck")
    @ResponseBody
    public String idcheck(@RequestBody UserDTO userDTO) {
        String id = userDTO.getId();
        System.out.println(id);
        System.out.println(userService.idcheck(id));
//        userService.idcheck(id);
        return "true";
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
