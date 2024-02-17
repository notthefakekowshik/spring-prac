import org.springframework.beans.factory.annotation.Value;

public class DBConnection {

	@Value("${db.username}")
	private String username;
	private String password;
	private String url;
	private String driver;
}
