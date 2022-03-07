package com.github.eniola.breakingbad.navigation

import com.github.eniola.breakingbad.core.livedata.LiveEvent
import com.github.eniola.breakingbad.data.CharacterModel

class Navigator {

    val onNavigateCharacterDetails = LiveEvent<CharacterModel>()

    val onNavigateAppearanceFilter = LiveEvent<Unit>()
}