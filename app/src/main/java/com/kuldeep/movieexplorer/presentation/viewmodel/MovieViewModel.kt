package com.kuldeep.movieexplorer.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kuldeep.movieexplorer.domain.model.Movie
import com.kuldeep.movieexplorer.domain.usecase.GetTrendingMoviesUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * @author Kuldeep Joshi
 * ViewModel will help to fetch the movie data from the GetTrendingMoviesUseCase.kt
 *
 * @param getTrendingMoviesUseCase
 */
class MovieViewModel(
    private val getTrendingMoviesUseCase: GetTrendingMoviesUseCase
) : ViewModel() {

    private val _movies = MutableStateFlow<List<Movie>>(emptyList())
    val movies: StateFlow<List<Movie>> = _movies

    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?> = _error

    init {
        fetchMovie()
    }

    //fetch movie data from the GetTrendingMoviesUseCase
    private fun fetchMovie() {
        viewModelScope.launch {
            getTrendingMoviesUseCase()
                .catch { error -> _error.value = error.message }
                .collectLatest { movieList ->
                    _movies.value = movieList
                }
        }
    }
}