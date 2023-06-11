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
 */

package ch.andre601.advancedserverlist.api.bukkit.objects;

import ch.andre601.advancedserverlist.api.objects.GenericPlayer;
import org.bukkit.OfflinePlayer;

/**
 * {@link GenericPlayer GenericPlayer instance} for the SpigotMC/Paper server implementation of AdvancedServerList.
 * <br>This interface includes a {@link #getPlayer() OfflinePlayer instance} obtained from the server the plugin
 * runs on alongside some getters to get if the player {@link #hasPlayedBefore() has played on the server before},
 * {@link #isBanned() is banned} or {@link #isWhitelisted() is whitelisted}. These options actually require a proper
 * OfflinePlayer instance to be present or will otherwise default to {@code false}.
 *
 * <p>This class is useful for cases where you want to use the OfflinePlayer. Simply cast the GenericPlayer
 * instance to a SpigotPlayer (Granted that it actually is an instance of it to begin with).
 */
public interface BukkitPlayer extends GenericPlayer{
    /**
     * Gives the OfflinePlayer embedded in this PaperPlayer instance.
     *
     * @return OfflinePlayer instance.
     */
    OfflinePlayer getPlayer();
    
    /**
     * Returns whether this player has played on the Server before.
     *
     * <p>The returned boolean may be inaccurate if AdvancedServerList was unable to obtain a valid OfflinePlayer instance.
     *
     * @return Boolean indicating whether this player has played on this Server before.
     */
    boolean hasPlayedBefore();
    
    /**
     * Returns whether this player is banned on the server.
     *
     * <p>The returned boolean may be inaccurate if AdvancedServerList was unable to obtain a valid OfflinePlayer instance.
     *
     * @return Boolean indicating whether this player was banned from the server.
     */
    boolean isBanned();
    
    /**
     * Returns whether this player is whitelisted on the server.
     *
     * <p>The returned boolean may be inaccurate if AdvancedServerList was unable to obtain a valid OfflinePlayer instance.
     *
     * @return Boolean indicating whether this player was banned from the server.
     */
    boolean isWhitelisted();
}
