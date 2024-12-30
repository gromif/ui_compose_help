package com.nevidimka655.compose_help

import kotlinx.serialization.Serializable

@Serializable
data class HelpItem(
    val header: Int,
    val text: Int
)