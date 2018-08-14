package com.kodilla.good.patterns.challenges;

public class DataRepository implements Repository {
    private String repositoryName;

    public DataRepository(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    @Override
    public void repositoryUpdate() {
            System.out.println("Product added to repository.");
    }
}
