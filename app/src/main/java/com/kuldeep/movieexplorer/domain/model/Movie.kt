package com.kuldeep.movieexplorer.domain.model

/**
 * This data class contains basic information of the movie like id, title and posterUrl
 *
 * @param id int data contains unique movie ID
 * @param title string data contain movie name
 * @param posterUrl string data contains web URL
 */
data class Movie(
    val id: Int,
    val title: String,
    val posterUrl: String
)