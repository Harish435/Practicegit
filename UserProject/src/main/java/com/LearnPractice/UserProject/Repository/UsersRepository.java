package com.LearnPractice.UserProject.Repository;

import com.LearnPractice.UserProject.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Long> {
}
