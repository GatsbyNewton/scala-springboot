package edu.wzm.service

import edu.wzm.entity.Hotel
import edu.wzm.repository.HotelRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
  * Created by gatsbynewton on 2017/10/21.
  */
@Service
class HotelService {

    @Autowired
    var hotelRepository: HotelRepository = _

    def selectById(id: Int): Hotel = hotelRepository.selectById(id)
}
