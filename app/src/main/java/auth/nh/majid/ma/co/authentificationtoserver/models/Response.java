package auth.nh.majid.ma.co.authentificationtoserver.models;

/**
 * Created by Majid on 19/09/2016.
 */
public class Response {

    private boolean reponse;
    private String message;

    public boolean isReponse() {
        return reponse;
    }

    public void setReponse(boolean reponse) {
        this.reponse = reponse;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
