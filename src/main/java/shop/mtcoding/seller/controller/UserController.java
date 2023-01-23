package shop.mtcoding.seller.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.seller.model.User;
import shop.mtcoding.seller.model.UserRepository;

@Controller
public class UserController {

    @Autowired
    HttpSession session;
    
    @Autowired
    UserRepository userRepository;

    @GetMapping("/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }

    @PostMapping("/join")
    public String join(User user) {
        userRepository.insert(user);
        return "redirect:/loginForm";
    }

    @GetMapping("/loginForm")
    public String loginForm() {
        return "user/loginForm";
    }

    @PostMapping("/login")
    public String login(User user) {
        User principal = userRepository.findByUsernameAndPwd(user);
        if (principal == null) {
            return "redirect:/notfound";
        }

        session.setAttribute("principal", principal);

        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout() {
        session.invalidate();

        return "redirect:/";
    }
}
