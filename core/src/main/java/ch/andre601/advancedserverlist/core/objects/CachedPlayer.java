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

package ch.andre601.advancedserverlist.core.objects;

import ch.andre601.advancedserverlist.api.exceptions.UnsupportedAPIAccessException;

import java.util.UUID;

/**
 * This class is used by Gson to convert JSON entries in the plugin's playerdata.json to usable classes containing
 * information to later use for things such as placeholders.
 * <br>A CachedPlayer is also created when a player joins while AdvancedServerList is running.
 */
@SuppressWarnings("FieldMayBeFinal")
public class CachedPlayer{
    
    public CachedPlayer(String ip, String name, UUID uuid){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * The IP the player last joined with.
     * 
     * @return String representing the player's IP.
     */
    public String getIp(){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * The Minecraft Account name last used by the player.
     * 
     * @return Last used Minecraft Account name.
     */
    public String getName(){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * The UUID associated with the Minecraft Account.
     * 
     * @return UUID of the Minecraft Account.
     */
    public UUID getUuid(){
        throw new UnsupportedAPIAccessException();
    }
}
