package com.kafka.demo.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {


    private Integer bookId;
    private String bookName;
    private String bookAuthor;
}
