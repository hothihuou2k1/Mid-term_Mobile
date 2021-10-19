package com.example.jetnote.viewmodel

import androidx.lifecycle.ViewModel
import com.example.jetnote.data.repository.Repository

/**
 * View model used for storing the global app state.
 *
 * This view model is used for all screens.
 */
class MainViewModel(private val repository: Repository) : ViewModel() {

}
