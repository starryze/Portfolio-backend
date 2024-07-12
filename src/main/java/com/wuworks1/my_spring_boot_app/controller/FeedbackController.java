package com.wuworks1.my_spring_boot_app.controller;

import com.wuworks1.my_spring_boot_app.model.Feedback;
import com.wuworks1.my_spring_boot_app.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
@CrossOrigin(origins = {"https://wuworks1-7d47439538fc.herokuapp.com/", "http://localhost:5173", "https://wuworks1-7d47439538fc.herokuapp.com/admin"})
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @PostMapping
    public Feedback createFeedback(@RequestBody Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    @GetMapping
    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteFeedback(@PathVariable("id") Long id) {
        feedbackRepository.deleteById(id);
    }
}
