package first.blog.firstblog.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class HtmlController {

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Blog"
        return "blog"
    }

    @GetMapping("/blog/details/{id}")
    fun edit(model: Model, @PathVariable("id") id:String): String {
        model["title"] = "Blog content - $id"
        return "blog"
    }

}