import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Creates a web server to allow users to fetch HTTP headers for a URL.
 */
public class HeaderServer {

	/**
	 * Starts a Jetty server on port 8080, and maps /check requests to the
	 * {@link HeaderServlet}.
	 *
	 * @param args - unused
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * Servlet to GET handle requests to /check.
	 */
	public static class HeaderServlet extends HttpServlet {

		/** ID used for serialization, which we are not using. */
		private static final long serialVersionUID = 1L;

		/**
		 * Displays a form where users can enter a URL to check. When the button is
		 * pressed, submits the URL back to /check as a GET request.
		 *
		 * If a URL was included as a parameter in the GET request, fetch and display
		 * the HTTP headers of that URL.
		 */
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

			// TODO
			throw new UnsupportedOperationException("Not yet implemented");

		}
	}
}
