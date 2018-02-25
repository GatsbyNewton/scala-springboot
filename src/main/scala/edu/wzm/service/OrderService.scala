package edu.wzm.service

import edu.wzm.entity.OrderDetail
import edu.wzm.repository.OrderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import java.util.{List => JList}

/**
  * Created by gatsbynewton on 2017/10/21.
  */
@Service
class OrderService {

    @Autowired
    var orderRepository: OrderRepository = _

    def findOrderDetail(): JList[OrderDetail] = {
        orderRepository.findOrderDetail()
    }
}
