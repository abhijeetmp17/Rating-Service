package com.fs.rating.RatingService.Repository;

import com.fs.rating.RatingService.Entity.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepo extends MongoRepository<Rating , String>
{
    //find rating by user id custom method

    public List<Rating> findByUserId(String userId);

    //find rating by hotel id custom method

    public List<Rating> findByHotelId(String hotelId);


}
