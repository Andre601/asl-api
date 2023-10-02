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

package ch.andre601.advancedserverlist.api.velocity.objects;

import ch.andre601.advancedserverlist.api.objects.GenericServer;
import com.velocitypowered.api.proxy.server.RegisteredServer;

import java.util.Map;

/**
 * {@link GenericServer GenericServer instance} for the Velocity proxy implementation of AdvancedServerList.
 *
 * <p>To get an instance of this class from a GenericServer instance, simply cast it to a VelocityProxy (Granted that
 * the GenericProxy instance actually is a VelocityProxy instance).
 */
public interface VelocityProxy extends GenericServer{
    /**
     * Returns a Map&lt;String, RegisteredServer&gt; where the key is the name of the Server and the value the
     * RegisteredServer from the Velocity Proxy.
     *
     * @return Possibly-empty Map containing a Server name and RegisteredServer instance.
     */
    Map<String, RegisteredServer> getServers();
}
