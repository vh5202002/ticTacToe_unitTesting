package ca.bcit.comp2526.tictactoe;

import ca.bcit.comp2526.game.board.Piece;

public class TicTacToePiece
    extends Piece
{
    public TicTacToePiece(final TicTacToePlayer p)
    {
        super(p);
    }

    public String getSymbol()
    {
        final String name;

        name = owner.getName();

        return name;
    }
}
