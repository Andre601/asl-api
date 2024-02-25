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

package ch.andre601.advancedserverlist.api.objects;

/**
 * Interface used to share common information across all platforms.
 * 
 * <p>Platform-specific interfaces extending this one exist that may offer additional data.
 * <br>This interface always offers data for the following:
 * <ul>
 *     <li>{@link #getPlayersOnline() Players online on a Proxy/Server}</li>
 *     <li>{@link #getPlayersMax() Max players able to join a Proxy/Server}</li>
 *     <li>{@link #getHost() IP/Domain pinged by the player}</li>
 * </ul>
 */
public interface GenericServer{
    
    /**
     * Returns the number of players currently online on the server.
     *
     * @return Number of players online on the server.
     */
    int getPlayersOnline();
    
    /**
     * Returns the number of total players that can join the server.
     *
     * @return Number of total players that can join the server.
     */
    int getPlayersMax();
    
    /**
     * Returns the IP/Domain that got pinged by the player.
     *
     * @return Possibly-null String containing the IP/Domain that got pinged by the player.
     */
    String getHost();
}
