package model.exceptions;


	public class WithdrawLimitExceededException extends Exception {
	 private static final long serialVersionUID = 1L;

		public WithdrawLimitExceededException(String message) {
	        super(message);
	    }
	}


