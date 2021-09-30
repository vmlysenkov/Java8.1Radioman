package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentVolumeMore() {
        Radio rad = new Radio();
        rad.setCurrentVolume(99);

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
        incVol.setCurrentVolume(90);

        incVol.increaseVolume();

        int expected = 91;
        int actual = incVol.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeMax() {
        Radio incVol = new Radio();
        incVol.setCurrentVolume(101);

        incVol.increaseVolume();

        int expected = 100;
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
        station.setCurrentStation(12);

        int expected = 12;
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
        Radio station = new Radio(12);
        station.setCurrentStation(12);

        station.nextStation();

        int expected = 12;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void nextStationMax() {
        Radio station = new Radio(25);
        station.setCurrentStation(24);

        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setPreviousStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.previousStation();

        int expected = 8;
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

    @Test
    public void shouldUseRadio() {
        Radio radio = new Radio();
        Radio radio1 = new Radio();
    }


}