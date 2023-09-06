package day10;

public class HTTP {
    public static void main(String[] args) {
        /*HTTP is the protocol that governs communications between web-servers and web clients. Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable
         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.
                   Example:
                        if status code = 200
                    output:
                        ok
            NOTE: MUST USE TERNARY.
*/
        int status = 201;

        String statusCode = (status == 200) ? "OK" : (status == 201) ? "Created" : (status == 202) ? "Accepted" : (status == 301) ? "Moved Permanently"
                : (status == 303) ? "See Other" : (status == 304) ? "Not Modified" : (status == 307) ? "Temporary Redirect" : (status == 400) ? "Bad Request"
                : (status == 401) ? "Unauthorized" : (status == 403) ? "Forbidden" : (status == 404) ? "Not Found" : (status == 410) ? "Gone"
                : (500 == status) ? "Internal Server Error" : "Service Unavailable";
        System.out.println(statusCode);
    }
}
