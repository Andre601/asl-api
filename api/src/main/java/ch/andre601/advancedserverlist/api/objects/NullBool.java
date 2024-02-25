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
 * Enum used to return a {@link java.lang.Boolean Boolean} value with a default one should no value be set.
 */
public enum NullBool{
    
    /**
     * Boolean value {@code true}
     */
    TRUE(true),
    
    /**
     * Boolean value {@code false}
     */
    FALSE(false),
    
    /**
     * Boolean value {@code null}
     */
    NOT_SET(null);
    
    private final Boolean bool;
    
    NullBool(Boolean bool){
        this.bool = bool;
    }
    
    /**
     * Returns a NullBool instance based on the provided {@link Boolean} instance:
     * <ul>
     *     <li>{@code true}: {@link #TRUE NullBool.TRUE}</li>
     *     <li>{@code false}: {@link #FALSE NullBool.FALSE}</li>
     *     <li>{@code null}: {@link #NOT_SET NullBool.NOT_SET}</li>
     * </ul>
     * 
     * @param  bool
     *         Boolean to get a NullBool instance from.
     * 
     * @return NullBool instance based on the provided {@link java.lang.Boolean Boolean} value.
     */
    public static NullBool resolve(Boolean bool){
        if(bool == null)
            return NOT_SET;
        
        return bool ? TRUE : FALSE;
    }
    
    /**
     * Returns whether the NullBool instance is {@link #NOT_SET NullBool.NOT_SET}.
     * 
     * @return True if the instance is {@link #NOT_SET NullBool.NOT_SET}, otherwise false.
     */
    public boolean isNotSet(){
        return this == NOT_SET;
    }
    
    /**
     * Gets the corresponding boolean value associated with the NullBool instance.
     * <br>In the case of NullBool {@link #isNotSet() not being set} will the provided default value be returned.
     * 
     * @param  def
     *         The default boolean value to return should the NullBool instance be {@link #NOT_SET NullBool.NOT_SET}.
     * 
     * @return true or false depending on the NullBool instance and the provided default value.
     */
    public boolean getOrDefault(boolean def){
        return isNotSet() ? def : this.bool;
    }
}
