package ch.andre601.advancedserverlist.api.internal;

public class CheckUtil{
    
    /**
     * Checks if the provided object is {@code null} and throws an {@link IllegalArgumentException} in such a case.
     * 
     * @param name
     *        The name to use in the exception name.
     * @param object
     *        The object to check for being null.
     */
    public static void isNull(String name, Object object){
        if(object == null)
            throw new IllegalArgumentException(name + " may not be null!");
    }
}
