package com.crevado.fr.architecturecomponents.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.crevado.fr.architecturecomponents.entity.Note;

import java.util.List;

/**
 * Created by Fazle Rabbi 15,March,2020.
 * ┌────────────────────────────────────────
 * │ Web: https://fr.crevado.com
 * ├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄
 * │ Email: fazle.rabbi.cse@gmail.com
 * └────────────────────────────────────────
 */
@Dao
public interface NoteDao {

    @Insert
    void insert(Note note);

    @Update
    void update(Note note);

    @Delete
    void delete(Note note);

    @Query("DELETE FROM note_table")
    void deleteAllNotes();

    @Query("SELECT * FROM note_table ORDER BY priority DESC")
    LiveData<List<Note>> getAllNotes();
}