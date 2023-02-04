package ca.bcit.comp2526.game;

public abstract class Player
{
    private final String name;

    protected Player(final String nm)
    {
        final String stripped;

        if(nm == null)
        {
            throw new IllegalArgumentException("nm cannot be null");
        }

        stripped = nm.strip();

        if(stripped.length() == 0)
        {
            throw new IllegalArgumentException("nm cannot be empty");
        }

        name = nm;
    }

    public String getName()
    {
        return name;
    }
}
