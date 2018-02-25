package edu.wzm.controller

import edu.wzm.service.OrderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RequestParam, RestController}

/**
  * Created by gatsbynewton on 2017/10/21.
  */
@RestController
@RequestMapping(Array("/order"))
class OrderController {

    @Autowired
    var orderService: OrderService = _

    @RequestMapping(value = Array("/detail"), method = Array(RequestMethod.GET), produces = Array("application/json;charset=UTF-8"))
    def findDetail(): String = orderService.findOrderDetail().toString
}
