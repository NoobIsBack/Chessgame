package com.mayank.chessgame.model;

public abstract class Piece {

    private PieceColor pieceColor;
    private boolean killed = false;

    public Piece(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public PieceColor getPieceColor() {
        return  pieceColor;
    }

    public boolean isKilled() {
        return killed;
    }

    public void setKilled() {
        this.killed = killed;
    }

    public abstract boolean canMove(Board board, Position start, Position end);
}