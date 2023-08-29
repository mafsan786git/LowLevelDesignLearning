package model;

public class Player {
    public String name;
    public PlayingPiece playingPiece;

    public Player(String name,PlayingPiece type){
        this.name = name;
        this.playingPiece = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayingPiece getPieceType() {
        return this.playingPiece;
    }

    public void setPieceType(PlayingPiece pieceType) {
        this.playingPiece = pieceType;
    }
}
