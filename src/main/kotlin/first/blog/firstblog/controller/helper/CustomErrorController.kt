package first.blog.firstblog.controller.helper

import jakarta.servlet.http.HttpServletRequest
import org.springframework.boot.web.servlet.error.ErrorController
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class CustomErrorController : ErrorController {
    @RequestMapping("/error")
    @ResponseBody
    fun error(request: HttpServletRequest?): HttpServletRequest? {
        return request
    }

    val errorPath: String
        get() = "/error"
}