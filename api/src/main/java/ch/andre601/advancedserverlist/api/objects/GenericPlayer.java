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

package ch.andre601.advancedserverlist.api.objects;

import java.util.UUID;

/**
 * A basic abstract class used to store generic player data with to use in placeholder resolving.
 * <br>The different variants of AdvancedServerList extend their own class with this one and may or may not use all values
 * available here.
 *
 * <p>The following values will always be present, no matter the platform this class is used on:
 * <ul>
 *     <li>{@link #getName() Name of Player}</li>
 *     <li>{@link #getProtocol() Protocol version of Player}</li>
 *     <li>{@link #getUUID() UUID of Player}</li>
 * </ul>
 * Any other value is not guaranteed to be accurate or even be set.
 */
public interface GenericPlayer{
    
    /**
     * Returns the name of the player.
     * <br>Note that on Spigot, Paper and other forks can the name differ from the one cached by AdvancedServerList,
     * if the plugin was able to retrieve an OfflinePlayer instance from the server. On BungeeCord and Velocity will
     * the returned String always be the name from the cache.
     *
     * <p>Name may be whatever has been defined in AdvancedServerList's config.yml, should the player not be cached yet
     * by AdvancedServerList.
     *
     * @return String representing the player's name.
     */
    String getName();
    
    /**
     * Returns the protocol ID the player is using. The protocol ID is an integer used by Minecraft to determine what
     * version a server or client is running.
     *
     * @return Integer representing the protocol version of this player.
     */
    int getProtocol();
    
    /**
     * Returns the Unique ID associated with this player.
     *
     * <p>UUID may be whatever has been defined in AdvancedServerList's config.yml, should the player not be cached yet
     * by AdvancedServerList.
     *
     * @return UUID of the player.
     */
    UUID getUUID();
}
