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
public class PP_Default extends PermPlugin {

    public PP_Default() {
    }         

    @Override
    public boolean has(String world, Player player, String perm) {
        return player.hasPermission(perm);
    }

    @Override
    public String getName() {
        return "SuperPerms";
    }

    @Override
    public void setPlugin(Plugin p) {        
    }
    
}
