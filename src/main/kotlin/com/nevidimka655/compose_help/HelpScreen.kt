package com.nevidimka655.compose_help

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.rememberNestedScrollInteropConnection
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.nevidimka655.ui.compose_core.PreferencesGroupTitle
import com.nevidimka655.ui.compose_core.theme.spaces

@Composable
fun HelpScreen(list: List<Int>) = LazyColumn(
    modifier = Modifier
        .fillMaxSize()
        .nestedScroll(rememberNestedScrollInteropConnection()),
    verticalArrangement = Arrangement.spacedBy(MaterialTheme.spaces.spaceMedium),
    contentPadding = PaddingValues(MaterialTheme.spaces.spaceMedium)
) {
    items(list.size) {
        val textId = list[it]
        if (it % 2 == 0) HelpHeaderText(textId)
        else HelpText(textId)
    }
}

@Preview
@Composable
private fun HelpText(textId: Int = 0) = SelectionContainer {
    Text(
        text = stringResource(id = textId),
        color = MaterialTheme.colorScheme.onSurface
    )
}

@Preview
@Composable
private fun HelpHeaderText(textId: Int = 0) =
    PreferencesGroupTitle(text = stringResource(id = textId))