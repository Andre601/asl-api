/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Andre_601
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

package ch.andre601.advancedserverlist.api.ban;

import ch.andre601.advancedserverlist.api.objects.GenericPlayer;

/**
 * Interface used for a unified frontend to allow easier support with various Punishment plugins, to have a more unified
 * way of retrieving information.
 * 
 * <p>This interface is mostly used by addons for AdvancedServerList, which provide extra placeholders for various
 * Punishment plugins.
 */
public interface PunishmentProvider{
    
    /**
     * Whether the Player was muted or not.
     * 
     * @param  player
     *         The player to use for the check.
     * 
     * @return True should the player be muted, false otherwise.
     */
    boolean isMuted(GenericPlayer player);
    
    /**
     * Whether the Player was banned or not.
     *
     * @param  player
     *         The player to use for the check.
     * 
     * @return True should the player be banned, false otherwise
     */
    boolean isBanned(GenericPlayer player);
    
    /**
     * The reason for the player's mute. May return null if no mute is present.
     * 
     * @param  player
     *         The Player to get the mute reason for.
     * 
     * @return Possibly-null String containing the mute reason.
     */
    String getMuteReason(GenericPlayer player);
    
    /**
     * The reason for the player's ban. May return null if no ban is present.
     *
     * @param  player
     *         The Player to get the ban reason for.
     *
     * @return Possibly-null String containing the ban reason.
     */
    String getBanReason(GenericPlayer player);
    
    /**
     * The duration of how long the player stays muted. Depending on the Punishment plugin may this value be relative
     * to the current time.
     * <br>May be null should no mute be present.
     *
     * @param  player
     *         The Player to get the mute duration for.
     *
     * @return Possibly-null String containing the duration of the Player's mute.
     */
    String getMuteDuration(GenericPlayer player);
    
    /**
     * The duration of how long the player stays banned. Depending on the Punishment plugin may this value be relative
     * to the current time.
     * <br>May be null should no ban be present.
     *
     * @param  player
     *         The Player to get the ban duration for.
     *
     * @return Possibly-null String containing the duration of the Player's ban.
     */
    String getBanDuration(GenericPlayer player);
}
