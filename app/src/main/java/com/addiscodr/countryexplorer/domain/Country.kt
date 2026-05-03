package com.addiscodr.countryexplorer.domain

data class Country(
    val name: String,
    val officialName: String,
    val code: String,
    val continent: String,
    val subregion: String?,
    val flagUrl: String,
    val capital: String?,
    val population: Long,
    val area: Double,
    val languages: List<String>
)
