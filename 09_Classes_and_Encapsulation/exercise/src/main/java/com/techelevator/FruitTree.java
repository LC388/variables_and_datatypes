package com.techelevator;

public class FruitTree {
    private String typeOfFruit;
    private int piecesOfFruit;

    public FruitTree(String typeOfFruit, int piecesOfFruit) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruit = piecesOfFruit;
    }

    public boolean pickFruit(int numberOfPiecesToRemove){
        if (piecesOfFruit < numberOfPiecesToRemove){
            return false;}
        else if (piecesOfFruit >= numberOfPiecesToRemove){
            piecesOfFruit -= numberOfPiecesToRemove;
            return true;
        }
        return true;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public int getPiecesOfFruitLeft() {
        return piecesOfFruit;
    }
}
