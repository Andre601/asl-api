package ch.andre601.advancedserverlist.bungeecord.objects;

import ch.andre601.advancedserverlist.api.objects.GenericServer;
import net.md_5.bungee.api.config.ServerInfo;

import java.util.Map;

public interface BungeeProxy extends GenericServer{
    Map<String, ServerInfo> getServers();
}
