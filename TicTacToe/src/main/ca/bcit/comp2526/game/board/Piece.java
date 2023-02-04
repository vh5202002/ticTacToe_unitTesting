package ca.bcit.comp2526.game.board;

import ca.bcit.comp2526.game.Player;

public abstract class Piece
{
    protected final Player owner;

    protected Piece(final Player p)
    {
        owner = p;
    }

    public Player getOwner()
    {
        return owner;
    }

    public abstract String getSymbol();
}
