package week3.day3A;

public class APIClient {
	
	
	public void sendRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
        // Add your logic for sending a request with only endpoint here
    }

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request Body: " + requestBody);
        System.out.println("Request Status: " + requestStatus);
        // Add your logic for sending a request with endpoint, requestBody, and requestStatus here
    }
	
	public static void main(String[] args) {
		APIClient apiClient = new APIClient();

        // Call the overloaded methods with different sets of input arguments
        apiClient.sendRequest("/api/endpoint");
        apiClient.sendRequest("/api/endpoint2", "Sample Request Body", true);

	}

}
