package com.cbi.app.trs.domain.usecases.workout

import com.cbi.app.trs.core.exception.Failure
import com.cbi.app.trs.core.functional.Either
import com.cbi.app.trs.core.interactor.UseCase
import com.cbi.app.trs.domain.entities.workout.WorkoutEntity
import com.cbi.app.trs.domain.repositories.WorkoutRepository
import com.cbi.app.trs.domain.usecases.PagingParam
import javax.inject.Inject

class GetWorkoutPrePost
@Inject constructor(private val workoutRepository: WorkoutRepository) : UseCase<WorkoutEntity.Data, Pair<Int, PagingParam>>() {
    override suspend fun run(params: Pair<Int, PagingParam>): Either<Failure, WorkoutEntity.Data> {
        val queries = params.second
        return workoutRepository.getWorkoutPrePost(params.first, queries.limit, queries.page)
    }

}