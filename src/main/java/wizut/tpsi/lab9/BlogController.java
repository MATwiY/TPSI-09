package wizut.tpsi.lab9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    @RequestMapping("/")
    public String Home(Model model){
        List<BlogPost> posts;
        posts = blogRepository.getAllPosts();

        model.addAttribute("posts", posts);

        return "index";
    }

    @PostMapping("/newpost")
    public String newPost(BlogPost post) throws SQLException{
        blogRepository.createPost(post);
        return "redirect:/";
    }

//    @GetMapping("/delete")
//    public String delPost(BlogPost post) throws SQLException{
//        System.out.print(post.id);
//        blogRepository.deletePost(post);
//        return "redirect:/";
//    }
        @GetMapping("/delete/{id}")
        public String delPost(@PathVariable("id") Long id) throws SQLException{

            System.out.print(id);
            blogRepository.deletePost(id);
            return "redirect:/";
        }
}
