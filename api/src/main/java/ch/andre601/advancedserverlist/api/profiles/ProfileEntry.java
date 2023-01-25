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

package ch.andre601.advancedserverlist.api.profiles;

import ch.andre601.advancedserverlist.api.exceptions.UnsupportedAPIAccessException;
import ch.andre601.advancedserverlist.api.objects.NullBool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class represents the content found in a server list profile YAML file.
 * <br>The content may come from either the "profiles" list, the options in the file itself (global options) or a
 * mix of both.
 *
 * <p>This class is immutable. Use {@link #copy() copy()} to get a {@link Builder Builder instance} with the values
 * of this class added.
 */
public class ProfileEntry{
    
    /**
     * Creates a new instance of a ProfileEntry with the given values.
     *
     * @param motd
     *        The MOTD to use.
     * @param players
     *        The players (lines) to show in the hover.
     * @param playerCountText
     *        The text to display instead of the player count.
     * @param favicon
     *        The favicon to use.
     * @param hidePlayersEnabled
     *        Whether player count should be hidden.
     * @param extraPlayersEnabled
     *        Whether the extra players option should be enabled.
     * @param extraPlayersCount
     *        The number to add to the online players for the extra players.
     */
    public ProfileEntry(List<String> motd, List<String> players, String playerCountText, String favicon,
                        NullBool hidePlayersEnabled, NullBool extraPlayersEnabled, Integer extraPlayersCount){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * Creates an "empty" PlayerEntry with the following values set:
     * <ul>
     *     <li>{@link #getMotd() motd}: Empty List</li>
     *     <li>{@link #getPlayers() players}: Empty List</li>
     *     <li>{@link #getPlayerCountText() playerCountText}: Empty String</li>
     *     <li>{@link #getFavicon() favicon}: Empty String</li>
     *     <li>{@link #isHidePlayersEnabled() hidePlayersEnabled}: {@link NullBool#NULL NullBool.NULL}</li>
     *     <li>{@link #isExtraPlayersEnabled() extraPlayersEnabled}: {@link NullBool#NULL NullBool.NULL}</li>
     *     <li>{@link #getExtraPlayersCount() extraPlayersCount}: 0</li>
     * </ul>
     *
     * @return New ProfileEntry instance with empty/null values defined.
     */
    public static ProfileEntry empty(){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * Creates a {@link Builder Builder instance} with the values from this ProfileEntry set.
     * <br>Use this method if you would like to modify the ProfileEntry.
     *
     * @return A new {@link Builder Builder instance} with the values of this ProfileEntry set.
     */
    public Builder copy(){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * Gets the currently set MOTD of this ProfileEntry.
     *
     * @return The current MOTD used by this ProfileEntry.
     */
    public List<String> getMotd(){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * Gets the currently set list of players of this ProfileEntry.
     *
     * @return The current list of players used by this ProfileEntry.
     */
    public List<String> getPlayers(){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * Gets the currently set player count text of this ProfileEntry.
     *
     * @return The current player count text used by this ProfileEntry.
     */
    public String getPlayerCountText(){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * Gets the currently set favicon of this ProfileEntry.
     * <br>Note that the favicon usually is and supports one of the following options:
     * <ul>
     *     <li>URL to a valid PNG file</li>
     *     <li>File name (With .png extension) matching a file saved in the favicons folder of AdvancedServerList</li>
     *     <li>{@code ${player uuid}} to display the avatar of the player.</li>
     * </ul>
     *
     * @return The current favicon used by this ProfileEntry.
     */
    public String getFavicon(){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * Whether the player count should be hidden or not.
     * <br>To get the actual boolean value, use {@link NullBool#getOrDefault(boolean) getValue(boolean)}.
     *
     * @return Whether the player count should be hidden or not.
     */
    public NullBool isHidePlayersEnabled(){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * Whether the extra players feature should be used or not.
     * <br>To get the actual boolean value, use {@link NullBool#getOrDefault(boolean) getValue(boolean)}.
     *
     * @return Whether the extra players feature should be used or not.
     */
    public NullBool isExtraPlayersEnabled(){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * Gets the currently set number of extra players of this ProfileEntry.
     *
     * @return The current number of extra players used by this ProfileEntry.
     */
    public Integer getExtraPlayersCount(){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * Whether this ProfileEntry is invalid or not.
     * <br>The ProfileEntry is considered invalid if all the following is true:
     * <ul>
     *     <li>{@link #getMotd() motd} is empty</li>
     *     <li>{@link #getPlayers() players} is empty</li>
     *     <li>{@link #getPlayerCountText() playerCountText} is null/empty <b>and</b> {@link #isHidePlayersEnabled() hidePlayersEnabled} is false</li>
     *     <li>{@link #getFavicon() favicon} is null/empty</li>
     * </ul>
     * As long as one of the above is <b>not</b> true is this ProfileEntry considered valid.
     *
     * @return The current MOTD used by this ProfileEntry.
     */
    public boolean isInvalid(){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * Builder class to create a new {@link ProfileEntry ProfileEntry instance}.
     */
    public static class Builder{
        
        public Builder(){}
        
        /**
         * Sets a new MOTD to use.
         *
         * <p>Set to an empty list to not change the MOTD.
         * <br>The provided list cannot be null. Lists with more than 2 entries will be cut down.
         *
         * @param  motd
         *         The MOTD to use.
         *
         * @return This Builder after the motd has been set. Useful for chaining.
         *
         * @throws IllegalArgumentException
         *         When the provided list is null.
         */
        public Builder setMotd(List<String> motd){
            throw new UnsupportedAPIAccessException();
        }
        
        /**
         * Sets the players (lines) to use for the hover.
         *
         * <p>Set to an empty list to not change the hover text.
         * <br>The provided list cannot be null.
         *
         * @param  players
         *         The lines to set for the hover.
         *
         * @return This Builder after the players have been set. Useful for chaining.
         *
         * @throws IllegalArgumentException
         *         When the provided list is null.
         */
        public Builder setPlayers(List<String> players){
            throw new UnsupportedAPIAccessException();
        }
        
        /**
         * Sets the text to override the player count with.
         *
         * <p>Set to {@code null} to not change the player count text.
         *
         * @param  playerCountText
         *         The text to show in the player count.
         *
         * @return This Builder after the player count text has been set. Useful for chaining.
         */
        public Builder setPlayerCountText(String playerCountText){
            throw new UnsupportedAPIAccessException();
        }
        
        /**
         * Sets the value to use for the favicon.
         * <br>The following values are supported:
         * <ul>
         *     <li>URL to a valid PNG file</li>
         *     <li>File name (With .png extension) matching a file saved in the favicons folder of AdvancedServerList</li>
         *     <li>{@code ${player uuid}} to display the avatar of the player.</li>
         * </ul>
         *
         * <p>Set to {@code null} to not change the favicon.
         *
         * @param  favicon
         *         The favicon to use.
         *
         * @return This Builder after the favicon has been set. Useful for chaining.
         */
        public Builder setFavicon(String favicon){
            throw new UnsupportedAPIAccessException();
        }
        
        /**
         * Sets whether the player count should be hidden or not.
         *
         * <p>Set to {@link NullBool#NULL NullBool.NULL} to not set this.
         *
         * @param  hidePlayersEnabled
         *         Whether the player count should be hidden or not.
         *
         * @return This Builder after the NullBool has been set. Useful for chaining.
         */
        public Builder setHidePlayersEnabled(NullBool hidePlayersEnabled){
            throw new UnsupportedAPIAccessException();
        }
        
        /**
         * Sets whether the extra players feature should be enabled.
         *
         * <p>Set to {@link NullBool#NULL NullBool.NULL} to not set this.
         *
         * @param  extraPlayersEnabled
         *         Whether the extra players feature should be enabled or not.
         *
         * @return This Builder after the NullBool has been set. Useful for chaining.
         */
        public Builder setExtraPlayersEnabled(NullBool extraPlayersEnabled){
            throw new UnsupportedAPIAccessException();
        }
        
        /**
         * Sets the number of players to add to the online players to use as the new max players.
         * <br>This option has no effect when {@link #isExtraPlayersEnabled() isExtraPlayersEnabled} is set to {@code false}.
         *
         * @param  extraPlayersCount
         *         The number of extra players to add.
         *
         * @return This Builder after the extra player count has been set. Useful for chaining.
         */
        public Builder setExtraPlayerCount(Integer extraPlayersCount){
            throw new UnsupportedAPIAccessException();
        }
        
        /**
         * Creates a new {@link ProfileEntry ProfileEntry instance} with the values set in this Builder.
         *
         * @return New {@link ProfileEntry ProfileEntry instance}.
         */
        public ProfileEntry build(){
            throw new UnsupportedAPIAccessException();
        }
    }
}
