package clockin.adapter.output.entity

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import java.time.LocalTime
import javax.persistence.*

@Entity
@Table(name = "job")
data class JobEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "name", nullable = false)
    val name: String,

    @ManyToOne
    @JoinColumn(name = "workplace_id")
    val workplace: WorkplaceEntity,

    @Column(name = "entryTime")
    var entryTime: LocalTime? = null,

    @Column(name = "exitTime")
    var exitTime: LocalTime? = null,

    @CreationTimestamp
    @Column(name = "created_at")
    val createdAt: LocalDateTime? = null,

    @UpdateTimestamp
    @Column(name = "updated_at")
    val updatedAt: LocalDateTime? = null
)