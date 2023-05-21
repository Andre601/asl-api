package ch.andre601.advancedserverlist.bungeecord.objects;

import ch.andre601.advancedserverlist.api.objects.GenericServer;
import net.md_5.bungee.api.config.ServerInfo;

import java.util.Map;

public interface BungeeProxy extends GenericServer{
    /**
     * Returns a Map&lt;String, ServerInfo&gt; where the key is the name of the Server and the value the ServerInfo from
     * the BungeeCord Proxy.
     *
     * @return Possibly-empty Map containing a Server name and ServerInfo instance.
     */
    Map<String, ServerInfo> getServers();
}
