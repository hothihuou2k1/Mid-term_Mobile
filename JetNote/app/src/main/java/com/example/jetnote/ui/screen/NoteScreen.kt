package com.example.jetnote.ui.screen

import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetnote.JetNotesApplication
import com.example.jetnote.domain.model.NoteModel
import com.example.jetnote.routing.Screen
import com.example.jetnote.ui.components.TopAppBar
import com.example.jetnote.viewmodel.MainViewModel
import kotlinx.coroutines.launch

@Composable

fun NoteScreen(viewModel: MainViewModel){
//    val notes:List<NoteModel> by viewModel
//        .notesNotInTrash
//        .observerveAsState(listOf())

    val scaffoldState:ScaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        topBar = {
            TopAppBar(
                title = "JetNotes",
                icon = Icons.Filled.List,
                onIconClick = {
                coroutineScope.launch {
                    scaffoldState.drawerState.open()
                }
            }
            )
        },
        scaffoldState = scaffoldState,
        drawerContent = {}
    ) {}
}


@Composable
private fun NotesList(
    notes:List<NoteModel>,
    onNoteCheckedChange:(NoteModel)->Unit,
    onNoteClick:(NoteModel)->Unit
){}

@Preview
@Composable

private fun NotesListPreview(){
        NotesList(
        notes = listOf(
            NoteModel(1,"Note 1", "Content 1", null),
            NoteModel(2,"Note 3", "Content 2", false),
            NoteModel(3,"Note 3", "Content 3", true),
        ),
        onNoteCheckedChange = {},
        onNoteClick = {}
    )
}


