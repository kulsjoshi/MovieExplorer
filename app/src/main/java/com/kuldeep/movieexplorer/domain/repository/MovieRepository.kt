package com.kuldeep.movieexplorer.domain.repository

import com.kuldeep.movieexplorer.domain.model.Movie
import kotlinx.coroutines.flow.Flow

/**
 * Interface for the Movie data
 */
interface MovieRepository {
    fun getTrendingMovie(): Flow<List<Movie>>
}