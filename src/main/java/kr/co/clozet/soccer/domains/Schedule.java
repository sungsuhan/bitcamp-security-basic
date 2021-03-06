package kr.co.clozet.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName:kr.co.clozet.soccer.domains
 * fileName        :Schedule.java
 * author          : sungsuhan
 * date            :2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09           sungsuhan      최초 생성
 **/
@Data
@Component
@Entity
@Table(name="schedules")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stadiumId;
    private String scheDate;
    private String gubun;
    @Column(nullable = false) private String homeTeamId;
    private String awayTeamId;
    private String homeScore;
    private String awayScore;

}
