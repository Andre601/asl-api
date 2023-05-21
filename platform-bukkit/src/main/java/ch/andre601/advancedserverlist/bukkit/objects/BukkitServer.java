package ch.andre601.advancedserverlist.bukkit.objects;

import ch.andre601.advancedserverlist.api.objects.GenericServer;
import org.bukkit.World;

import java.util.Map;

/**
 * Spigot/Paper specific instance of a {@link GenericServer GenericServer}.  
 * <br>This interface includes a {@link #getWorlds() Map of Worlds} the Server currently has.
 * 
 * <p>This interface is useful for cases where you want to get the worlds of the Server itself, by simply casting
 * your GenericServer instance to a BukkitServer one. Make sure to do proper instanceof checks first before attempting to
 * cast.
 */
public interface BukkitServer extends GenericServer{
    /**
     * Returns a Map&lt;String, World&gt; where the key is the name of the World and the value the World of the Server.
     *
     * @return Possibly-empty Map containing a world name and World instance.
     */
    Map<String, World> getWorlds();
}
