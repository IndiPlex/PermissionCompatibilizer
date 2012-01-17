/*
 * PermissionCompatibilizer
 * Copyright (C) 2012 IndiPlex
 * 
 * PermissionCompatibilizer is free software: you can redistribute it and/or modify
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
import ru.tehkode.permissions.bukkit.PermissionsEx;

/**
 *
 * @author IndiPlex <Cartan12@indiplex.de>
 */
public class PP_PermissionsEx extends PermPlugin {
    
    private PermissionsEx pex;

    @Override
    public void setPlugin(Plugin p) {
        pex = (PermissionsEx) p;
    }
    
    @Override
    public boolean has(String world, Player player, String perm) {
        return pex.has(player, perm, world);
    }

    @Override
    public String getName() {
        return "PEX";
    }
    
}
