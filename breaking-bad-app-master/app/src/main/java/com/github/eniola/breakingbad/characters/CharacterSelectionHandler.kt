package com.github.eniola.breakingbad.characters

import com.github.eniola.breakingbad.data.CharacterModel

interface CharacterSelectionHandler {
    fun onCharacterClicked(character: CharacterModel)
}