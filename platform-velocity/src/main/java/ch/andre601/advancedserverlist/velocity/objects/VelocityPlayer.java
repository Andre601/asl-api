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

package ch.andre601.advancedserverlist.velocity.objects;

import ch.andre601.advancedserverlist.api.objects.GenericPlayer;

/**
 * {@link GenericPlayer GenericPlayer instance} for the Velocity proxy implementation of AdvancedServerList.
 * <br>Provides a {@link #getVersion() getVersion()} method to get the MC version used as a readable String (i.e. 1.19.3)
 * rather than just the protocol version.
 *
 * <p>To get an instance of this class from a GenericPlayer instance, simply cast it to a VelocityPlayer (Granted that
 * the GenericPlayer instance actually is a VelocityPlayer instance).
 */
public interface VelocityPlayer extends GenericPlayer{
    
    /**
     * Returns the {@link #getProtocol() protocol version} in a readable MC version format (i.e. 1.19.3).
     *
     * <p>This only works on Velocity and will return {@code null} for any other platform.
     *
     * @return The readable MC version the player uses.
     */
    String getVersion();
}
