package com.example.appfitlife.viewmodel

import androidx.lifecycle.ViewModel
import com.example.appfitlife.model.User
import com.example.appfitlife.repository.UserRepository

class UserViewModel : ViewModel() {
    private val repository = UserRepository()

    fun getUserData(): User {
        return repository.getUser()
    }
}