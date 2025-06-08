package interfaz;

public class APIDeGoogle {
	public IniciarSesin _iniciarSesin;
	public IniciarsesinconGoogle _iniciarsesinconGoogle;
	
	
	
	 private final String clientId = "642402904207-ond1hkr3i2i5cte87rk0ghakli6dgdm1.apps.googleusercontent.com";
	    private final String clientSecret = "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";
	    private final String redirectUri = "http://localhost:8081/oauth2callback";

	    public String buildAuthUrl() {
	        return "https://accounts.google.com/o/oauth2/v2/auth"
	            + "?scope=openid%20email%20profile"
	            + "&access_type=online"
	            + "&response_type=code"
	            + "&client_id=" + clientId
	            + "&redirect_uri=" + redirectUri;
	    }

	    public String getRedirectUri() {
	        return redirectUri;
	    }
	
	
}