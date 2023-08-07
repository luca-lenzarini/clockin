package clockin.adapter.output.entity

import clockin.domain.model.ClockRegistry
import clockin.domain.model.enum.ClockRegistryType
import com.vladmihalcea.hibernate.type.json.JsonType
import org.hibernate.annotations.*
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import javax.persistence.*
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "clockRegistry")
@TypeDefs(TypeDef(name = "json", typeClass = JsonType::class))
data class ClockRegistryEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "type", nullable = false)
    val type: ClockRegistryType,

    @Column(name = "userId")
    val userId: String,

    @Column(name = "location", columnDefinition = "json")
    @Type(type = "json")
    val location: ClockRegistry.Location,

    @Column(name = "date")
    var date: LocalDate? = null,

    @Column(name = "time")
    var time: LocalTime? = null,

    @CreationTimestamp
    @Column(name = "created_at")
    val createdAt: LocalDateTime? = null,

    @UpdateTimestamp
    @Column(name = "updated_at")
    val updatedAt: LocalDateTime? = null
)