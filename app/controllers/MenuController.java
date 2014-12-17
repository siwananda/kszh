package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.home;

/**
 * Menu / Food related activities are here!
 * kszh = Krazeh Spizeh
 * By: W, R, H
 * Date: 17/12/2014
 * Time: 10:04 PM
 * Class Name: MenuController
 */
public class MenuController extends Controller {

    public static Result getTopTenSpiciestFood() {
        return ok(home.render("return top 10 spiciest food"));
    }

    public static Result uploadPhoto() {
        return ok(home.render("photo uploaded"));
    }

    public static Result rateSpiciness() {
        return ok(home.render("that's a great info"));
    }
}
