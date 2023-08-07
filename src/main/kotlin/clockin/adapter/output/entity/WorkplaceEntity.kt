package clockin.adapter.output.entity

import clockin.domain.model.Location
import com.vladmihalcea.hibernate.type.json.JsonType
import org.hibernate.annotations.*
import java.time.LocalDateTime
import javax.persistence.*
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "workplace")
@TypeDefs(TypeDef(name = "json", typeClass = JsonType::class))
data class WorkplaceEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "name")
    val name: String,

    @Column(name = "location", columnDefinition = "json")
    @Type(type = "json")
    val location: Location,

    @CreationTimestamp
    @Column(name = "created_at")
    val createdAt: LocalDateTime? = null,

    @UpdateTimestamp
    @Column(name = "updated_at")
    val updatedAt: LocalDateTime? = null
)