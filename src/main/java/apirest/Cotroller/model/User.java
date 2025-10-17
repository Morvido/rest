package apirest.Cotroller.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data  // genera getters, setters, equals, hashCode y toString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    // Getters y setters
}
