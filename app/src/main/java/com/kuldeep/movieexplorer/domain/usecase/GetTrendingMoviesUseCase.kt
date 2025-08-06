package com.kuldeep.movieexplorer.domain.usecase

import com.kuldeep.movieexplorer.domain.repository.MovieRepository

/**
 * Use case class to get Trending Movie data
 *
 * @param repository
 */
class GetTrendingMoviesUseCase(private val repository: MovieRepository) {

    operator fun invoke() = repository.getTrendingMovie()
}