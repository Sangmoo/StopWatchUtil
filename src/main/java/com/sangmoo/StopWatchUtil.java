package com.sangmoo;

public class StopWatchUtil {

    private long startTime;
    private long lastCheckpoint;

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.lastCheckpoint = startTime;
        log("⏱Stopwatch started.");
    }

    public void checkpoint(String label) {
        long now = System.currentTimeMillis();
        long duration = now - lastCheckpoint;
        log("[" + label + "] → " + duration + " ms");
        lastCheckpoint = now;
    }

    public void stop() {
        long total = System.currentTimeMillis() - startTime;
        log("Stopwatch stopped. Total elapsed time: " + total + " ms");
    }

    private void log(String message) {
        System.out.println("[StopWatch] " + message);
    }
}
