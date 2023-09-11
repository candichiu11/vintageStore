package org.agoncal.quarkus.microservices.number;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(
                title = "Number MicroService",
                description = "This mircroservice generate book numbers",
                version = "1.0",
                contact = @Contact(name = "Candi's email", email = "candi.chiu.dev@gmail.com")),
        externalDocs = @ExternalDocumentation(url = "https://github.com/candichiu11", description = "All microservice code"),
        tags = {
                @Tag(name = "api", description = "Public api can be used by anybody"),
                @Tag(name = "numbers", description = "Anybody interested in numbers")
        }
)
public class NumberMicroService extends Application {

}
