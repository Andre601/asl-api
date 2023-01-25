package ch.andre601.advancedserverlist.bungeecord.objects;

import ch.andre601.advancedserverlist.api.exceptions.UnsupportedAPIAccessException;
import ch.andre601.advancedserverlist.api.objects.GenericPlayer;
import ch.andre601.advancedserverlist.core.objects.CachedPlayer;

/**
 * {@link GenericPlayer GenericPlayer instance} for the Velocity proxy implementation of AdvancedServerList.
 *
 * <p>To get an instance of this class from a GenericPlayer instance, simply cast it to a VelocityPlayer (Granted that
 * the GenericPlayer instance actually is a VelocityPlayer instance).
 */
public class BungeePlayer extends GenericPlayer{
    
    public BungeePlayer(CachedPlayer player, int protocol){
        throw new UnsupportedAPIAccessException();
    }
}
