package ca.bcit.comp2526.tictactoe;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TicTacToePlayerTest
{
    @Test
    public void badConstructorNull()
    {
        final IllegalArgumentException ex;

        ex = assertThrows(IllegalArgumentException.class, () -> new TicTacToePlayer(null));
        assertThat(ex.getMessage(), equalTo("nm cannot be null"));
    }

    @Test
    public void badConstructorEmpty()
    {
        badConstructorEmpty("");
        badConstructorEmpty(" ");
        badConstructorEmpty("\t");
        badConstructorEmpty("\n");
        badConstructorEmpty("       ");
        badConstructorEmpty("       \t\t\t\t");
    }

    private void badConstructorEmpty(final String nm)
    {
        final IllegalArgumentException ex;

        ex = assertThrows(IllegalArgumentException.class, () -> new TicTacToePlayer(nm));
        assertThat(ex.getMessage(), equalTo("nm cannot be empty"));
    }

    @Test
    public void badConstructorName()
    {
        badConstructorName("x");
        badConstructorName("o");
        badConstructorName("XO");
        badConstructorName("OX");
        badConstructorName(" X");
        badConstructorName("X ");
        badConstructorName(" O");
        badConstructorName("O ");
        badConstructorName(" X ");
        badConstructorName(" O ");
        badConstructorName("hello, world!");
    }

    private void badConstructorName(final String nm)
    {
        final IllegalArgumentException ex;

        ex = assertThrows(IllegalArgumentException.class, () -> new TicTacToePlayer(nm));
        assertThat(ex.getMessage(), equalTo(String.format("nm must be \"X\" or \"O\" was: \"%s\"", nm)));
    }

    @Test
    public void getName()
    {
        final TicTacToePlayer player1;
        final TicTacToePlayer player2;

        player1 = new TicTacToePlayer("X");
        player2 = new TicTacToePlayer("O");
        assertThat(player1.getName(), equalTo("X"));
        assertThat(player2.getName(), equalTo("O"));
    }
}
