package clockin.adapter.input.api.output.entity

import javax.persistence.*

@Entity
@Table(name = "speciality")
data class SpecialityEntity(
    @Id
    @Column(name="name")
    val name: String
)