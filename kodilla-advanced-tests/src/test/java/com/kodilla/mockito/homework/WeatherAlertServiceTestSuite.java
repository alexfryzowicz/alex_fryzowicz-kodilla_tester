package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherAlertServiceTestSuite {

    WeatherAlertService weatherAlertService = new WeatherAlertService();
    Subscriber subscriber1 = Mockito.mock(Subscriber.class);
    Subscriber subscriber2 = Mockito.mock(Subscriber.class);
    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);


    @Test
    public void subscriberSubscribedToALocationShouldReceiveNotificationsFromThatLocation() {
        weatherAlertService.addSubscriberToLocation(subscriber1, location1);
        weatherAlertService.addSubscriberToLocation(subscriber2, location1);
        weatherAlertService.addSubscriberToLocation(subscriber2, location2);

        weatherAlertService.sendWeatherAlert(location1);
        weatherAlertService.sendWeatherAlert(location2);

        Mockito.verify(subscriber1, Mockito.times(1)).receiveWeatherAlert(location1);
        Mockito.verify(subscriber2, Mockito.times(1)).receiveWeatherAlert(location1);
        Mockito.verify(subscriber2, Mockito.times(1)).receiveWeatherAlert(location2);
    }

    @Test
    public void subscriberSubscribedToAnyLocationShouldReceiveGeneralNotification() {
        weatherAlertService.addSubscriberToLocation(subscriber1, location2);
        weatherAlertService.sendRegularNotification();

        Mockito.verify(subscriber1, Mockito.times(1)).receiveNotification();
    }

    @Test
    public void subscriberCanQuitSubscrbingALocationAndShouldNotReceiveWeatherAlertsFromThatLocation() {
        weatherAlertService.addSubscriberToLocation(subscriber1, location1);
        weatherAlertService.addSubscriberToLocation(subscriber1, location2);
        weatherAlertService.removeSubscriberFromOneLocation(subscriber1, location1);
        weatherAlertService.sendRegularNotification();
        weatherAlertService.sendWeatherAlert(location1);
        weatherAlertService.sendWeatherAlert(location2);

        Mockito.verify(subscriber1, Mockito.times(1)).receiveNotification();
        Mockito.verify(subscriber1, Mockito.never()).receiveWeatherAlert(location1);
        Mockito.verify(subscriber1, Mockito.times(1)).receiveWeatherAlert(location2);
    }

    @Test
    public void subscriberCanQuitSubscribingFromAllLocationsAndShouldNotReceiveAnyNotificationsOrAlerts() {
        weatherAlertService.addSubscriberToLocation(subscriber1, location1);
        weatherAlertService.addSubscriberToLocation(subscriber1, location2);
        weatherAlertService.addSubscriberToLocation(subscriber2, location1);
        weatherAlertService.addSubscriberToLocation(subscriber2, location2);
        weatherAlertService.removeSubscriberFromAllLocations(subscriber1);
        weatherAlertService.sendWeatherAlert(location1);
        weatherAlertService.sendWeatherAlert(location2);
        weatherAlertService.sendRegularNotification();

        Mockito.verify(subscriber1, Mockito.never()).receiveNotification();
        Mockito.verify(subscriber1, Mockito.never()).receiveWeatherAlert(location1);
        Mockito.verify(subscriber1, Mockito.never()).receiveWeatherAlert(location2);
        Mockito.verify(subscriber2, Mockito.times(1)).receiveWeatherAlert(location1);
        Mockito.verify(subscriber2, Mockito.times(1)).receiveWeatherAlert(location2);
        Mockito.verify(subscriber2, Mockito.times(1)).receiveNotification();
    }

    @Test
    public void onlyLocationSubscribersShouldReceiveWeatherAlertForThatLocation() {
        weatherAlertService.addSubscriberToLocation(subscriber1, location1);
        weatherAlertService.addSubscriberToLocation(subscriber2, location1);
        weatherAlertService.showTheMap();
        weatherAlertService.sendWeatherAlert(location1);
        weatherAlertService.sendWeatherAlert(location2);



        Mockito.verify(subscriber1, Mockito.never()).receiveWeatherAlert(location2);
        Mockito.verify(subscriber2, Mockito.never()).receiveWeatherAlert(location2);
    }

    @Test
    public void shouldSendRegularNotificationsToAllSubscribers() {
        weatherAlertService.addSubscriberToLocation(subscriber1, location1);
        weatherAlertService.addSubscriberToLocation(subscriber2, location2);
        weatherAlertService.sendRegularNotification();

        Mockito.verify(subscriber1, Mockito.times(1)).receiveNotification();
        Mockito.verify(subscriber2, Mockito.times(1)).receiveNotification();
    }

    @Test
    public void AnyLocationCanBeRemovedFromWeatherAlertService() {
        weatherAlertService.addSubscriberToLocation(subscriber1, location1);
        weatherAlertService.addSubscriberToLocation(subscriber2, location1);
        weatherAlertService.removeLocation(location1);
        weatherAlertService.sendWeatherAlert(location1);

        Mockito.verify(subscriber1, Mockito.never()).receiveWeatherAlert(location1);
        Mockito.verify(subscriber2, Mockito.never()).receiveWeatherAlert(location1);
    }

    @Test
    public void shouldRemoveLocation() {
        weatherAlertService.addSubscriberToLocation(subscriber1, location1);
        weatherAlertService.addSubscriberToLocation(subscriber2, location1);
        weatherAlertService.addSubscriberToLocation(subscriber2, location2);
        weatherAlertService.removeLocation(location1);
        weatherAlertService.sendWeatherAlert(location1);
        weatherAlertService.sendWeatherAlert(location2);

        Mockito.verify(subscriber1, Mockito.never()).receiveWeatherAlert(location1);
        Mockito.verify(subscriber2, Mockito.never()).receiveWeatherAlert(location1);
        Mockito.verify(subscriber2, Mockito.times(1)).receiveWeatherAlert(location2);
    }
}