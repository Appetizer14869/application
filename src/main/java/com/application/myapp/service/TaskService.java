package com.application.myapp.service;

import com.application.myapp.domain.Task;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.application.myapp.domain.Task}.
 */
public interface TaskService {
    /**
     * Save a task.
     *
     * @param task the entity to save.
     * @return the persisted entity.
     */
    Task save(Task task);

    /**
     * Updates a task.
     *
     * @param task the entity to update.
     * @return the persisted entity.
     */
    Task update(Task task);

    /**
     * Partially updates a task.
     *
     * @param task the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Task> partialUpdate(Task task);

    /**
     * Get all the tasks.
     *
     * @return the list of entities.
     */
    List<Task> findAll();

    /**
     * Get the "id" task.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Task> findOne(Long id);

    /**
     * Delete the "id" task.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
