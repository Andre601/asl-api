package ch.andre601.advancedserverlist.bungeecord.objects;

import ch.andre601.advancedserverlist.api.objects.GenericPlayer;
import ch.andre601.advancedserverlist.core.objects.CachedPlayer;

public class BungeePlayer extends GenericPlayer{
    
    public BungeePlayer(CachedPlayer player, int protocol){
        this.name = player.getName();
        this.protocol = protocol;
        this.uuid = player.getUuid();
    }
}
