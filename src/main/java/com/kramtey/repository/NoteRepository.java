package com.kramtey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kramtey.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {

}
