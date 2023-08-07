package clockin.adapter.input.api.output.entity

import com.vladmihalcea.hibernate.type.json.JsonType
import org.hibernate.annotations.*
import clockin.domain.model.Address
import java.time.LocalDateTime
import javax.persistence.*
import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "doctor")
@TypeDefs(TypeDef(name = "json", typeClass = JsonType::class))
data class DoctorEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "name", nullable = false)
    val name: String,

    @Column(name = "average_price")
    val averagePrice: Double? = null,

    @Column(name = "specialities")
    @ManyToMany(fetch = FetchType.LAZY, cascade = [CascadeType.REFRESH])
    @JoinTable(
        name = "doctor_specialities",
        joinColumns = [
            JoinColumn(name = "doctor_id", referencedColumnName = "id")
        ],
        inverseJoinColumns = [
            JoinColumn(name = "speciality_name", referencedColumnName = "name")
        ]
    )
    val specialities: Set<SpecialityEntity>? = null,

    @Column(name = "addresses", columnDefinition = "json")
    @Type(type = "json")
    val addresses: List<Address>? = null,

    @CreationTimestamp
    @Column(name = "created_at")
    val createdAt: LocalDateTime? = null,

    @UpdateTimestamp
    @Column(name = "updated_at")
    val updatedAt: LocalDateTime? = null
)
