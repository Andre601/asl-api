package ch.andre601.advancedserverlist.velocity.objects;

import ch.andre601.advancedserverlist.api.objects.GenericServer;
import com.velocitypowered.api.proxy.server.RegisteredServer;

import java.util.Map;

public interface VelocityProxy extends GenericServer{
    /**
     * Returns a Map&lt;String, RegisteredServer&gt; where the key is the name of the Server and the value the
     * RegisteredServer from the Velocity Proxy.
     *
     * @return Possibly-empty Map containing a Server name and RegisteredServer instance.
     */
    Map<String, RegisteredServer> getServers();
}
