package ca.bcit.comp2526.tictactoe;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;

class TicTacToePieceTest
{
    @Test
    public void getSymbol()
    {
        final TicTacToePlayer player1;
        final TicTacToePlayer player2;
        final TicTacToePiece  piece1;
        final TicTacToePiece  piece2;
        final TicTacToePiece  piece3;

        player1 = new TicTacToePlayer("X");
        player2 = new TicTacToePlayer("O");
        piece1  = new TicTacToePiece(player1);
        piece2  = new TicTacToePiece(player2);
        piece3  = new TicTacToePiece(player1);

        assertThat(piece1.getSymbol(), equalTo("X"));
        assertThat(piece2.getSymbol(), equalTo("O"));
        assertThat(piece3.getSymbol(), equalTo("X"));
    }

    @Test
    public void getOwner()
    {
        final TicTacToePlayer player1;
        final TicTacToePlayer player2;
        final TicTacToePiece  piece1;
        final TicTacToePiece  piece2;
        final TicTacToePiece  piece3;

        player1 = new TicTacToePlayer("X");
        player2 = new TicTacToePlayer("O");
        piece1  = new TicTacToePiece(player1);
        piece2  = new TicTacToePiece(player2);
        piece3  = new TicTacToePiece(player1);

        assertThat(piece1.getOwner(), sameInstance(player1));
        assertThat(piece2.getOwner(), sameInstance(player2));
        assertThat(piece3.getOwner(), sameInstance(player1));
    }
}
