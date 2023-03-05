package com.fs.rating.RatingService.Service.impl;

import com.fs.rating.RatingService.Entity.Rating;
import com.fs.rating.RatingService.Repository.RatingRepo;
import com.fs.rating.RatingService.Service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService
{
    @Autowired
    private RatingRepo ratingRepo;
    @Override
    public Rating createRating(Rating rating) {
        return ratingRepo.save(rating);
    }

    @Override
    public Rating getRatingById(String ratingId) {

        Rating byId = ratingRepo.findById(ratingId).get();
        return byId;
    }

    @Override
    public List<Rating> getAllRating() {
        List<Rating> all = ratingRepo.findAll();
        return all;
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        List<Rating> byHotelId = ratingRepo.findByHotelId(hotelId);
        return byHotelId;
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepo.findByUserId(userId);
    }
}
