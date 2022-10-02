package cz.czechitas.java2webapps.ukol2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class QuoteGeneratorController {

    private final Random random = new Random();

    @GetMapping("/")
    public ModelAndView generateQuote() {
        int nahodneCislo = random.nextInt(7);
        String[] citaty = {
                "A user interface is like a joke. If you have to explain it, it's not that good.",
                "To replace programmers with robots, clients will have to accurately describe what they want. We're safe.",
                "99 little bugs in the code, 99 bugs in the code. Take one down, patch it around. 127 little bugs in the code…",
                "When I wrote this code, only God & I understood what it did. Now… Only God knows.",
                "Real programmers count from 0.",
                "I have a joke on programming but it only works on my computer.",
                "Programmer (noun.): A machine that turns coffee into code.",
        };

        String[] foto = {
                "/images/andrei-r-popescu-sV2Y2jhTFjs-unsplash.jpg",
                "/images/emilio-garcia-PRrkpoDu_Jo-unsplash.jpg",
                "/images/kellen-riggin-zlTV00XYPro-unsplash.jpg",
                "/images/mariola-grobelska-tJAT4asDOfw-unsplash.jpg",
                "/images/martin-bennie-E_jl05LFqHc-unsplash.jpg",
                "/images/matt-drenth-oeeyl50-ghw-unsplash.jpg",
                "/images/op23-5efR4mM5Nlk-unsplash.jpg",
        };

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("citat", citaty[nahodneCislo]);
        modelAndView.addObject("picture", foto[nahodneCislo]);
        return  modelAndView;
    }
}
