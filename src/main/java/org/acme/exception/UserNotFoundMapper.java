package org.acme.exception;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class UserNotFoundMapper implements ExceptionMapper<UseNotFoundException> {
    @Override
    public Response toResponse(UseNotFoundException e) {
        return Response.status(Response.Status.NOT_FOUND.getStatusCode(), "User not found").build();
    }
}
