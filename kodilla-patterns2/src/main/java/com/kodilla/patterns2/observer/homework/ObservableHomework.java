package com.kodilla.patterns2.observer.homework;

public interface ObservableHomework {
    void registerObserver(ObserverHomework observerHomework);
    void notifyObserver();
    void removeObserver(ObserverHomework observerHomework);
}
