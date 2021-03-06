package team.triplog.domain.model

import java.util.*

data class TripModel(
    var id: Int,
    var name: String,
    var startDate: Date,
    var endDate: Date,
    var image: String
) : BaseModel