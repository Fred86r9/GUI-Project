package dk.kea.guiproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OurController
{
    @GetMapping
    public String ourFood()
    {
        return "madspild";
    }
}
