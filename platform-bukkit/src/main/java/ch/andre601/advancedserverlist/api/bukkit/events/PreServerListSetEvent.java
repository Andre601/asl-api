package ch.andre601.advancedserverlist.api.bukkit.events;


import ch.andre601.advancedserverlist.api.events.GenericServerListEvent;
import ch.andre601.advancedserverlist.api.internal.CheckUtil;
import ch.andre601.advancedserverlist.api.profiles.ProfileEntry;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called <b>before</b> AdvancedServerList modifies the server list.
 * <br>The provided {@link #getEntry() ProfileEntry} will be the one used for the server list.
 */
public abstract class PreServerListSetEvent extends Event implements GenericServerListEvent, Cancellable{
    
    private static final HandlerList HANDLERS = new HandlerList();
    
    private ProfileEntry entry;
    private boolean cancelled;
    
    public PreServerListSetEvent(ProfileEntry entry){
        super(true);
        this.entry = entry;
    }
    
    public static HandlerList getHandlerList(){
        return HANDLERS;
    }
    
    /**
     * Gets the {@link ProfileEntry} currently set.
     *
     * @return The currently set {@link ProfileEntry}
     */
    @Override
    public ProfileEntry getEntry(){
        return entry;
    }
    
    /**
     * Sets the new {@link ProfileEntry} to use.
     * <br>This may not be {@code null}.
     *
     * <p>Note that a new copy of the entry will be made using {@link ProfileEntry#copy() ProfileEntry.copy()}.
     *
     * @param entry
     *        The new {@link ProfileEntry} to use.
     *
     * @throws IllegalArgumentException
     *         When the provided ProfileEntry is null.
     */
    @Override
    public void setEntry(ProfileEntry entry){
        CheckUtil.isNull("ProfileEntry", entry);
        
        this.entry = entry.copy();
    }
    
    /**
     * Returns whether this event has been cancelled or not.
     *
     * @return Whether the event has been cancelled or not.
     */
    @Override
    public boolean isCancelled(){
        return cancelled;
    }
    
    /**
     * Sets the event's cancel state.
     *
     * @param cancelled
     *        Boolean to set the event's cancelled state.
     */
    @Override
    public void setCancelled(boolean cancelled){
        this.cancelled = cancelled;
    }
    
    @Override
    public @NotNull HandlerList getHandlers(){
        return HANDLERS;
    }
}
