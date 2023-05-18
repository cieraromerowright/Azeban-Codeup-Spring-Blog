package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class PostController {
    @GetMapping
    @ResponseBody
    public String getPosts() {
        return "Posts index page";
    }
    @GetMapping("/{id}")
    @ResponseBody
    public String viewPost(@PathVariable long id) {
        return "Viewing post with ID: " + id;
    }
    @GetMapping("posts/create")
    @ResponseBody
    public String create() {
        return "Viewing the form for creating a post";
    }
    @PostMapping("/create")
    @ResponseBody
    public String createPost() {
        return "Create a new post";
    }
}