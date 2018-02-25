package edu.wzm.controller

import edu.wzm.entity.City
import edu.wzm.service.CityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.{Page, PageRequest, Pageable, Sort}
import org.springframework.data.web.PageableDefault
import org.springframework.web.bind.annotation.{RequestMapping, RequestParam, RestController}

/**
  * Created by gatsbynewton on 2017/10/21.
  */
@RestController
@RequestMapping(Array("/city"))
class CityController {

    @Autowired
    var cityService: CityService = _

    @RequestMapping(value = Array("/one"), produces = Array("application/json;charset=UTF-8"))
    def selectById(@RequestParam("id") id: Int): String = cityService.selectById(id).toString

    @RequestMapping(value = Array("/all"), produces = Array("application/json;charset=UTF-8"))
    def selectAll(): AnyRef = cityService.selectAll()

    @RequestMapping(value = Array("/page"), produces = Array("application/json;charset=UTF-8"))
    def findWithDefaultValue(@PageableDefault(value = 1, size = 1, sort = Array("id"),
        direction = Sort.Direction.DESC) pageable: Pageable): Page[City] = {
        cityService.findAll(pageable)
    }

    @RequestMapping(value = Array("/pageable"), produces = Array("application/json;charset=UTF-8"))
    def findWithParams(@RequestParam(value = "page", defaultValue = "0") page: Int,
                  @RequestParam(value = "size", defaultValue = "2") size: Int): Page[City] = {
        val sort = new Sort(Sort.Direction.DESC, "id")
        val pageable = new PageRequest(page, size, sort)
        val country = "Australia"
        cityService.findAllWithCountry(country, pageable)
    }
}
