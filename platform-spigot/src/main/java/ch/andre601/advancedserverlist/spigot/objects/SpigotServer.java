package ch.andre601.advancedserverlist.spigot.objects;

import ch.andre601.advancedserverlist.api.objects.GenericServer;
import org.bukkit.World;

import java.util.Map;

public interface SpigotServer extends GenericServer{
    Map<String, World> getWorlds();
}
