package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherAlertService {

    private Set<Location> locations = new HashSet<>();
    private Map<Subscriber, Set<Location>> subscribersInLocations = new HashMap<>();

    //zapisanie osoby do lokalizacji
    public void addSubscriberToLocation(Subscriber subscriber, Location location) {
        if (this.subscribersInLocations.containsKey(subscriber)) {
            subscribersInLocations.get(subscriber).add(location);
        } else {
            locations.add(location);
            subscribersInLocations.put(subscriber, locations);
        }
    }

    public void sendRegularNotification() {
        subscribersInLocations.forEach((key, value) -> key.receiveNotification());
    }
    //do określonej grupy
    public void sendWeatherAlert(Location location) {
        subscribersInLocations.entrySet()
                .stream()
                .filter(s -> s.getValue().contains(location))
                .forEach(s -> s.getKey().receiveWeatherAlert(location));
    }
    //wycofać subskrybcję z danej lokalizacji
    public void removeSubscriberFromOneLocation(Subscriber subscriber, Location location) {
        for (Map.Entry<Subscriber, Set<Location>> subscribersMap : subscribersInLocations.entrySet()) {
            if (subscribersMap.getKey().equals(subscriber)) {
                subscribersMap.getValue().remove(location);
            }
            if (subscribersMap.getValue().isEmpty()) {
                subscribersInLocations.remove(subscriber);
            }
        }
    }
    // wycofać sub z wszystkich
    public void removeSubscriberFromAllLocations (Subscriber subscriber) {
        subscribersInLocations.remove(subscriber);
    }
    //usunięcie lokalizacji
    public void removeLocation (Location location){
        locations.remove(location);
    }

    public void showTheMap() {
        System.out.println(subscribersInLocations.entrySet());
    }
}
