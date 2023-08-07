package clockin.domain.model

data class Employee(
    val id: Long,
    val name: String,
    val jobs: List<Job>
)