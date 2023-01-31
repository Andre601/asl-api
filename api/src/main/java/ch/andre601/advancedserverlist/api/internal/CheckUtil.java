package ch.andre601.advancedserverlist.api.internal;

import ch.andre601.advancedserverlist.api.PlaceholderProvider;
import ch.andre601.advancedserverlist.api.exceptions.InvalidPlaceholderProviderException;

import java.util.Locale;
import java.util.Map;

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
    
    /**
     * Checks the provided {@link PlaceholderProvider PlaceholderProvider} for the following things:
     * <ul>
     *     <li>The provided instance is not null.</li>
     *     <li>The identifier is not null or empty.</li>
     *     <li>The identifier does not contain spaces.</li>
     *     <li>A PlaceholderProvider with the same identifier isn't already registered.</li>
     * </ul>
     * Failing any of the above checks results in a {@link InvalidPlaceholderProviderException InvalidPlaceholderProviderException}
     * being thrown.
     * 
     * @param  provider
     *         The PlaceholderProvider instance to check.
     * @param  placeholderProviders
     *         Map of already registered PlaceholderProvider to check.
     * 
     * @return Identifier of the provided PlaceholderProvider instance if it passes all checks.
     * 
     * @throws InvalidPlaceholderProviderException
     *         If the provided PlaceholderProvider is null, its identifier is null or empty, contains spaces or is already
     *         registered.
     */
    public static String checkPlaceholderProvider(PlaceholderProvider provider, Map<String, PlaceholderProvider> placeholderProviders){
        if(provider == null)
            throw new InvalidPlaceholderProviderException("Received null PlaceholderProvider instance.");
        
        if(provider.getIdentifier() == null || provider.getIdentifier().trim().isEmpty())
            throw new InvalidPlaceholderProviderException("PlaceholderProvider identifier may not be null or empty.");
        
        String identifier = provider.getIdentifier().trim().toLowerCase(Locale.ROOT);
        if(identifier.contains(" "))
            throw new InvalidPlaceholderProviderException("Identifier may not contain spaces.");
        
        if(placeholderProviders.containsKey(identifier))
            throw new InvalidPlaceholderProviderException("PlaceholderProvider with identifier '" + identifier + "' already exists.");
        
        return identifier;
    }
}
