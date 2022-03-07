package com.github.eniola.breakingbad.filter

class AppearanceFilterModel(
    val season: Int,
    val checked: Boolean = false
) {
    val text
        get() = "Season $season"
}