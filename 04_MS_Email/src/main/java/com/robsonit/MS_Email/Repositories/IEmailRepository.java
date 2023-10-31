package com.robsonit.MS_Email.Repositories;

import com.robsonit.MS_Email.Models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmailRepository extends JpaRepository<EmailModel, Long> {

}
