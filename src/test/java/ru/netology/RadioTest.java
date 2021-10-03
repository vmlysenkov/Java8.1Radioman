package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentVolumeMore() {
        Radio rad = new Radio();
        rad.setCurrentVolume(12);

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeLess() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void increaseVolume() {
        Radio incVol = new Radio();
        incVol.setCurrentVolume(4);

        incVol.increaseVolume();

        int expected = 5;
        int actual = incVol.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeMax() {
        Radio incVol = new Radio();
        incVol.setCurrentVolume(10);

        incVol.increaseVolume();

        int expected = 10;
        int actual = incVol.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        Radio decVol = new Radio();
        decVol.setCurrentVolume(7);

        decVol.decreaseVolume();

        int expected = 6;
        int actual = decVol.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    void decreaseVolumeMin() {
        Radio decVol = new Radio();
        decVol.setCurrentVolume(0);

        decVol.decreaseVolume();

        int expected = 0;
        int actual = decVol.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    void setCurrentStationMore() {
        Radio station = new Radio();
        station.setCurrentStation(10);

        int expected = 9;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationLess() {
        Radio station = new Radio();
        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {
        Radio station = new Radio();
        station.setCurrentStation(8);

        station.nextStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void nextStationMax() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setPreviousStation() {
        Radio station = new Radio();
        station.setCurrentStation(1);

        station.previousStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setPreviousStationMin() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        station.previousStation();

        int expected = 9;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }
}