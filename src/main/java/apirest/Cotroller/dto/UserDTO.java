package apirest.Cotroller.dto;

import lombok.*;

@Data  // genera getters, setters, toString, equals, hashCode
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String name;
    private String email;

    // Getters y setters
}
