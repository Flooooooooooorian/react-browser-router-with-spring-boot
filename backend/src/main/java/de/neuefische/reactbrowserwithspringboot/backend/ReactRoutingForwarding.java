package de.neuefische.reactbrowserwithspringboot.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReactRoutingForwarding {

    @RequestMapping(value={"{path:^(?!index\\.html|api|static).*$}/**"})
    public String forwardToRoutUrl() {
        return "forward:/";
    }
}