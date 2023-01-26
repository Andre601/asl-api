package ch.andre601.advancedserverlist.api.objects;

public enum NullBool{
    
    TRUE(true),
    FALSE(false),
    NOT_SET(null);
    
    private final Boolean bool;
    
    NullBool(Boolean bool){
        this.bool = bool;
    }
    
    public boolean isNotSet(){
        return this == NOT_SET;
    }
    
    public boolean getOrDefault(boolean def){
        return isNotSet() ? def : this.bool;
    }
}
