package com.geekster.UniversityEventManagement.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int eventId;

    @NotBlank
    @Size(min=1,max = 50)
    private String eventName;

    @NotBlank
    @Size(min = 1, max = 50)
    private String locationOfEvent;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDate date;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="HH:mm:ss")
    private String startTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="HH:mm:ss")
    private LocalTime endTime;
}
