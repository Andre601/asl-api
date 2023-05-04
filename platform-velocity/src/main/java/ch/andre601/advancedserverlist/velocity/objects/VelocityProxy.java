package ch.andre601.advancedserverlist.velocity.objects;

import ch.andre601.advancedserverlist.api.objects.GenericServer;
import com.velocitypowered.api.proxy.server.RegisteredServer;

import java.util.Map;

public interface VelocityProxy extends GenericServer{
    Map<String, RegisteredServer> getServers();
}
