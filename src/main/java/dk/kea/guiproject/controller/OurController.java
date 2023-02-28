package dk.kea.guiproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OurController
{
    @GetMapping("/forside")
    public String ourFood()
    {
        return "madspild";
    }

    @GetMapping("/info")
    public String ourInfo()
    {
        return "info";
    }

    @GetMapping("/tips")
    public String ourTips()
    {
        return "tips";
    }
}
