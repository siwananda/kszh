package utils;

import play.Play;

/**
 * kszh = Krazeh Spizeh
 * By: W, R, H
 * Date: 11/12/2014
 * Time: 8:58 PM
 * Class Name: Constants
 */
public class Constants {

    public static final String APPLICATION_NAME = Play.application().configuration().getString("application.name");
}
