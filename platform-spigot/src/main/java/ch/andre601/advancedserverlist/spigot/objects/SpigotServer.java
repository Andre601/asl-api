package ch.andre601.advancedserverlist.spigot.objects;

import ch.andre601.advancedserverlist.api.objects.GenericServer;
import org.bukkit.World;

import java.util.Map;

/**
 * @deprecated Use the platform-bukkit API instead.
 */
public interface SpigotServer extends GenericServer{
    /**
     * Returns a Map&lt;String, World&gt; where the key is the name of the World and the value the World of the Server.
     * 
     * @return Possibly-empty Map containing a world name and World instance.
     */
    Map<String, World> getWorlds();
}
