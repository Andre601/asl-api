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

package ch.andre601.advancedserverlist.api;

import ch.andre601.advancedserverlist.api.objects.GenericPlayer;
import ch.andre601.advancedserverlist.api.objects.GenericServer;

/**
 * Abstract class used to create Placeholders in the format <code>${identifier values}</code> with <code>identifier</code>
 * being the name you provide through the {@link #PlaceholderProvider(String) Constructor}.
 */
public abstract class PlaceholderProvider{
    
    private final String identifier;
    
    /**
     * Constructor used to set the identifier for the class extending the PlaceholderProvider class.
     *
     * <h4>Example</h4>
     * <pre>{@code
     * public class MyPlaceholders extends PlaceholderProvider {
     *
     *     public MyPlaceholders() {
     *         super("myplaceholders");
     *     }
     *
     *     @Override
     *     public String parsePlaceholder(String placeholder, GenericPlayer player, GenericServer server) {
     *         if(placeholder.equals("hello")
     *             return "Hi!";
     *
     *         return null;
     *     }
     * }
     * }</pre>
     *
     * @param identifier
     *        The identifier to use for the placeholder. Shouldn't be null, empty, nor contain spaces.
     */
    public PlaceholderProvider(String identifier){
        this.identifier = identifier;
    }
    
    /**
     * This method is called by AdvancedServerList whenever a Placeholder pattern of <code>${identifier value}</code> is
     * being found.
     * <br>Your instance of the PlaceholderProvider class is only called when the identifier matches the one you provided.
     *
     * <p>{@code null} can be returned to indicate the placeholder being invalid, having AdvancedServerList return the
     * placeholder unchanged.
     *
     * @param  placeholder
     *         The part of the placeholder after the identifier ({@code ${<identifier> <placeholder>}}
     * @param  player
     *         The {@link GenericPlayer GenericPlayer instance} used.
     * @param  server
     *         The {@link GenericServer GenericServer instance} used.
     *
     * @return Parsed String based on the PlaceholderProvider or {@code null} for invalid placeholders.
     */
    public abstract String parsePlaceholder(String placeholder, GenericPlayer player, GenericServer server);
    
    /**
     * Returns the identifier used by this instance.
     *
     * @return String containing the identifier used by this instance.
     */
    public String getIdentifier(){
        return identifier;
    }
}
