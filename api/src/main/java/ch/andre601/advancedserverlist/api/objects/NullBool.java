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
     * Returns a NullBool instance based on the provided {@link java.lang.Boolean Boolean} value.
     * <br>In the case of {@code null} being provided will {@link #NOT_SET NullBool.NOT_SET} be returned, otherwise
     * will the corresponding NullBool instance matching the Boolean value be returned.
     * 
     * @param  bool
     *         The {@link java.lang.Boolean Boolean} value to receive a NullBool instance for.
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
