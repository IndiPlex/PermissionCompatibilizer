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
package de.indiplex.permcom.plugins;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

/**
 *
 * @author IndiPlex <Cartan12@indiplex.de>
 */
public abstract class PermPlugin {
    public abstract boolean has(String world, Player player, String perm);
    public abstract String getName();
    public abstract void setPlugin(Plugin p);

    public PermPlugin() {
    }    
    
    public static <T extends PermPlugin> T getPermPlugin(String name) {
        try {
            Class<T> clazz = (Class<T>) Class.forName("de.indiplex.permcom.plugins.PP_"+name);
            return clazz.newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
