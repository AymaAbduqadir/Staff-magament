import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@GetMapping("/success")
public org.springframework.http.ResponseEntity<String> success() {
    return org.springframework.http.ResponseEntity.ok()
            .header("Custom-Header", "SuccessHeader")
            .body("Request was successful.");
}

@GetMapping("/not-found")
public org.springframework.http.ResponseEntity<String> notFound() {
    return org.springframework.http.ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body("Resource not found.");
}

@PostMapping("/create")
public org.springframework.http.ResponseEntity<String> createResource() {
    URI location = URI.create("/resource/1");
    return org.springframework.http.ResponseEntity.created(location)
            .body("Resource created successfully.");
}

public void main() {
}