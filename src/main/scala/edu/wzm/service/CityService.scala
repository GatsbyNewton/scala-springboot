package edu.wzm.service

import java.util.{ArrayList, List => JList}

import edu.wzm.entity.City
import edu.wzm.repository.CityRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.{Page, Pageable}
import org.springframework.stereotype.Service

/**
  * Created by gatsbynewton on 2017/10/21.
  */
@Service
class CityService {

    @Autowired
    var cityRepository: CityRepository = _

    def selectById(id: Int): City = cityRepository.selectById(id)

    def save(city: City): Unit = {
        val cities = new ArrayList[City]()
        cityRepository.save(cities)
    }

    def findAllWithCountry(country: String, pageable: Pageable): Page[City] = {
//        cityRepository.findAll(new Specification[City](){
//            override def toPredicate(root: Root[City], criteriaQuery: CriteriaQuery[_], criteriaBuilder: CriteriaBuilder): Predicate = {
//                val p1 = criteriaBuilder.equal(root.get("country").as(classOf[String]), country)
//                criteriaQuery.where(criteriaBuilder.and(p1))
//                criteriaQuery.getRestriction()
//            }
//        }, pageable)
        null
    }

    def selectAll(): JList[City] = cityRepository.selectAll()

    def findAll(pageable: Pageable): Page[City] = cityRepository.findAll(pageable)
}
