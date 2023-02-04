package ca.bcit.comp2526.tictactoe;

import ca.bcit.comp2526.game.Player;

public class TicTacToePlayer
    extends Player
{
    public TicTacToePlayer(final String nm)
    {
        super(nm);

        if(!(nm.equals("X")) && !(nm.equals("O")))
        {
            throw new IllegalArgumentException(String.format("nm must be \"X\" or \"O\" was: \"%s\"", nm));
        }
    }
}
