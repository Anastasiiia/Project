/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raceSystem.command;

import javax.servlet.http.HttpServletRequest;
import raceSystem.resource.ConfigurationManager;

/**
 *
 * @author Пазинич
 */
public class EmptyCommand implements ActionCommand {

    @Override
    public String execute(HttpServletRequest request) {
        String page = ConfigurationManager.getProperty("path.page.index");
        return page;
    }
}
