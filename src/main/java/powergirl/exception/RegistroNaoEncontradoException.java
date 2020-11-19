package powergirl.exception;

public class RegistroNaoEncontradoException extends RuntimeException  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public RegistroNaoEncontradoException(String msg) {
		super(msg);
	}
	public RegistroNaoEncontradoException(String msg, Exception cause){
        super(msg, cause);
    }

}
