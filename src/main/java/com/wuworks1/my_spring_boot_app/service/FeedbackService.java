package com.wuworks1.my_spring_boot_app.service;

import com.wuworks1.my_spring_boot_app.model.Feedback;
import com.wuworks1.my_spring_boot_app.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public void saveFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);
    }
}
