package clockin.domain.model

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import com.vladmihalcea.hibernate.type.json.JsonType
import org.hibernate.annotations.TypeDef
import org.hibernate.annotations.TypeDefs

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
@TypeDefs(TypeDef(name = "json", typeClass = JsonType::class))
data class Address(
    val number: String,
    val zipCode: String,
    val street: String,
    val complement: String,
    val neighborhood: String
)