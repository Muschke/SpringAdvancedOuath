package be.vdab.ouath.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/beveiligd")
class BeveiligdeController {
    @GetMapping
    /*Als de user een request doet om beveiligd te zien, moet hij ingelogd zijn op git. die connectie is
    * in onze application property */
    public ModelAndView securedPage(@AuthenticationPrincipal OAuth2User user) {
        return new ModelAndView("beveiligd", "gebruikersNaam", user.getAttribute("login"));
    }
}
