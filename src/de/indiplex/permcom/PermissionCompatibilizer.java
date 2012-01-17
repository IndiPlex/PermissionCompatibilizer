/*
 * PermissionCompatibilizer
 * Copyright (C) 2011 IndiPlex
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.indiplex.permcom;

import de.indiplex.manager.IPMAPI;
import de.indiplex.manager.IPMPlugin;

/**
 *
 * @author IndiPlex <kahabrakh@indiplex.de>
 */
public class PermissionCompatibilizer extends IPMPlugin {
    
    public static final String pre = "[PeCo] ";
    private PermComAPI pcApi;

    @Override
    public void onDisable() {
        printDisabled(pre);
    }

    @Override
    public void onEnable() {
        IPMAPI api = getAPI();
        
        pcApi = new PermComAPI();
        log.info(pre+"Using "+pcApi.getPermPluginName()+" for permissions");
        api.registerAPI("PermCom", pcApi);
        
        printEnabled(pre);
    }
    
}
