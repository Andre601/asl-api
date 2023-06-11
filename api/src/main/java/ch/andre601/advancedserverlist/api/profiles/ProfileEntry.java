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

package ch.andre601.advancedserverlist.api.profiles;

import ch.andre601.advancedserverlist.api.internal.CheckUtil;
import ch.andre601.advancedserverlist.api.objects.NullBool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This record represents the content found in a server list profile YAML file.
 * <br>The content may come from either the "profiles" list, the options in the file itself (global options) or a
 * mix of both.
 *
 * <p>This class is immutable. Use {@link #builder() builder()} to get a {@link Builder Builder instance} with the values
 * of this class added.
 */
public record ProfileEntry(List<String> motd, List<String> players, String playerCountText, String favicon,
                           NullBool hidePlayersEnabled, NullBool extraPlayersEnabled, Integer extraPlayersCount){
    
    /**
     * Creates a new instance of a ProfileEntry with the given values.
     * <br>It's recommended to use the {@link Builder Builder class} for a more convenient configuration of the settings.
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
     * 
     * @see Builder ProfileEntry.Builder
     */
    public ProfileEntry{
        CheckUtil.isNull("Motd", motd);
        CheckUtil.isNull("Players", players);
        CheckUtil.isNull("HidePlayersEnabled", hidePlayersEnabled);
        CheckUtil.isNull("ExtraPlayersEnabled", extraPlayersEnabled);
    }
    
    /**
     * Creates an "empty" PlayerEntry with the following values set:
     * <ul>
     *     <li>{@link #motd() motd}: Empty List</li>
     *     <li>{@link #players() players}: Empty List</li>
     *     <li>{@link #playerCountText() playerCountText}: Empty String</li>
     *     <li>{@link #favicon() favicon}: Empty String</li>
     *     <li>{@link #hidePlayersEnabled() hidePlayersEnabled}: {@link NullBool#NOT_SET NullBool.NOT_SET}</li>
     *     <li>{@link #extraPlayersEnabled() extraPlayersEnabled}: {@link NullBool#NOT_SET NullBool.NOT_SET}</li>
     *     <li>{@link #extraPlayersCount() extraPlayersCount}: {@code null}</li>
     * </ul>
     *
     * @return New ProfileEntry instance with empty/null values defined.
     */
    public static ProfileEntry empty(){
        return new ProfileEntry(Collections.emptyList(), Collections.emptyList(), "", "",
            NullBool.NOT_SET, NullBool.NOT_SET, null);
    }
    
    /**
     * Creates a copy of this ProfileEntry instance.
     * 
     * <p>This is simply a convenience method to not have to call {@link #builder() builder()}.{@link Builder#build() build()}:
     * <pre>{@code 
     * ProfileEntry entry = // Get entry instance
     * 
     * // Both do the same.
     * ProfileEntry newEntry1 = entry.builder().build();
     * ProfileEntry newEntry2 = entry.copy();
     * }</pre>
     * 
     * If you want to modify the ProfileEntry should {@link #builder() builder()} be preferred.
     * 
     * @return A copy of this ProfileEntry instance.
     * 
     * @see #builder() builder()
     */
    public ProfileEntry copy(){
        return this.builder().build();
    }
    
    /**
     * Creates a {@link Builder Builder instance} with the values from this ProfileEntry set.
     * <br>Use this method if you would like to modify the ProfileEntry.
     *
     * @return A new {@link Builder Builder instance} with the values of this ProfileEntry set.
     */
    public Builder builder(){
        return new Builder()
            .setMotd(motd())
            .setPlayers(players())
            .setPlayerCountText(playerCountText())
            .setFavicon(favicon())
            .setHidePlayersEnabled(hidePlayersEnabled())
            .setExtraPlayersEnabled(extraPlayersEnabled())
            .setExtraPlayerCount(extraPlayersCount());
    }
    
    /**
     * Gets the currently set MOTD of this ProfileEntry.
     *
     * @return The current MOTD used by this ProfileEntry.
     */
    @Override
    public List<String> motd(){
        return motd;
    }
    
    /**
     * Gets the currently set list of players of this ProfileEntry.
     *
     * @return The current list of players used by this ProfileEntry.
     */
    @Override
    public List<String> players(){
        return players;
    }
    
    /**
     * Gets the currently set player count text of this ProfileEntry.
     *
     * @return The current player count text used by this ProfileEntry.
     */
    @Override
    public String playerCountText(){
        return playerCountText;
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
    @Override
    public String favicon(){
        return favicon;
    }
    
    /**
     * Whether the player count should be hidden or not.
     * <br>To get the actual boolean value, use {@link NullBool#getOrDefault(boolean) getValue(boolean)}.
     *
     * @return Whether the player count should be hidden or not.
     */
    @Override
    public NullBool hidePlayersEnabled(){
        return hidePlayersEnabled;
    }
    
    /**
     * Whether the extra players feature should be used or not.
     * <br>To get the actual boolean value, use {@link NullBool#getOrDefault(boolean) getValue(boolean)}.
     *
     * @return Whether the extra players feature should be used or not.
     */
    @Override
    public NullBool extraPlayersEnabled(){
        return extraPlayersEnabled;
    }
    
    /**
     * Gets the currently set number of extra players of this ProfileEntry.
     *
     * @return The current number of extra players used by this ProfileEntry.
     */
    @Override
    public Integer extraPlayersCount(){
        return extraPlayersCount;
    }
    
    /**
     * Whether this ProfileEntry is invalid or not.
     * <br>The ProfileEntry is considered invalid if all the following is true:
     * <ul>
     *     <li>{@link #motd() motd} is empty</li>
     *     <li>{@link #players() players} is empty</li>
     *     <li>{@link #playerCountText() playerCountText} is null/empty <b>and</b> {@link #hidePlayersEnabled () hidePlayersEnabled} is false</li>
     *     <li>{@link #favicon() favicon} is null/empty</li>
     * </ul>
     * As long as one of the above is <b>not</b> true is this ProfileEntry considered valid.
     *
     * @return The current MOTD used by this ProfileEntry.
     */
    public boolean isInvalid(){
        return motd().isEmpty() &&
            players().isEmpty() &&
            ((playerCountText() == null || playerCountText().isEmpty()) && !hidePlayersEnabled().getOrDefault(false)) &&
            (favicon() == null || favicon().isEmpty());
    }
    
    /**
     * Builder class to create a new {@link ProfileEntry ProfileEntry instance}.
     */
    public static class Builder{
    
        private List<String> motd = new ArrayList<>();
        private List<String> players = new ArrayList<>();
        private String playerCountText = "";
        private String favicon = "";
        private NullBool hidePlayersEnabled = NullBool.NOT_SET;
        private NullBool extraPlayersEnabled = NullBool.NOT_SET;
        private Integer extraPlayersCount = null;
        
        public Builder(){}
        
        /**
         * Sets a new MOTD to use.
         *
         * <p>Set to an empty list to not change the MOTD.
         * <br>Only the first two entries of the list will be considered and any additional ones discarded.
         * 
         * <p>An {@link java.lang.IllegalArgumentException IllegalArgumentException} may be thrown by the
         * {@link CheckUtil CheckUtil} should the provided motd list be null.
         * 
         * @param  motd
         *         The MOTD to use.
         *
         * @return This Builder after the motd has been set. Useful for chaining.
         */
        public Builder setMotd(List<String> motd){
            CheckUtil.isNull("Motd", motd);
            
            if(motd.size() > 2){
                this.motd = motd.subList(0, 2);
                return this;
            }
            
            this.motd = motd;
            return this;
        }
        
        /**
         * Sets the players (lines) to use for the hover.
         *
         * <p>Set to an empty list to not change the hover text.
         *
         * <p>An {@link java.lang.IllegalArgumentException IllegalArgumentException} may be thrown by the
         * {@link CheckUtil CheckUtil} should the provided players list be null.
         *
         * @param  players
         *         The lines to set for the hover.
         *
         * @return This Builder after the players have been set. Useful for chaining.
         */
        public Builder setPlayers(List<String> players){
            CheckUtil.isNull("Players", players);
            
            this.players = players;
            return this;
        }
        
        /**
         * Sets the text to override the player count with.
         *
         * <p>Set to an empty String or {@code null} to not alter the Player count text.
         *
         * @param  playerCountText
         *         The text to show in the player count.
         *
         * @return This Builder after the player count text has been set. Useful for chaining.
         */
        public Builder setPlayerCountText(String playerCountText){
            this.playerCountText = playerCountText;
            return this;
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
         * <p>Set to an empty String or {@code null} to not alter the Favicon.
         *
         * @param  favicon
         *         The favicon to use.
         *
         * @return This Builder after the favicon has been set. Useful for chaining.
         */
        public Builder setFavicon(String favicon){
            this.favicon = favicon;
            return this;
        }
        
        /**
         * Sets whether the player count should be hidden or not.
         *
         * <p>Set to {@link NullBool#NOT_SET NullBool.NOT_SET} to not set this.
         * 
         * <p>An {@link java.lang.IllegalArgumentException IllegalArgumentException} may be thrown by the
         * {@link CheckUtil CheckUtil} should hidePlayersEnabled be null.
         *
         * @param  hidePlayersEnabled
         *         Whether the player count should be hidden or not.
         *
         * @return This Builder after the NullBool has been set. Useful for chaining.
         */
        public Builder setHidePlayersEnabled(NullBool hidePlayersEnabled){
            CheckUtil.isNull("HidePlayersEnabled", hidePlayersEnabled);
            
            this.hidePlayersEnabled = hidePlayersEnabled;
            return this;
        }
        
        /**
         * Sets whether the extra players feature should be enabled.
         *
         * <p>Set to {@link NullBool#NOT_SET NullBool.NOT_SET} to not set this.
         *
         * <p>An {@link java.lang.IllegalArgumentException IllegalArgumentException} may be thrown by the
         * {@link CheckUtil CheckUtil} should extraPlayersEnabled be null.
         *
         * @param  extraPlayersEnabled
         *         Whether the extra players feature should be enabled or not.
         *
         * @return This Builder after the NullBool has been set. Useful for chaining.
         */
        public Builder setExtraPlayersEnabled(NullBool extraPlayersEnabled){
            CheckUtil.isNull("ExtraPlayersEnabled", extraPlayersEnabled);
            
            this.extraPlayersEnabled = extraPlayersEnabled;
            return this;
        }
        
        /**
         * Sets the number of players to add to the online players to use as the new max players.
         * <br>This option has no effect when {@link #extraPlayersEnabled() isExtraPlayersEnabled} is set to {@code false}.
         * 
         * <p>Set this to {@code null} to not alter the max player count. Alternatively {@link #setExtraPlayersEnabled(NullBool) disable extra Players}.
         *
         * @param  extraPlayersCount
         *         The number of extra players to add.
         *
         * @return This Builder after the extra player count has been set. Useful for chaining.
         */
        public Builder setExtraPlayerCount(Integer extraPlayersCount){
            this.extraPlayersCount = extraPlayersCount;
            return this;
        }
        
        /**
         * Creates a new {@link ProfileEntry ProfileEntry instance} with the values set in this Builder.
         *
         * @return New {@link ProfileEntry ProfileEntry instance}.
         */
        public ProfileEntry build(){
            return new ProfileEntry(motd, players, playerCountText, favicon, hidePlayersEnabled, extraPlayersEnabled, extraPlayersCount);
        }
    }
}
