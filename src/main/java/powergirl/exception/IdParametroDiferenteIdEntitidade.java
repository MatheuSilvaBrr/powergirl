package powergirl.exception;

public class IdParametroDiferenteIdEntitidade extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public IdParametroDiferenteIdEntitidade(String msg) {
		super(msg);
	}
	public IdParametroDiferenteIdEntitidade(String msg, Exception cause){
        super(msg, cause);
    }
}
