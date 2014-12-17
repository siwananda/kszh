package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.home;

/**
 * All user related controller
 * kszh = Krazeh Spizeh
 * By: W, R, H
 * Date: 17/12/2014
 * Time: 9:57 PM
 * Class Name: UserController
 */
public class UserController extends Controller {

    public static Result authenticate() {
        return ok(home.render("authenticated"));
    }

    public static Result createUser() {
        return ok(home.render("user created"));
    }

    public static Result updateUser() {
        return ok(home.render("user updated"));
    }

    public static Result deleteUser() {
        return ok(home.render("user deleted"));
    }
}
