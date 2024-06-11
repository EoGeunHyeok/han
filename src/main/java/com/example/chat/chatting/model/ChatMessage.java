package com.example.chat.chatting.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chat_message")
@Data
public class ChatMessage {
    @Id  // This annotation marks the below field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // This strategy generates a unique value automatically
    private Long id;  // Primary key field

    public enum MessageType {
        ENTER, TALK, MATCH_REQUEST, EXIT, MATCH, IMAGE, VIDEO
    }
    private MessageType type;
    private String roomId;
    private String sender;
    private String message;
    @Column(name = "timestamp")
    private String timestamp;
}
