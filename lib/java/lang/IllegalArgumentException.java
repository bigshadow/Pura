package java.lang;

public class IllegalArgumentException extends RuntimeException
{
	public IllegalArgumentException()
	{
		super();
	}

	public IllegalArgumentException( String message )
	{
		super( message );
	}

	public IllegalArgumentException( Throwable cause )
	{
		super( cause );
	}

	public IllegalArgumentException( String message, Throwable cause )
	{
		super( message, cause );
	}
}