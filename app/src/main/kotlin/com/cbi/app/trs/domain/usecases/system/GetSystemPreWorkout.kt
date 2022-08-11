package com.cbi.app.trs.domain.usecases.system

import com.cbi.app.trs.core.interactor.UseCase
import com.cbi.app.trs.data.entities.SystemData
import com.cbi.app.trs.domain.repositories.SystemDataRepository
import javax.inject.Inject

class GetSystemPreWorkout
@Inject constructor(private val systemDataRepository: SystemDataRepository) : UseCase<List<SystemData.PreWorkout>, Boolean>() {
    override suspend fun run(fromCache: Boolean) = systemDataRepository.getSystemPreWorkout(fromCache)
}