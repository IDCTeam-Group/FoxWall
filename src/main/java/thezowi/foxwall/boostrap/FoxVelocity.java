package thezowi.foxwall.boostrap;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.annotation.DataDirectory;
import com.velocitypowered.api.proxy.ProxyServer;
import java.nio.file.Path;
import java.util.logging.Logger;

@Plugin(id = "foxwall", name = "FoxWall", version = "2.0.0",
        description = "Protects your backend from being scanned and/or joinable.",
        url = "https://discord.zowi.gay/", authors = {"NovaCraft254"})
public class FoxVelocity {
    @Inject public FoxVelocity(ProxyServer proxy, org.slf4j.Logger logger, @DataDirectory Path path) {}

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {}
}
