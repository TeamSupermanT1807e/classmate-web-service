package com.app.manager.context.repository;

import com.app.manager.entity.StudentExercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentExerciseRepository extends JpaRepository<StudentExercise, String> {
    Optional<StudentExercise> findFirstByUser_idAndExercise_idAndStatus(String user_id, String exercise_id,
                                                                        StudentExercise.StatusEnum status);
    List<StudentExercise> findAllByExercise_idAndStatus(String exercise_id, StudentExercise.StatusEnum status);
    List<StudentExercise> findAllByUser_idAndStatus(String user_id, StudentExercise.StatusEnum status);
    int countAllByExercise_idAndSubmittedEqualsAndStatus(String exercise_id, boolean submitted,
                                                         StudentExercise.StatusEnum status);
    int countAllByExercise_idAndMarkedEqualsAndStatus(String exercise_id, boolean marked,
                                                      StudentExercise.StatusEnum status);
}
