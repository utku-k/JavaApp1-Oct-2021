package org.csystem.app.service.rest.weather.data.repository;

import org.csystem.app.service.rest.weather.data.entity.PlaceInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlaceInfoRepository extends CrudRepository<PlaceInfo, Integer> {
    //...
}