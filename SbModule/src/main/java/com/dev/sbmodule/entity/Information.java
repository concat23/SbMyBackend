package com.dev.sbmodule.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "information")
public class Information extends BasicEntity{

    private String subject;
    private String content;

    @Builder
    public Information(String subject, String content) {
        this.subject = subject;
        this.content = content;
    }
}
