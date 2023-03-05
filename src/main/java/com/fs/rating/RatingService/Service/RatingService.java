package com.fs.rating.RatingService.Service;

import com.fs.rating.RatingService.Entity.Rating;

import java.util.List;

public interface RatingService
{
    public Rating createRating(Rating rating);

    public Rating getRatingById(String ratingId);

    public List<Rating> getAllRating();

    public List<Rating> getRatingByHotelId(String hotelId);

    public List<Rating> getRatingByUserId(String userId);
}
