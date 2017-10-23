package edu.wzm.controller

import edu.wzm.service.HotelService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RequestParam, RestController}

/**
  * Created by gatsbynewton on 2017/10/21.
  */
@RestController
@RequestMapping(Array("/hotel"))
class HotelController {

    @Autowired
    var hotelService: HotelService = _

    @RequestMapping(value = Array("/one"), produces = Array("application/json;charset=UTF-8"))
    def selectById(@RequestParam("id") id: Int): String = hotelService.selectById(id).toString
}
