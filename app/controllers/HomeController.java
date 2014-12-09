package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.home;
import views.html.index;

/**
 * Created by siwananda on 12/8/2014.
 */
public class HomeController extends Controller {

    public static Result index() {
        return ok(home.render("Your new application is ready."));
    }

}
