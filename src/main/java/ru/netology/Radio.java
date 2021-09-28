package ru.netology;

public class Radio {
    private int minVol = 0;
    private int maxVol = 10;
    private int currentVolume;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;
    private int lowBoarderStation;
    private int highBoarderStation;

    // Выставление границ звука
    public void setCurrentVolume(int newVolume) {

        if (newVolume > maxVol) {
            newVolume = maxVol;
        }
        if (newVolume < minVol) {
            newVolume = minVol;
        }
        currentVolume = newVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // Увеличение звука
    public void increaseVolume() {
        if (currentVolume < maxVol) {
            currentVolume += 1;
        }
    }

    // Уменьшение звука
    public void decreaseVolume() {
        if (currentVolume > minVol) {
            currentVolume -= 1;
        }
    }

    // Выставление границ станций
    public void setCurrentStation(int newStation) {

        if (newStation < minStation) {
            newStation = minStation;
        }
        if (newStation > maxStation) {
            newStation = maxStation;
        }
        currentStation = newStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    //Переключаем на следующую станцию
    public void nextStation() {
        if (currentStation < maxStation) {
            highBoarderStation = currentStation + 1;
        }
        if (currentStation == maxStation) {
            highBoarderStation = minStation;
        }
        currentStation = highBoarderStation;
    }

    //Переключаем на предыдущую станцию
    public void previousStation() {
        if (currentStation > minStation) {
            lowBoarderStation = currentStation - 1;
        }
        if (currentStation == minStation) {
            lowBoarderStation = maxStation;
        }
        currentStation = lowBoarderStation;
    }
}