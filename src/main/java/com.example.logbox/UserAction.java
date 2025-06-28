//Endpoint

@Entity
@Data
public class UserAction {
    @Id @GeneratedValue
    private Long id;

    private Long userId;
    private String action;
    private LocalDateTime timestamp;
}
