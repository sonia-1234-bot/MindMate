package com.example.hm2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ChatbotActivity extends AppCompatActivity {

    private TextView chatTextView;
    private EditText userInputEditText;

    private List<String> chatMessages;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

        chatTextView = findViewById(R.id.chatTextView);
        userInputEditText = findViewById(R.id.userInputEditText);

        chatMessages = new ArrayList<>();

        // Start a soothing conversation
        startSoothingConversation();
    }

    // Method to start a soothing conversation
    private void startSoothingConversation() {
        // Welcome message
        addMessageToChat("Hello! I'm here to help you relax and soothe your heart.\n");

        // Array of soothing messages
        String[] soothingMessages = {
                "Take a deep breath in... and out. Feel the tension leaving your body.",
                "Close your eyes and imagine yourself in a peaceful place, surrounded by nature's beauty.",
                "Remember, it's okay to take things slow and take care of yourself.",
                "You're doing great! Remember to be kind to yourself and practice self-love.",
                "Just for today, let go of any worries or stress. Embrace peace and serenity.\n"
        };

        // Add soothing messages to the chat
        for (String message : soothingMessages) {
            addMessageToChat(message);
        }
    }

    // Method to add a message to the chat
    private void addMessageToChat(String message) {
        chatMessages.add(message);
        updateChatView();
    }

    // Method to update the chat view
    private void updateChatView() {
        StringBuilder chatText = new StringBuilder();
        for (String message : chatMessages) {
            chatText.append(message).append("\n");
        }
        chatTextView.setText(chatText.toString());
    }

    // Method to handle user input
    private void handleUserInput(String userInput) {
        // Example: If user asks "How do I relax?", respond with a relaxation tip
        if (userInput.contains("relax") || userInput.contains("calm")) {
            addMessageToChat("You can try deep breathing exercises or listening to calming music.\n");
        }
        else if (userInput.contains("Hi") || userInput.contains("Hello")) {
            addMessageToChat(" Hi there! How are you doing today?\n");
        }
        else if (userInput.contains("down") || userInput.contains("shake")) {
            addMessageToChat(" I'm sorry to hear that. Sometimes talking about what's bothering you can help. Would you like to tell me more about what's on your mind?\n");
        }
        else if (userInput.contains("find") || userInput.contains("joy")) {
            addMessageToChat(" It sounds like you're going through a tough time. Is there anything specific that's been weighing on you lately?\n");
        }
        else if (userInput.contains("alone") || userInput.contains("understands")) {
            addMessageToChat(" You're not alone. Even though I'm just a chatbot, I'm here to listen and offer support. And there are people in your life who care about you too. Have you considered reaching out to someone close to you?\n");
        }
        else if (userInput.contains("tired") && userInput.contains("feeling")) {
            addMessageToChat(" It's understandable to feel exhausted when you're dealing with depression. Have you thought about talking to a professional about how you're feeling? They can offer strategies and support to help you cope.\n" );
        }
        else if (userInput.contains("point") || userInput.contains("anything")) {
            addMessageToChat(" It's common to feel that way when you're struggling with depression. But there are things worth living for, even if it's hard to see them right now. What are some things that used to bring you joy or fulfillment?\n");
        }
        else if (userInput.contains("energy") || userInput.contains("do anything")) {
            addMessageToChat(" Depression can make even simple tasks feel overwhelming. It's important to be gentle with yourself and take things one step at a time. Is there anything small you can do today to take care of yourself?\n");
        }
        else if (userInput.contains("stop") && userInput.contains("feeling")) {
            addMessageToChat("  I understand how difficult it can be to live with depression. It's important to keep seeking support and trying different strategies until you find what works for you. You're not alone, and there is hope for feeling better.\n");
        }
        else if (userInput.contains("break") || userInput.contains("fun")) {
            addMessageToChat(" Hi there! I could really use a break from all the heaviness. Got anything fun or light-hearted to chat about?\n");
        }
        else if (userInput.contains("recommend") || userInput.contains("refreshing places")) {
            addMessageToChat(" Absolutely! When it comes to refreshing places to clear your mind, there are plenty of options. How about exploring a nearby botanical garden? It's a tranquil oasis filled with beautiful plants and serene paths, perfect for finding some peace and quiet.\n");
        }
        else if (userInput.contains("Thanks") || userInput.contains("chat")) {
            addMessageToChat(" Anytime! I'm always here for a mental escape and some pie cravings. Let's do this again soon!\n");
        }
        else {
            addMessageToChat("I'm sorry, I'm not sure how to respond to that.\n");
        }
    }

    // Method to handle send button click event
    public void onSendButtonClick(View view) {
        String userInput = userInputEditText.getText().toString().trim();
        if (!userInput.isEmpty()) {
            addMessageToChat("You: " + userInput);
            handleUserInput(userInput);
            userInputEditText.setText("");
        }
    }
}
