package com.github.arocketman.resource;

import com.github.arocketman.domain.Sample;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;

@Component
@Path("/sample")
public class SampleResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSampleDomain() {
        Sample sampleDomain = new Sample();
        sampleDomain.setId(112321L);
        sampleDomain.setName("OK");
        sampleDomain.setValue(BigDecimal.ONE);
        return Response.ok(sampleDomain).build();
    }

}
