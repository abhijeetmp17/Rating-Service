package com.fs.rating.RatingService.Controller;

import com.fs.rating.RatingService.Entity.Rating;
import com.fs.rating.RatingService.Service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController
{
    @Autowired
    private RatingService ratingService;

    @PostMapping("/create")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));
    }

    @GetMapping("/ratings/{ratingId}")
    public ResponseEntity<Rating> getByRatingId(@PathVariable String ratingId)
    {
        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingById(ratingId));
    }

    @GetMapping("/ratings/user/{userId}")
    public ResponseEntity<List<Rating>> getByUserId(@PathVariable String userId)
    {
        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingByUserId(userId));
    }

    @GetMapping("/ratings/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getByHotelId(@PathVariable String hotelId)
    {
        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingByHotelId(hotelId));
    }

    @GetMapping("/ratings")
    public ResponseEntity<List<Rating>> getALlRatings()
    {
        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getAllRating());
    }



}
