package org.horizoncolumbus.hs;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main2 {

    public static void main(String[] args) {
        // write your code here


        String[] yes = new String[3];

        yes[0] = "https://classroom.google.com/u/0/h";
        yes[1] = "https://zoom.us/signin";
        yes[2] = "https://www.youtube.com/watch?v=s49CT4DTAkw";

        for (int i = 0; i < yes.length; i++) {
            try{
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURL = new URI(yes[i]);
                desktop.browse(oURL);
            } catch (URISyntaxException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
