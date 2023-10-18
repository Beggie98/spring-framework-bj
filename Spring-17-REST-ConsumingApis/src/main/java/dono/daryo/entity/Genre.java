package dono.daryo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Genre extends BaseEntity {

    private String name;

    @ManyToMany(mappedBy = "genreList")
    @JsonIgnore
    private List<Movie> movieList;

}
