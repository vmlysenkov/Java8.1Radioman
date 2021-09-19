package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-5);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }



    @Test
    void setIncreaseVolume() {
        Radio incVol = new Radio();
        incVol.setIncreaseVolume(13);

        int expected = 10;
        int actual = incVol.getIncreaseVolume();

        assertEquals(expected, actual);

    }

    @Test
    void setDecreaseVolume() {
        Radio incVol = new Radio();
        incVol.setDecreaseVolume(1);

        int expected = 0;
        int actual = incVol.getDecreaseVolume();

        assertEquals(expected, actual);

    }

    @Test
    void setCurrentStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void setNextStation() {
        Radio station = new Radio();
        station.setNextStation(-2);

        int expected = 0;
        int actual = station.getNextStation();

        assertEquals(expected, actual);
    }

    @Test
    void setPreviousStation() {
        Radio station = new Radio();
        station.setPreviousStation(1);

        int expected = 0;
        int actual = station.getPreviousStation();

        assertEquals(expected, actual);
    }
}