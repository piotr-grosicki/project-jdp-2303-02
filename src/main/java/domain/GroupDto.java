package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class GroupDto {

    private Long id;
    private String name;

    public GroupDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}



