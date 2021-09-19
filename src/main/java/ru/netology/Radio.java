package ru.netology;

public class Radio {
    private int minVol = 0;
    private int maxVol = 10;
    private int currentVolume;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;

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
    public void setIncreaseVolume(int newVolume) {
        if (newVolume < maxVol && newVolume >= minVol) {
            currentVolume = newVolume + 1;
            return;
        }
        if (newVolume > maxVol) {
            newVolume = maxVol;

        }
        if (newVolume < minVol) {
            newVolume = minVol;
        }
        currentVolume = newVolume;
    }

    public int getIncreaseVolume() {
        return currentVolume;
    }

    // Уменьшение звука
    public void setDecreaseVolume(int newVolume) {
        if (newVolume <= maxVol && newVolume > minVol) {
            currentVolume = newVolume - 1;
            return;
        }
        if (newVolume > maxVol) {
            newVolume = maxVol;

        }
        if (newVolume < minVol) {
            newVolume = minVol;
        }
        currentVolume = newVolume;
    }

    public int getDecreaseVolume() {
        return currentVolume;
    }

    // Выставление границ станций
    public void setCurrentStation(int newStation) {

        if (newStation > maxStation) {
            newStation = maxStation;
        }
        if (newStation < minStation) {
            newStation = minStation;
        }
        currentStation = newStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    //Переключаем на следующую станцию
    public void setNextStation(int newStation) {
        if (newStation >= minStation && newStation < maxStation) {
            currentStation = newStation + 1;
            return;
        }
        if (newStation > maxStation) {
            newStation = maxStation;
        }
        if (newStation < minStation) {
            newStation = minStation;
        }
        currentStation = newStation;
    }

    public int getNextStation() {
        return currentStation;
    }

    //Переключаем на предыдущую станцию
    public void setPreviousStation(int newStation) {
        if (newStation > minStation && newStation <= maxStation) {
            currentStation = newStation - 1;
            return;
        }
        if (newStation > maxStation) {
            newStation = maxStation;
        }
        if (newStation < minStation) {
            newStation = minStation;
        }
        currentStation = newStation;
    }

    public int getPreviousStation() {
        return currentStation;
    }
}
