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

package ch.andre601.advancedserverlist.paper.objects;

import ch.andre601.advancedserverlist.api.exceptions.UnsupportedAPIAccessException;
import ch.andre601.advancedserverlist.api.objects.GenericPlayer;
import ch.andre601.advancedserverlist.core.objects.CachedPlayer;
import org.bukkit.OfflinePlayer;

/**
 * {@link GenericPlayer GenericPlayer instance} for the PaperMC server implementation of AdvancedServerList.
 * <br>This class includes a {@link #getPlayer() OfflinePlayer instance} obtained from the server the plugin
 * runs on.
 * 
 * <p>This class is useful for cases where you want to use the OfflinePlayer. Simply cast the GenericPlayer
 * instance to a PaperPlayer (Granted that it actually is an instance of it to begin with).
 */
public class PaperPlayer extends GenericPlayer{
    
    public PaperPlayer(OfflinePlayer player, CachedPlayer cachedPlayer, int protocol){
        throw new UnsupportedAPIAccessException();
    }
    
    /**
     * Gives the OfflinePlayer embedded in this PaperPlayer instance.
     * 
     * @return OfflinePlayer instance.
     */
    public OfflinePlayer getPlayer(){
        throw new UnsupportedAPIAccessException();
    }
}
