package org.quantumdrive.core;

/**
 * A class that produces new game cores
 */
public class CoreFactory {
    public static Core createOne() {
        return new RealTimeCore();
    }
}
