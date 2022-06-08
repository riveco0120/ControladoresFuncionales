package com.sofka.demoControladoressFuncionales.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class DatoDTO {

    private String id;
    @NotBlank
    private String informacion;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatoDTO datoDTO = (DatoDTO) o;
        return Objects.equals(id, datoDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "DatoDTO{" +
                "id='" + id + '\'' +
                ", informacion='" + informacion + '\'' +
                '}';
    }

}
