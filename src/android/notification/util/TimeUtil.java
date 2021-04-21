package de.appplant.cordova.plugin.notification.util;

public class TimeUtil {

  private static long NANOSECONDS_VALUE = 1000000L;

  public static long getCurrentTimeMillis() {
    return System.nanoTime() / NANOSECONDS_VALUE;
  }
}
