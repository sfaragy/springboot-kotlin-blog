package first.blog.firstblog.controller

//import org.springframework.ui.Model
//import org.springframework.ui.set
//import org.springframework.web.bind.annotation.RequestMapping
//import org.springframework.web.bind.annotation.RestController
//
//@RestController
//class HtmlController {
//
//    @RequestMapping("/")
//    fun blog(model: Model): String {
//        model["title"] = "Blog"
//        return "blog"
//    }
//
//}

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Blog"
        return "blog"
    }

}