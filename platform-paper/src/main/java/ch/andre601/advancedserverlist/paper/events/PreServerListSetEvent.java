/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Andre_601
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package ch.andre601.advancedserverlist.paper.events;

import ch.andre601.advancedserverlist.api.exceptions.UnsupportedAPIAccessException;
import ch.andre601.advancedserverlist.api.profiles.ProfileEntry;
import ch.andre601.advancedserverlist.api.events.GenericServerListEvent;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Called <b>before</b> AdvancedServerList modifies the server list.
 * <br>The provided {@link #getEntry() ProfileEntry} will be the one used for the server list.
 */
public class PreServerListSetEvent extends Event implements GenericServerListEvent, Cancellable{
    
    public PreServerListSetEvent(ProfileEntry entry){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * Gets the {@link ProfileEntry} currently set.
     *
     * @return The currently set {@link ProfileEntry}
     */
    @Override
    public ProfileEntry getEntry(){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * Sets the new {@link ProfileEntry} to use.
     * <br>This may not be {@code null}.
     *
     * @param entry
     *        The new {@link ProfileEntry} to use.
     *
     * @throws IllegalArgumentException
     *         When the provided ProfileEntry is null.
     */
    @Override
    public void setEntry(ProfileEntry entry){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * Returns whether this event has been cancelled or not.
     *
     * @return Whether the event has been cancelled or not.
     */
    @Override
    public boolean isCancelled(){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * Sets the event's cancel state.
     *
     * @param cancelled
     *        Boolean to set the event's cancelled state.
     */
    @Override
    public void setCancelled(boolean cancelled){
        throw new UnsupportedAPIAccessException();
    }
    
    @Override
    public @NotNull HandlerList getHandlers(){
        throw new UnsupportedAPIAccessException();
    }
}
