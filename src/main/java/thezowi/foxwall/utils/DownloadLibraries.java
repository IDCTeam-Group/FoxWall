package thezowi.foxwall.utils;

import java.util.concurrent.CompletableFuture;

public class DownloadLibraries {
    public boolean failed = false;
    public boolean enableLogs = false;
    public CompletableFuture<Void> downloadLibraries() { return CompletableFuture.completedFuture(null); }
    public CompletableFuture<Void> downloadLibraries(boolean logs) { return CompletableFuture.completedFuture(null); }
    public void shutdown() {}
}
