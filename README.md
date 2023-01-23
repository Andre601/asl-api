# AdvancedServerList API

This repository was made to host the classes provided by the AdvancedServerList API introduced in v2.

## Get dependency

### Gradle

```groovy
repositories {
    maven { url = 'https://jitpack.io/' }
}

dependencies {
    implementation 'com.github.Andre601.asl-api:api:{version}'
    
    // Optional platform-specific dependencies. Read more below
    implementation 'com.github.Andre601.asl-api:platform-bungeecord:{version}'
    implementation 'com.github.Andre601.asl-api:platform-paper:{version}'
    implementation 'com.github.Andre601.asl-api:platform-spigot:{version}'
    implementation 'com.github.Andre601.asl-api:platform-velocity:{version}'
}
```

### Maven

```xml
<repositories>
    <repository>
        <id>jitpack</id>
        <url>https://jitpack.io/</url>
    </repository>
</repositories>

<dependencies>
  <dependency>
      <groupId>com.github.Andre601.asl-api</groupId>
      <artifactId>api</artifactId>
      <version>{version}</version>
  </dependency>
  
  <!-- Optional platform-specific dependencies. Read more below -->
  <dependency>
      <groupId>com.github.Andre601.asl-api</groupId>
      <artifactId>platform-bungeecord</artifactId>
      <version>{version}</version>
  </dependency>
  <dependency>
      <groupId>com.github.Andre601.asl-api</groupId>
      <artifactId>platform-paper</artifactId>
      <version>{version}</version>
  </dependency>
  <dependency>
      <groupId>com.github.Andre601.asl-api</groupId>
      <artifactId>platform-spigot</artifactId>
      <version>{version}</version>
  </dependency>
  <dependency>
      <groupId>com.github.Andre601.asl-api</groupId>
      <artifactId>platform-velocity</artifactId>
      <version>{version}</version>
  </dependency>
</dependencies>
```

### Platforms

This API repo provides additional platform-specific dependencies to use for specific versions of AdvancedServerList.

The main purpose is to provide a way for you to cast the GenericPlayer to a platform-specific variant for extra options (if available).  
These dependencies are optional and not needed unless you directly want to get platform specific data (i.e. OfflinePlayer instance on Spigot/Paper).

## Using the API

The api provides a `AdvancedServerListAPI` class which you can get an instance from by calling `AdvancedServerListAPI.get()`:

```java
AdvancedServerListAPI api = AdvancedServerListAPI.get();
```
The API currently offers the following options for you to use.

### Adding own placeholders

A `PlaceholderProvider` class is available. Its main purpose is to allow plugins to provide their own placeholders for AdvancedServerList to parse in the server list profiles.

To use it, create a new class and let it extend the `PlaceholderProvider` class. Make sure to also implement any requested constructors and methods.  
A recommended setup should look like this:  
```java
public class MyPlaceholders extends PlaceholderProvider {
    
    public MyPlaceholders() {
        // The identifier for the placeholders
        super("myplaceholders");
    }
    
    @Override
    public String parsePlaceholder(String placeholder, GenericPlayer player, GenericServer server) {
        // Handle your placeholders here.
        return null;
    }
}
```

#### Setting an identifier

By default, are you required to implement a Constructor to set the `identifier` String in the abstract class.  
It is recommended to replace this Constructor with a no-args constructor and set the identifier in the `super` call directly, as shown above.

#### Handling placeholders

The `parsePlaceholder` method is called by AdvancedServerList's StringReplacer to parse any placeholders it found.

This method is only called for your class if the replacer was able to find a valid `${<identifier> <placeholder>}` structure, where `<identifier>` would match the one you defined in your class.  
Any value after the identifier and before the closing curly bracket will be provided as `placeholder` value in the method for you to handle.

Note, that returning `null` as value will be seen as an invalid placeholder, resulting in it being returned unchanged.

The `GenericPlayer` and `GenericServer` instances can also be used to obtain some data. While data in the GenericServer is always present, is it not guaranteed for GenericPlayer.  
Additionally can the provided GenericPlayer contain extra values from its extending class which aren't provided by the abstract class itself. In those cases can you use one of the platform dependencies to cast the GenericPlayer to one of its platform-specific child-variants.

#### Adding to the API

To make AdvancedServerList actually handle your placeholders will you need to call the `addPlaceholderProvider` method from the `AdvancedServerListAPI` class:  
```java
// api is the AdvancedServerListAPI instance we got earlier
api.addPlaceholderProvider(new MyPlaceholders());
```

Please note, that your PlaceholderProvider instance will only be accepted when it meets the following criterias:

1. A non-null, non-empty identifier has been provided
2. The identifier does not contain any spaces
3. Another PlaceholderProvider with the same identifier isn't already added.

## Support

<a href="https://discord.gg/6dazXp6" target="_blank">
  <img src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@2/assets/minimal/social/discord-singular_vector.svg" height="64" alt="discord" title="Join my Discord Server">
</a>
<a href="https://app.revolt.chat/invite/74TpERXA" target="_blank">
  <img src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@2/assets/minimal/social/revolt-singular_vector.svg" height="64" alt="revolt" title="Join my Revolt Server">
</a>
<a href="https://github.com/Andre601/AdvancedServerList/issues/new?template=api_support.yml" target="_blank">
  <img src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@2/assets/minimal/available/github_vector.svg" height="64" alt="github" title="Open an issue on GitHub">
</a>